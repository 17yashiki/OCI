/**   
  * @Title: RodAndMaterialDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午11:36:35 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import com.oci.domain.RodAndMaterial;
import com.oci.domain.vo.RodAndMaterialVo;

/** 
 * @ClassName: RodAndMaterialDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午11:36:35 
 *  
 */
public interface RodAndMaterialDAO {
	public List<RodAndMaterialVo> findAllRodAndMaterialVo();
	public List<RodAndMaterialVo> findRodAndMaterialVos(Map<String,Object> map);
	public RodAndMaterial findRodAndMaterial(Integer rodMaterialId);
	public RodAndMaterialVo findRodAndMaterialVo(Integer rodMaterialId);
	
	public void updateRodAndMaterial(RodAndMaterial rodAndMaterial);
	public void insertRodAndMaterial(RodAndMaterial rodAndMaterial);
	public void deleteRodAndMaterials(List<Integer> rodMaterialIds);
	public void deleteRodAndMaterial(Integer rodMaterialId);
}
