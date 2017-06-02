/**   
  * @Title: RoleGroupVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午10:39:04 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;


/** 
 * @ClassName: RoleGroupVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午10:39:04 
 *  
 */
public class RoleAndGroupVo implements Serializable {
	
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3127199133820851114L;
	private Integer roleGroupId;
	private RoleForOtherVo role;
	private GroupForOtherVo group;
	public Integer getRoleGroupId() {
		return roleGroupId;
	}
	public void setRoleGroupId(Integer roleGroupId) {
		this.roleGroupId = roleGroupId;
	}
	public RoleForOtherVo getRole() {
		return role;
	}
	public void setRole(RoleForOtherVo role) {
		this.role = role;
	}
	public GroupForOtherVo getGroup() {
		return group;
	}
	public void setGroup(GroupForOtherVo group) {
		this.group = group;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RoleAndGroupVo [roleGroupId=" + roleGroupId + ", role=" + role
				+ ", group=" + group + "]";
	}

	
	

}
