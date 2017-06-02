/**   
  * @Title: GroupSearcher.java 
  * @Package com.oci.domain.sercher 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午4:43:07 
  * @version V1.0   
*/
package com.oci.domain.searcher;

import java.io.Serializable;

/** 
 * @ClassName: GroupSearcher 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午4:43:07 
 *  
 */
public class GroupSearcher implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4336988668998745299L;
	private String groupName;
	private String description;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "GroupSearcher [groupName=" + groupName + ", description="
				+ description + "]";
	}
	
	
	
}
