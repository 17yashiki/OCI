/**   
  * @Title: MaterialForOtherVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午7:30:13 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: MaterialForOtherVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午7:30:13 
 *  
 */
public class MaterialForOtherVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6671077452825190647L;
	private Integer materialId;
	private String materialName;
	private MTForOtherVo materialType;
	public Integer getMaterialId() {
		return materialId;
	}
	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public MTForOtherVo getMaterialType() {
		return materialType;
	}
	public void setMaterialType(MTForOtherVo materialType) {
		this.materialType = materialType;
	}
	@Override
	public String toString() {
		return "MaterialForOtherVo [materialId=" + materialId
				+ ", materialName=" + materialName + ", materialType="
				+ materialType + "]";
	}
	

	
	
	
}
