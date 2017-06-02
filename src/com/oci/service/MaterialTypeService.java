/**   
  * @Title: MaterialTypeService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:56:24 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import com.oci.domain.MaterialType;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialTypeVo;

/** 
 * @ClassName: MaterialTypeService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:56:24 
 *  
 */
public interface MaterialTypeService {
	public List<MaterialTypeVo> findAllMaterialTypeVo();
	public List<MaterialTypeVo> findMaterialTypeVos(MaterialTypeSearcher materialType);
	public MaterialType findMaterialType(Integer typeId);
	public MaterialTypeVo findMaterialTypeVo(Integer typeId);

	public void updateMaterialType(MaterialType materialType);
	public void insertMaterialType(MaterialType materialType);
	public void deleteMaterialTypes(List<Integer> typeIds);
	public void deleteMaterialType(Integer typeId);
}
