/**   
  * @Title: GroupVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午10:11:06 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oci.domain.Role;

/** 
 * @ClassName: GroupVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午10:11:06 
 *  
 */
public class GroupVo implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1443437101887593441L;
	private Integer groupId;
	private String groupName;
	private String description;
	private List<Role> roles=new ArrayList<Role>();
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "GroupVo [groupId=" + groupId + ", groupName=" + groupName
				+ ", description=" + description + ", roles=" + roles + "]";
	}
	


	
	
	
}
