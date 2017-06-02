/**   
  * @Title: ProjectAndType.java 
  * @Package com.oci.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午4:57:48 
  * @version V1.0   
*/
package com.oci.domain;

import java.io.Serializable;

/** 
 * @ClassName: ProjectAndType 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午4:57:48 
 *  
 */
public class ProjectAndType implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 262314950307403600L;
	
	private Integer projectAndTypeId;
	private Integer projectId;
	private Integer projectTypeId;
	public Integer getProjectAndTypeId() {
		return projectAndTypeId;
	}
	public void setProjectAndTypeId(Integer projectAndTypeId) {
		this.projectAndTypeId = projectAndTypeId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getProjectTypeId() {
		return projectTypeId;
	}
	public void setProjectTypeId(Integer projectTypeId) {
		this.projectTypeId = projectTypeId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProjectAndType [projectAndTypeId=" + projectAndTypeId
				+ ", projectId=" + projectId + ", projectTypeId="
				+ projectTypeId + "]";
	}
	
	
	
}
