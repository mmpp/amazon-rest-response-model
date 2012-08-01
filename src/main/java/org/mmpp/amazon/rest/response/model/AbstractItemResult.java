package org.mmpp.amazon.rest.response.model;

/**
 * 検索結果抽象クラス<br>
 * &lt;ItemSearchResponse&gt; <br>
 * 　　&lt;Items&gt; <br>
 * @author wataru
 *
 */
public abstract class AbstractItemResult {
	/**
	 * 検索（抽出）リクエスト
	 */
	private Request _request;
	/**
	 * 検索結果アイテム格納変数
	 */
	private java.util.List<Item> _items;

	/**
	 * デフォルトコンストラクタ
	 */
	public AbstractItemResult(){
		super();
		_items = new java.util.ArrayList<Item>();
	}
	/**
	 * 検索(抽出)リクエストを取得します
	 * @return 検索リクエスト
	 */
	public Request getRequest() {
		return _request;
	}
	/**
	 * 検索(抽出)リクエストを格納します
	 * @param request 検索（抽出）リクエスト
	 */
	public void setRequest(Request request) {
		_request = request;
	}
	/**
	 * 検索結果アイテムを取得します
	 * @return 検索結果アイテム
	 */
	public java.util.List<Item> getItems() {
		return _items;
	}

}
