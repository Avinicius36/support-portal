package com.vinicius.SupportPortalApplication.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000; // 5 days expressed in miliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token Cannot be verfified";
    public static final String GET_ARRAYS_LLC = "Get Arrays, LLC";
    public static final String GET_ARRAYS_ADMINSTATION = "User Management Portal";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCES_DENIED_MESSAGE = "You don't have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    //public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "user/restpassword/**", "/users/image/**" };
    public static final String[] PUBLIC_URLS = {"**" };
}
