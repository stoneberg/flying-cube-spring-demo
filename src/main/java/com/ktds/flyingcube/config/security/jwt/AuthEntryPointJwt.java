package com.ktds.flyingcube.config.security.jwt;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		logger.error("Unauthorized error: {}", authException.getMessage());
		// response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Unauthorized");
		// response.getOutputStream().println("{ \"error\": \"" + authException.getMessage() + "\" }");
		Date date = new Date();
		response.getOutputStream().println("{\n" +
				"    \"success\": false,\n" +
				"    \"message\": \"Invalid Token.\",\n" +
				"    \"code\": \"AE0004\",\n" +
				"    \"path\": \"uri=/api/auth/signin\",\n" +
				"}");
	}

}
