/**   
  * @Title: UserForWordVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午2:10:37 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: UserForWordVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午2:10:37 
 *  
 */
public class UserForWordVo implements Serializable{
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4021581496809572129L;
	private Integer userId;
	private String userRealname;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserRealname() {
		return userRealname;
	}
	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserForWordVo [userId=" + userId + ", userRealname="
				+ userRealname + "]";
	}
	
	
}
