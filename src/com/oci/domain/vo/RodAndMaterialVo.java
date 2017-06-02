/**   
  * @Title: RodAndMaterialVo.java 
  * @Package com.oci.domain.vo 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午7:18:02 
  * @version V1.0   
*/
package com.oci.domain.vo;

import java.io.Serializable;

/** 
 * @ClassName: RodAndMaterialVo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午7:18:02 
 *  
 */
public class RodAndMaterialVo implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -665119607424528864L;
	private Integer rodMaterialId;
	private RodForOtherVo rod;
	private MaterialForOtherVo material;
	private Integer materialNum;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	public Integer getRodMaterialId() {
		return rodMaterialId;
	}
	public void setRodMaterialId(Integer rodMaterialId) {
		this.rodMaterialId = rodMaterialId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public Integer getMaterialNum() {
		return materialNum;
	}
	public void setMaterialNum(Integer materialNum) {
		this.materialNum = materialNum;
	}
	public RodForOtherVo getRod() {
		return rod;
	}
	public void setRod(RodForOtherVo rod) {
		this.rod = rod;
	}
	public MaterialForOtherVo getMaterial() {
		return material;
	}
	public void setMaterial(MaterialForOtherVo material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "RodAndMaterialVo [rodMaterialId=" + rodMaterialId + ", rod="
				+ rod + ", material=" + material + ", materialNum="
				+ materialNum + ", reserve1=" + reserve1 + ", reserve2="
				+ reserve2 + ", reserve3=" + reserve3 + "]";
	}
	

	
	
}
