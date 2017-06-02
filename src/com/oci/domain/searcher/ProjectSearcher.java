/**   
  * @Title: ProjectSearcher.java 
  * @Package com.oci.domain.searcher 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午8:49:09 
  * @version V1.0   
*/
package com.oci.domain.searcher;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: ProjectSearcher 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午8:49:09 
 *  
 */
public class ProjectSearcher implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 453506684251715380L;
	private String projectName;
	private Date projectTime;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Date getProjectTime() {
		return projectTime;
	}
	public void setProjectTime(Date projectTime) {
		this.projectTime = projectTime;
	}
	public String getReserve1() {
		return reserve1;
	}
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getReserve3() {
		return reserve3;
	}
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProjectSearcher [projectName=" + projectName + ", projectTime="
				+ projectTime + ", reserve1=" + reserve1 + ", reserve2="
				+ reserve2 + ", reserve3=" + reserve3 + "]";
	}
	
	

}
