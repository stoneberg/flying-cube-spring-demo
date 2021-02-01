package com.ktds.flyingcube.biz.auth.dto;

import lombok.Data;

public class UserRes {

    @Data
    public static class UserDto {
        private String username;
        private String email;
        private String password;
    }
}
