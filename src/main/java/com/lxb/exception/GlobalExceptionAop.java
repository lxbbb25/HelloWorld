package com.lxb.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionAop {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public String runtimeException() {
		return "global exception here!, 相当于手写AOP捕获异常";
	}
}
