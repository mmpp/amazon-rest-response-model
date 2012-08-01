package org.mmpp.amazon.rest.response.model;

import java.util.List;

public class Item {

	private String _asin ;
	private String _detailPageURL ;
	private List<ItemAttribute> _itemAttributes;
	private List<ItemLink> _itemLinks;
	
	public Item(){
		super();
		_itemAttributes = new java.util.LinkedList<ItemAttribute>();
		_itemLinks = new java.util.LinkedList<ItemLink>();
		
	}
	public String getASIN() {
		return _asin;
	}

	public String getDetailPageURL() {
		return _detailPageURL;
	}

	public java.util.List<ItemLink> getItemLinks() {
		return _itemLinks;
	}

	public List<ItemAttribute> getItemAttributes() {
		return _itemAttributes;
	}

	public void setASIN(String value) {
		_asin = value;		
	}
	public void setDetailPageURL(String url) {
		_detailPageURL = url;
	}

}
