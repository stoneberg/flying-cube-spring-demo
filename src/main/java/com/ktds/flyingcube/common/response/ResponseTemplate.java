package com.ktds.flyingcube.common.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate<T> extends BaseResponse {

	private T data;

	public static <T> ResponseTemplate<T> ok(T data) {
		ResponseTemplate<T> response = new ResponseTemplate<>();
		response.setData(data);
		response.setMessage("success");
		response.setStatus(HttpStatus.OK);
		return response;
	}

	public static <T> ResponseTemplate<T> ok(T data, String message) {
		ResponseTemplate<T> response = new ResponseTemplate<>();
		response.setData(data);
		response.setMessage(message);
		response.setStatus(HttpStatus.OK);
		return response;
	}
	
}

