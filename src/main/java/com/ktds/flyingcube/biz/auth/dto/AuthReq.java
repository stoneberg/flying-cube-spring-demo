package com.ktds.flyingcube.biz.auth.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

public class AuthReq {

    @Data
    public static class LoginDto {
        @NotBlank
        private String username;

        @NotBlank
        private String password;
    }
}
