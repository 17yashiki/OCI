/**   
  * @Title: ProjectAndTypeSearcher.java 
  * @Package com.oci.domain.searcher 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月2日 下午5:08:59 
  * @version V1.0   
*/
package com.oci.domain.searcher;

import java.io.Serializable;

/** 
 * @ClassName: ProjectAndTypeSearcher 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月2日 下午5:08:59 
 *  
 */
public class ProjectAndTypeSearcher implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4933587208001085366L;
	private String projectName;
	private String projectTypeName;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectTypeName() {
		return projectTypeName;
	}
	public void setProjectTypeName(String projectTypeName) {
		this.projectTypeName = projectTypeName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProjectAndTypeSearcher [projectName=" + projectName
				+ ", projectTypeName=" + projectTypeName + "]";
	}

}
