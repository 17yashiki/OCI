/**   
  * @Title: MaterialTypeMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午9:18:19 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;

import com.oci.domain.MaterialType;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MTForOtherVo;
import com.oci.domain.vo.MaterialTypeVo;

/** 
 * @ClassName: MaterialTypeMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午9:18:19 
 *  
 */
public interface MaterialTypeMapper {
	public List<MaterialTypeVo> findAllMaterialTypeVo();
	public List<MaterialTypeVo> findMaterialTypeVos(MaterialTypeSearcher materialType);
	public MaterialType findMaterialType(Integer typeId);
	public MaterialTypeVo findMaterialTypeVo(Integer typeId);
	public MTForOtherVo findMTForOtherVo(Integer typeId);
	
	public void updateMaterialType(MaterialType materialType);
	public void insertMaterialType(MaterialType materialType);
	public void deleteMaterialTypes(List<Integer> typeIds);
	public void deleteMaterialType(Integer typeId);
}
