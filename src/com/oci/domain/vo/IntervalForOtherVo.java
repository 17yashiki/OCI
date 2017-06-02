/**   
  * @Title: IntervalForOtherVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月26日 下午12:13:51 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: IntervalForOtherVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月26日 下午12:13:51 
 *  
 */
public class IntervalForOtherVo implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8476064329803563598L;
	
	private Integer intervalId;
	private String intervalName;
	private ProjectForOtherVo project;
	
	
	public Integer getIntervalId() {
		return intervalId;
	}
	public void setIntervalId(Integer intervalId) {
		this.intervalId = intervalId;
	}
	public String getIntervalName() {
		return intervalName;
	}
	public void setIntervalName(String intervalName) {
		this.intervalName = intervalName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ProjectForOtherVo getProject() {
		return project;
	}
	public void setProject(ProjectForOtherVo project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "IntervalForOtherVo [intervalId=" + intervalId
				+ ", intervalName=" + intervalName + ", project=" + project
				+ "]";
	}
	
	
	
	
}
