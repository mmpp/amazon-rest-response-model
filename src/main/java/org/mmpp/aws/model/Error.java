package org.mmpp.aws.model;

public class Error {
	private String _code;
	private String _message;
	public String getCode() {
		return _code;
	}
	public void setCode(String code){
		_code = code;
	}

	public String getMessage() {
		return _message;
	}
	public void setMessage(String message){
		_message = message;
	}
}
