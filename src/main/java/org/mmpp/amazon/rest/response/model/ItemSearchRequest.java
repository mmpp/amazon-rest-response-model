package org.mmpp.amazon.rest.response.model;

/**
 * アイテム検索処理リクエスト<br>
 * &lt;ItemSearchResponse&gt; <br>
 * 　　&lt;Items&gt; <br>
 * 　　　&lt;Request&gt; <br>
 * 　　　　&lt;ItemSearchRequest&gt; <br>
 * @author wataru
 */
public class ItemSearchRequest extends AbstractItemRequest {
	/**
	 * 著者
	 */
	private String _author;
	/**
	 * ページ番号
	 */
	private Integer _itemPage;
	/**
	 * 検索応答グループ?<br>
	 * Small
	 */
	private String _responseGroup;
	/**
	 * 検索グループ
	 */	
	private String _searchIndex;

	public String getAuthor() {
		return _author;
	}

	public Integer getItemPage() {
		return _itemPage;
	}

	public String getResponseGroup() {
		return _responseGroup;
	}

	public String getSearchIndex() {
		return _searchIndex;
	}
	public void setAuthor(String author) {
		_author = author;
	}

	public void setItemPage(Integer itemPage) {
		_itemPage = itemPage;
	}

	public void setResponseGroup(String responseGroup) {
		_responseGroup = responseGroup;
	}

	public void setSearchIndex(String searchIndex) {
		_searchIndex = searchIndex;
	}
}
