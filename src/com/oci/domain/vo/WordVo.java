/**   
  * @Title: WordVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午12:31:33 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: WordVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午12:31:33 
 *  
 */
public class WordVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5592366959060028508L;
	
	private Integer wordId;
	private String wordName;
	private WordTypeVo wordType;
	private String wordTime;
	private UserForWordVo user;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	public Integer getWordId() {
		return wordId;
	}
	public void setWordId(Integer wordId) {
		this.wordId = wordId;
	}
	public String getWordName() {
		return wordName;
	}
	public void setWordName(String wordName) {
		this.wordName = wordName;
	}
	public WordTypeVo getWordType() {
		return wordType;
	}
	public void setWordType(WordTypeVo wordType) {
		this.wordType = wordType;
	}
	public String getWordTime() {
		return wordTime;
	}
	public void setWordTime(String wordTime) {
		this.wordTime = wordTime;
	}
	public UserForWordVo getUser() {
		return user;
	}
	public void setUser(UserForWordVo user) {
		this.user = user;
	}
	public String getReserve1() {
		return reserve1;
	}
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getReserve3() {
		return reserve3;
	}
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "WordVo [wordId=" + wordId + ", wordName=" + wordName
				+ ", wordType=" + wordType + ", wordTime=" + wordTime
				+ ", user=" + user + ", reserve1=" + reserve1 + ", reserve2="
				+ reserve2 + ", reserve3=" + reserve3 + "]";
	}
	
		
	
	
}
