package net.czqu.openimserver.security;

import net.czqu.openimserver.util.jwt.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2022-12-24 15:20
 **/
@Component
public class RedisTokenManager implements TokenManager{
    private RedisTemplate redis;

    private static final int TOKEN_EXPIRES_HOUR = 2;

    @Autowired
    public void setRedis(@Qualifier("redisTemplate") RedisTemplate redis) {
        this.redis = redis;
        //泛型设置成Long后必须更改对应的序列化方案
        redis.setKeySerializer(new JdkSerializationRedisSerializer());
    }

    @Override
    public String createToken(String userName) {
        // 生成token
        String token = JwtTokenUtil.createToken(userName, null);
        //存储到redis并设置过期时间
        redis.boundValueOps(userName).set(token, TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return token;
    }

    @Override
    public boolean checkToken(String token) {
        String userNameFromToken = JwtTokenUtil.getUserNameFromToken(token);
        String tokenCache = (String) redis.boundValueOps(userNameFromToken).get();
        if (token == null || !token.equals(tokenCache)) {
            return false;
        }
        //如果验证成功，说明此用户进行了一次有效操作，延长token的过期时间
        redis.boundValueOps(userNameFromToken).expire(TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return true;
    }

    @Override
    public String getToken(String userName) {
        return (String) redis.boundValueOps(userName).get();
    }

    @Override
    public void deleteToken(String userId) {
        redis.delete(userId);
    }


}
