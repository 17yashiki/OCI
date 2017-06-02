/**   
  * @Title: RoleAndGroupAdd.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月2日 下午1:01:34 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: RoleAndGroupAdd 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月2日 下午1:01:34 
 *  
 */
public class RoleAndGroupAdd implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8778971491011184283L;
	private Integer groupId;
	private List<Integer> roleIds;
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public List<Integer> getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RoleAndGroupAdd [groupId=" + groupId + ", roleIds=" + roleIds
				+ "]";
	}
	
	
	
	
}
