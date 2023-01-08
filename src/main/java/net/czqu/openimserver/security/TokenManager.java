//package net.czqu.openimserver.security;
//
///**
// * @program: Open-IM-Server-In-Java
// * @description:
// * @author: czq
// * @create: 2022-12-24 15:19
// **/
//public interface TokenManager {
//    /**
//     * 创建一个token关联上指定用户
//     *
//     * @param userName 指定用户
//     * @return 生成的token
//     */
//    public String createToken(String userName);
//
//    /**
//     * 检查token是否有效
//     *
//     * @param token
//     * @return 是否有效
//     */
//    public boolean checkToken(String token);
//
//    /**
//     * 从字符串中解析token
//     *
//     * @param userName 加密后的字符串
//     * @return
//     */
//    public String getToken(String userName);
//
//    /**
//     * 清除token
//     *
//     * @param userName 登录用户
//     */
//    public void deleteToken(String userName);
//
//
//}
