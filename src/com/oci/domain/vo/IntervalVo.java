/**   
  * @Title: IntervalVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月26日 下午12:08:30 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: IntervalVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月26日 下午12:08:30 
 *  
 */
public class IntervalVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -9079358585943540590L;
	
	private Integer intervalId;
	private String intervalName;
	private ProjectForOtherVo project;
	private String reserve1;
	private String reserve2;
	private String reserve3;


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
	public ProjectForOtherVo getProject() {
		return project;
	}
	public void setProject(ProjectForOtherVo project) {
		this.project = project;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "IntervalVo [intervalId=" + intervalId + ", intervalName="
				+ intervalName + ", project=" + project + ", reserve1="
				+ reserve1 + ", reserve2=" + reserve2 + ", reserve3="
				+ reserve3 + "]";
	}
	
}
