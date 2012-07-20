package org.mmpp.aws.model;


public class ItemLookupErrorResponse extends AbstractItemResponse{

	private String _requestId;
	private Error _error;
	
	public String getRequestId() {
		return _requestId;
	}
	public void setRequestId(String requestId){
		_requestId = requestId;
	}

	public Error getError() {
		return _error;
	}
	public void setError(Error error){
		_error = error;
	}

}
