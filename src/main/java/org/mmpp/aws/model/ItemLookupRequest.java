package org.mmpp.aws.model;

public class ItemLookupRequest extends AbstractItemRequest{

	private String _itemId;
	private String _idType;
	private String _responseGroup;
	private String _searchIndex;
	private String _variationPage;

	public String getIdType() {
		return _idType;
	}
	public String getItemId() {
		return _itemId;
	}

	public String getResponseGroup() {
		return _responseGroup;
	}

	public String getSearchIndex() {
		return _searchIndex;
	}

	public String getVariationPage() {
		return _variationPage;
	}
	
	public void setIdType(String idType) {
		_idType = idType;
	}

	public void setItemId(String itemId) {
		_itemId = itemId;
	}

	public void setResponseGroup(String responseGroup) {
		_responseGroup = responseGroup;
	}

	public void setSearchIndex(String searchIndex) {
		_searchIndex = searchIndex;
	}

	public void setVariationPage(String variationPage) {
		_variationPage = variationPage;
	}


}
