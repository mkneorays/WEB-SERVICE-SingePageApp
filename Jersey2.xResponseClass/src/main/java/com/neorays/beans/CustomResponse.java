package com.neorays.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class CustomResponse {

	private boolean status;
	private String message;
	private String errorCode;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "GenericResponse [status=" + status + ", message=" + message
				+ ", errorCode=" + errorCode + "]";
	}

	
}