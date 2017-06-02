/**   
  * @Title: ProjectForPPTVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:07:43 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: ProjectForPPTVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:07:43 
 *  
 */
public class ProjectForOtherVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2418072979583125444L;
	
	private Integer projectId;
	private String projectName;
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProjectForPPTVo [projectId=" + projectId + ", projectName="
				+ projectName + "]";
	}
	
	
}
