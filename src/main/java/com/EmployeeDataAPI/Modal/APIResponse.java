package com.EmployeeDataAPI.Modal;

public class APIResponse {
		
	public APIResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	private boolean success;
}
