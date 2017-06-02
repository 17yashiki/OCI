/**   
  * @Title: RodAndProgress.java 
  * @Package com.oci.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午6:24:17 
  * @version V1.0   
*/
package com.oci.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: RodAndProgress 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午6:24:17 
 *  
 */
public class RodAndProgress implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6667784464051287059L;
	private Integer rodAndProgressId;
	private Integer rodId;
	private Integer progressId;
	private Date createDate;
	public Integer getRodAndProgressId() {
		return rodAndProgressId;
	}
	public void setRodAndProgressId(Integer rodAndProgressId) {
		this.rodAndProgressId = rodAndProgressId;
	}
	public Integer getRodId() {
		return rodId;
	}
	public void setRodId(Integer rodId) {
		this.rodId = rodId;
	}
	public Integer getProgressId() {
		return progressId;
	}
	public void setProgressId(Integer progressId) {
		this.progressId = progressId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RodAndProgress [rodAndProgressId=" + rodAndProgressId
				+ ", rodId=" + rodId + ", progressId=" + progressId
				+ ", createDate=" + createDate + "]";
	}
	
	
	
}
