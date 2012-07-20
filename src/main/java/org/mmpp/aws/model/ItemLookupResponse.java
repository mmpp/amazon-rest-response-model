package org.mmpp.aws.model;

/**
 * アイテム抽出応答クラス<br>
 * &lt;ItemLookupResponse&gt; <br>
 * @author wataru
 *
 */
public class ItemLookupResponse extends AbstractItemResponse {
	/**
	 * 検索結果取得します
	 * @return 検索結果
	 */
	@Override
	public ItemLookupResult getItemResult() {
		return (ItemLookupResult)super.getItemResult();
	}
	/**
	 * 検索結果を格納します
	 * @param itemResult 検索結果
	 */
	public void setItemResult(ItemLookupResult itemResult) {
		super.setItemResult(itemResult)	;	
	}

}
