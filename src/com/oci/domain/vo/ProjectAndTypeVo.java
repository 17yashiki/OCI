/**   
  * @Title: ProjectAndTypeVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:00:23 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: ProjectAndTypeVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:00:23 
 *  
 */
public class ProjectAndTypeVo implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1192524609297533931L;
	
	private Integer projectAndTypeId;
	private ProjectForOtherVo project;
	private PTForOtherVo projectType;
	public Integer getProjectAndTypeId() {
		return projectAndTypeId;
	}
	public void setProjectAndTypeId(Integer projectAndTypeId) {
		this.projectAndTypeId = projectAndTypeId;
	}
	public ProjectForOtherVo getProject() {
		return project;
	}
	public void setProject(ProjectForOtherVo project) {
		this.project = project;
	}
	public PTForOtherVo getProjectType() {
		return projectType;
	}
	public void setProjectType(PTForOtherVo projectType) {
		this.projectType = projectType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProjectAndTypeVo [projectAndTypeId=" + projectAndTypeId
				+ ", project=" + project + ", projectType=" + projectType + "]";
	}
	
	
	
	
}
