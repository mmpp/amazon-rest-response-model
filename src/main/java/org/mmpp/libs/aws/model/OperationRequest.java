package org.mmpp.libs.aws.model;

public class OperationRequest {

	private java.util.Map<String, String> _httpHeaders;
	private java.util.Map<String, String> _arguments;
	private String _requestId;
	private String _requestProcessingTime;
	
	public OperationRequest(){
		super();
		_httpHeaders = new java.util.HashMap<String,String>();
		_arguments = new java.util.HashMap<String,String>();
	}
	public java.util.Map<String, String> getHTTPHeaders() {
		return _httpHeaders;
	}

	public java.util.Map<String, String> getArguments() {
		return _arguments;
	}

	public String getRequestId() {
		return _requestId;
	}

	public String getRequestProcessingTime() {
		return _requestProcessingTime;
	}


	public void setRequestId(String requestId) {
		_requestId = requestId;
	}

	public void setRequestProcessingTime(String requestProcessingTime) {
		_requestProcessingTime = requestProcessingTime;
	}

}
