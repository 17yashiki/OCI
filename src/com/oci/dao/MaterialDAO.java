/**   
  * @Title: MaterialDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午11:00:25 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import com.oci.domain.Material;
import com.oci.domain.searcher.MaterialSearcher;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialVo;

/** 
 * @ClassName: MaterialDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午11:00:25 
 *  
 */
public interface MaterialDAO {
	public List<MaterialVo> findAllMaterialVo();
	public List<MaterialVo> findMaterialVos(MaterialSearcher material);
	public Material findMaterial(Integer materialId);
	public MaterialVo findMaterialVo(Integer materialId);
	
	public void updateMaterial(Material material);
	public void insertMaterial(Material material);
	public void deleteMaterials(List<Integer> materialIds);
	public void deleteMaterial(Integer materialId);
}
