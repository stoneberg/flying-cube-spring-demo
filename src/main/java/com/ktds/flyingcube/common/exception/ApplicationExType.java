package com.ktds.flyingcube.common.exception;

import lombok.Getter;

@Getter
public enum ApplicationExType implements BaseExceptionType {
    BAD_REQUEST("AE0001", "요청이 잘못되었습니다."),
    NOT_FOUND("AE0002", "결과가 존재하지 않습니다.");

	private final String code;
    private final String message;

    ApplicationExType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
