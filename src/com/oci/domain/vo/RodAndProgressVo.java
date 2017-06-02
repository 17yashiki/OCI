/**   
  * @Title: RodAndProgressVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午7:02:39 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: RodAndProgressVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午7:02:39 
 *  
 */
public class RodAndProgressVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5073551958119628964L;
	private Integer rodAndProgressId;
	private RodForOtherVo rod;
	private ProgressForOtherVo progress;
	private Date createDate;
	public Integer getRodAndProgressId() {
		return rodAndProgressId;
	}
	public void setRodAndProgressId(Integer rodAndProgressId) {
		this.rodAndProgressId = rodAndProgressId;
	}
	public RodForOtherVo getRod() {
		return rod;
	}
	public void setRod(RodForOtherVo rod) {
		this.rod = rod;
	}
	public ProgressForOtherVo getProgress() {
		return progress;
	}
	public void setProgress(ProgressForOtherVo progress) {
		this.progress = progress;
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
		return "RodAndProgressVo [rodAndProgressId=" + rodAndProgressId
				+ ", rod=" + rod + ", progress=" + progress + ", createDate="
				+ createDate + "]";
	}
	
	
	
	
}
