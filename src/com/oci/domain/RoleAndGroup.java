/**   
  * @Title: RoleGroup.java 
  * @Package com.oci.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午6:52:54 
  * @version V1.0   
*/
package com.oci.domain;

import java.io.Serializable;

/** 
 * @ClassName: RoleGroup 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午6:52:54 
 *  
 */
public class RoleAndGroup implements Serializable {
	
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1223347769490236576L;
	private Integer roleGroupId;
	private Integer roleId;
	private Integer groupId;
	
	public Integer getRoleGroupId() {
		return roleGroupId;
	}
	public void setRoleGroupId(Integer roleGroupId) {
		this.roleGroupId = roleGroupId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	@Override
	public String toString() {
		return "RoleGroup [roleGroupId=" + roleGroupId + ", roleId=" + roleId
				+ ", groupId=" + groupId + "]";
	}

	
	

	
	

}
