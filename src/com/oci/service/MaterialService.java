/**   
  * @Title: MaterialService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:53:45 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;


import com.oci.domain.Material;
import com.oci.domain.searcher.MaterialSearcher;
import com.oci.domain.vo.MaterialVo;

/** 
 * @ClassName: MaterialService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:53:45 
 *  
 */
public interface MaterialService {
	public List<MaterialVo> findAllMaterialVo();
	public List<MaterialVo> findMaterialVos(MaterialSearcher material);
	public Material findMaterial(Integer materialId);
	public MaterialVo findMaterialVo(Integer materialId);
	
	public void updateMaterial(Material material);
	public void insertMaterial(Material material);
	public void deleteMaterials(List<Integer> materialIds);
	public void deleteMaterial(Integer materialId);
}
