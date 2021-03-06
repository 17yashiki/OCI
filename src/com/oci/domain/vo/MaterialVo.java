/**   
  * @Title: MaterialVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午7:24:17 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: MaterialVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午7:24:17 
 *  
 */
public class MaterialVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8471457112191830447L;
	private Integer materialId;
	private String materialName;
	private String materialMake;
	//MaterialVo里面这里需要给MaterialUnit做成枚举型的
	private String materialUnit;
	private MTForOtherVo materialType;
	private String materialModel;
	private String reserve1;
	private String reserve2;
	private String reserve3;
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
	public String getMaterialMake() {
		return materialMake;
	}
	public void setMaterialMake(String materialMake) {
		this.materialMake = materialMake;
	}
	public String getMaterialUnit() {
		return materialUnit;
	}
	public void setMaterialUnit(String materialUnit) {
		this.materialUnit = materialUnit;
	}
	public String getMaterialModel() {
		return materialModel;
	}
	public void setMaterialModel(String materialModel) {
		this.materialModel = materialModel;
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
		return "MaterialVo [materialId=" + materialId + ", materialName="
				+ materialName + ", materialMake=" + materialMake
				+ ", materialUnit=" + materialUnit + ", materialType="
				+ materialType + ", materialModel=" + materialModel
				+ ", reserve1=" + reserve1 + ", reserve2=" + reserve2
				+ ", reserve3=" + reserve3 + "]";
	}

	
}
