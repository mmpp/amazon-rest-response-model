package org.mmpp.libs.aws.model;

/**
 * 著者情報<br>
 * &lt;ItemSearchResponse&gt; <br>
 * 　　&lt;Items&gt; <br>
 * 　　　&lt;Item&gt; <br>
 *  　　　&lt;ItemAttributes&gt; <br>
 * 　 　　　&lt;Author&gt; <br>
 * @author wataru
 *
 */
public class Author extends ItemAttribute{
	/**
	 * 著者名
	 */
	private String _name;
	/**
	 * 著者名を取得します
	 * @return 著者名
	 */
	public String getName() {
		return _name;
	}
	/**
	 * 著者名を格納します
	 * @param name 著者名
	 */
	public void setName(String name) {
		_name = name;
	}

}
