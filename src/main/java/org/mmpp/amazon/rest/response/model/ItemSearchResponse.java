package org.mmpp.amazon.rest.response.model;


/**
 * アイテム検索応答クラス<br>
 * &lt;ItemSearchResponse&gt; <br>
 * @author wataru
 *
 */
public class ItemSearchResponse  extends AbstractItemResponse{
	/**
	 * 検索結果取得します
	 * @return 検索結果
	 */
	@Override
	public ItemSearchResult getItemResult() {
		return (ItemSearchResult)super.getItemResult();
	}
	/**
	 * 検索結果を格納します
	 * @param itemResult 検索結果
	 */
	public void setItemResult(ItemSearchResult itemResult) {
		super.setItemResult(itemResult)	;	
	}

}
