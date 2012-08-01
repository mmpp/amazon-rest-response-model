package org.mmpp.amazon.rest.response.model;

/**
 * アイテム検索結果
 * &lt;ItemSearchResponse&gt; <br>
 * 　　&lt;Items&gt; <br>
 * @author wataru
 */
public class ItemSearchResult extends AbstractItemResult {
	/**
	 * 総ページ数
	 */
	private int _totalPage=0;
	/**
	 * 総検索結果
	 */
	private int _totalResults=0;
	/**
	 * 追加検索URL
	 */
	private String _moreSearchResultsUrl;

	/**
	 * 総ページ数を取得します
	 * @return 総ページ数
	 */
	public int getTotalPage() {
		return _totalPage;
	}
	/**
	 * 総検索結果数を取得します
	 * @return 総検索結果数
	 */
	public int getTotalResult() {
		return _totalResults;
	}
	/**
	 * 追加検索URLを取得します
	 * @return 追加検索URL
	 */
	public String getMoreSearchResultsUrl() {
		return _moreSearchResultsUrl;
	}
	/**
	 * 総ページ数を格納します
	 * @param pagecount 総ページ数
	 */
	public void setTotalPages(int pagecount){
		_totalPage = pagecount;
	}
	/**
	 * 総検索数を格納します
	 * @param results 総検索数
	 */
	public void setTotalResults(int results) {
		_totalResults = results;
	}
	/**
	 * 追加検索URLを格納します
	 * @param url 追加検索URL
	 */
	public void setMoreSearchResultsUrl(String url) {
		_moreSearchResultsUrl = url;
	}

}
