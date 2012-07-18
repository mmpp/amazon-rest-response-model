package org.mmpp.libs.aws.model;

/**
 * 制作者情報<br>
 * &lt;ItemSearchResponse&gt; <br>
 * 　　&lt;Items&gt; <br>
 * 　　　&lt;Item&gt; <br>
 *  　　　&lt;ItemAttributes&gt; <br>
 * 　 　　　&lt;Creator&gt; <br>
 * @author wataru
 */
public class Creator extends ItemAttribute{
	/**
	 * 氏名情報
	 */
	private String _name;
	/**
	 * 役割名
	 */
	private String _role;
	/**
	 * 氏名を取得します
	 * @return 氏名情報
	 */
	public String getName() {
		return _name;
	}
	/**
	 * 氏名を格納します
	 * @param name 氏名
	 */
	public void setName(String name) {
		_name = name;
	}
	/**
	 * 役割名を格納します
	 * @param role 役割名
	 */
	public void setRole(String role){
		_role = role;
	}
	/**
	 * 役割名を取得します
	 * @return 役割名
	 */
	public String getRole() {
		return _role;
	}
}