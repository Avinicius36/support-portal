package com.vinicius.SupportPortalApplication.exception.domain;

public class UsernameExistsException extends Exception{
    public UsernameExistsException(String message) {
        super(message);
    }
}
