package com.hf.util;

public class SystemException extends Exception{
	private int errCode = 0;
	
	/*
	 * errCodes
	 */
	public static int LOGINERR = 1;
	public SystemException(int errCode,String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.errCode = errCode;
	}
}
