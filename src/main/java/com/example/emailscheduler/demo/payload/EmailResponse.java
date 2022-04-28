package com.example.emailscheduler.demo.payload;

public class EmailResponse {
	
	private boolean success;
	
	private String jobId;
	
	private String jobGroup;
	
	private String message;
	
	public EmailResponse(boolean success, String message) {
		this.success=success;
		this.message=message;
	}
	
	public EmailResponse(boolean success, String jobId, String jobGroup, String message) {
		this.success = success;
		this.jobId=jobId;
		this.jobGroup=jobGroup;
		this.message=message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}