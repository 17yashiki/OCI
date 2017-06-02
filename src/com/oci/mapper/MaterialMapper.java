/**   
  * @Title: MaterialMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午10:55:15 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;
import java.util.Map;

import com.oci.domain.Material;
import com.oci.domain.searcher.MaterialSearcher;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialForOtherVo;
import com.oci.domain.vo.MaterialVo;

/** 
 * @ClassName: MaterialMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午10:55:15 
 *  
 */
public interface MaterialMapper {
	public List<MaterialVo> findAllMaterialVo();
	public List<MaterialVo> findMaterialVos(MaterialSearcher material);
	public Material findMaterial(Integer materialId);
	public MaterialVo findMaterialVo(Integer materialId);
	public MaterialForOtherVo findMaterialForOtherVo(Integer materialId);
	public void updateMaterial(Material material);
	public void insertMaterial(Material material);
	public void deleteMaterials(List<Integer> materialIds);
	public void deleteMaterial(Integer materialId);

}
