/**   
  * @Title: RodAndMaterialService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 下午12:05:11 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import com.oci.domain.RodAndMaterial;
import com.oci.domain.vo.RodAndMaterialVo;

/** 
 * @ClassName: RodAndMaterialService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 下午12:05:11 
 *  
 */
public interface RodAndMaterialService {
	public List<RodAndMaterialVo> findAllRodAndMaterialVo();
	public List<RodAndMaterialVo> findRodAndMaterialVos(Map<String,Object> map);
	public RodAndMaterial findRodAndMaterial(Integer rodMaterialId);
	public RodAndMaterialVo findRodAndMaterialVo(Integer rodMaterialId);
	
	public void updateRodAndMaterial(RodAndMaterial rodAndMaterial);
	public void insertRodAndMaterial(RodAndMaterial rodAndMaterial);
	public void deleteRodAndMaterials(List<Integer> rodMaterialIds);
	public void deleteRodAndMaterial(Integer rodMaterialId);
}
