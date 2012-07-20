package org.mmpp.aws.model;

/**
 * アイテム抽出処理リクエスト<br>
 * &lt;ItemSearchResponse&gt; <br>
 * 　　&lt;Items&gt; <br>
 * 　　　&lt;Request&gt; <br>
 * @author wataru-n
 */
public class Request {
	
	private boolean _valid;
	/**
	 * アイテムリクエスト
	 */
	private AbstractItemRequest _itemRequest;
	public boolean isValid() {
		return _valid;
	}
	public void setValid(boolean valid){
		_valid = valid;
	}
	/**
	 * アイテムリクエスト抽出します
	 * @return アイテムリクエスト
	 */
	public AbstractItemRequest getItemRequest(){
		return _itemRequest;
	}
	/**
	 * アイテムリクエストを格納します
	 * @param itemRequest アイテムリクエスト
	 */
	public void setItemRequest(AbstractItemRequest itemRequest){
		_itemRequest = itemRequest;
	}

}
