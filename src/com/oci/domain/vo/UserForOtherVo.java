/**   
  * @Title: UserForOtherVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午3:41:59 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: UserForOtherVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午3:41:59 
 *  
 */
public class UserForOtherVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6497856136206721269L;
	private Integer userId;
	private String userName;
	private String userPassword;
	private GroupForOtherVo group;
	private List<RoleForOtherVo> roles;
	private String userState;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public GroupForOtherVo getGroup() {
		return group;
	}
	public void setGroup(GroupForOtherVo group) {
		this.group = group;
	}
	public List<RoleForOtherVo> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleForOtherVo> roles) {
		this.roles = roles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	@Override
	public String toString() {
		return "UserForOtherVo [userId=" + userId + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", group=" + group
				+ ", roles=" + roles + ", userState=" + userState + "]";
	}

	
	
	
}
