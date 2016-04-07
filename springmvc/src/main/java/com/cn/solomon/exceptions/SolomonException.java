package com.cn.solomon.exceptions;

/**
 * 自定义异常
 * @author solomon
 *
 */
public class SolomonException extends RuntimeException {

	private static final long serialVersionUID = 8049527938655823276L;

	public SolomonException() {
		super();
	}

	public SolomonException(String message) {
		super(message);
	}

	public SolomonException(String message, Throwable cause) {
		super(message, cause);
	}

	public SolomonException(Throwable cause) {
		super(cause);
	}

}
