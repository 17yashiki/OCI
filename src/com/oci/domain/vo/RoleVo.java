/**   
  * @Title: RoleVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午10:14:23 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;


/** 
 * @ClassName: RoleVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午10:14:23 
 *  
 */
public class RoleVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2633610762284356687L;
	private Integer roleId;
	private String roleName;
	private String description;
	private String category;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "RoleVo [roleId=" + roleId + ", roleName=" + roleName
				+ ", description=" + description + ", category=" + category
				+ "]";
	}
	
}
