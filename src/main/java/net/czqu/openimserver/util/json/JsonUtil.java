package net.czqu.openimserver.util.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2022-12-24 15:38
 **/
public class JsonUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);
    private static ObjectMapper objectMapper = new ObjectMapper();

    public JsonUtil() {}

    public static String toJsonString(Object o) {
        try {
            return toJsonStringWithException(o);
        } catch (JsonProcessingException var2) {
            LOGGER.warn("序列化发生错误", var2);
            return "";
        }
    }

    public static String toJsonStringWithException(Object o) throws JsonProcessingException {
        return Objects.isNull(o) ? null : objectMapper.writeValueAsString(o);
    }

    public static <T> T parseObject(byte[] body, Class<T> clazz) {
        try {
            return null == body ? null : objectMapper.readValue(body, clazz);
        } catch (IOException var3) {
            LOGGER.warn("序列化发生错误", var3);
            throw getThrowException();
        }
    }

    public static <T> T parseObject(String body, Class<T> clazz) {
        try {
            return null == body ? null : objectMapper.readValue(body, clazz);
        } catch (IOException var3) {
            LOGGER.warn("序列化发生错误", var3);
            throw getThrowException();
        }
    }

    public static <T> T parseObject(byte[] body, final Type type) {
        try {
            return null == body ? null : objectMapper.readValue(body, new TypeReference<T>() {
                public Type getType() {
                    return type;
                }
            });
        } catch (JsonProcessingException var3) {
            LOGGER.warn("序列化发生错误", var3);
            throw getThrowException();
        } catch (IOException var4) {
            LOGGER.warn("数据读取发生错误", var4);
            throw getThrowException();
        }
    }

    public static <T> T parseObject(String body, final Type type) {
        try {
            return null == body ? null : objectMapper.readValue(body, new TypeReference<T>() {
                public Type getType() {
                    return type;
                }
            });
        } catch (JsonProcessingException var3) {
            LOGGER.warn("序列化发生错误", var3);
            throw getThrowException();
        }
    }

    public static <T> List<T> parseArray(String body, Class<T> clazz) {
        try {
            return (List)objectMapper.readValue(body,
                objectMapper.getTypeFactory().constructParametricType(List.class, new Class[] {clazz}));
        } catch (JsonProcessingException var3) {
            LOGGER.warn("序列化发生错误", var3);
            throw getThrowException();
        }
    }

    public static <T> byte[] toJsonBytes(T data) {
        try {
            return null == data ? new byte[0] : objectMapper.writeValueAsBytes(data);
        } catch (JsonProcessingException var2) {
            LOGGER.warn("序列化发生错误", var2);
            throw getThrowException();
        }
    }

    private static boolean blankBody(String body) {
        return null == body || body.length() == 0;
    }

    private static RuntimeException getThrowException() {
        return new RuntimeException("json处理发生异常，请检查数据");
    }

    static {
        // 忽略null打印日志
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }
}
