package org.mmpp.amazon.rest.response.model;

/**
 * アイテム検索結果応答抽象クラス<br>
 * &lt;ItemLookupResponse&gt; <br>
 * &lt;ItemSearchResponse&gt; <br>
 * @author wataru
 *
 */
public abstract class AbstractItemResponse extends AbstractResponse{

	/**
	 * 処理要求
	 */
	private OperationRequest _operationRequest;
	/**
	 * 検索結果
	 */
	private AbstractItemResult _itemResult;
	/**
	 * 処理要求を取得します
	 * @return 処理要求
	 */
	public OperationRequest getOperationRequest() {
		return _operationRequest;
	}
	/**
	 * 処理要求格納する
	 * @param operationRequest 処理要求
	 */
	public void setOperationRequest(OperationRequest operationRequest){
		_operationRequest = operationRequest;
	}
	/**
	 * 検索結果取得します
	 * @return 検索結果
	 */
	public AbstractItemResult getItemResult() {
		return _itemResult;
	}
	/**
	 * 検索結果を格納します
	 * @param itemResult 検索結果
	 */
	public void setItemResult(AbstractItemResult itemResult) {
		_itemResult = itemResult;		
	}

}
