/**   
  * @Title: RobForOtherVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午6:50:55 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: RobForOtherVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午6:50:55 
 *  
 */
public class RodForOtherVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2334891175137784050L;
	private Integer rodId;
	private String rodNo;
	private IntervalForOtherVo interval;
	
	public Integer getRodId() {
		return rodId;
	}
	public void setRodId(Integer rodId) {
		this.rodId = rodId;
	}
	public String getRodNo() {
		return rodNo;
	}
	public void setRodNo(String rodNo) {
		this.rodNo = rodNo;
	}
	public IntervalForOtherVo getInterval() {
		return interval;
	}
	public void setInterval(IntervalForOtherVo interval) {
		this.interval = interval;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RobForOtherVo [rodId=" + rodId + ", rodNo=" + rodNo
				+ ", interval=" + interval + "]";
	}
	
	
	
}
