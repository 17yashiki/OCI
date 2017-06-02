/**   
  * @Title: WordType.java 
  * @Package com.oci.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 上午11:56:46 
  * @version V1.0   
*/
package com.oci.domain;

import java.io.Serializable;

/** 
 * @ClassName: WordType 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 上午11:56:46 
 *  
 */
public class WordType implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5844248085800688697L;

	
	private Integer wordTypeId;
	private String wordTypeName;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	public Integer getWordTypeId() {
		return wordTypeId;
	}
	public void setWordTypeId(Integer wordTypeId) {
		this.wordTypeId = wordTypeId;
	}
	public String getWordTypeName() {
		return wordTypeName;
	}
	public void setWordTypeName(String wordTypeName) {
		this.wordTypeName = wordTypeName;
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
		return "WordType [wordTypeId=" + wordTypeId + ", wordTypeName="
				+ wordTypeName + ", reserve1=" + reserve1 + ", reserve2="
				+ reserve2 + ", reserve3=" + reserve3 + "]";
	}
	
	
	
	
	
}
