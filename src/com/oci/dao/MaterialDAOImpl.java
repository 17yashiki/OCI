/**   
  * @Title: MaterialDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午11:00:53 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Material;
import com.oci.domain.searcher.MaterialSearcher;
import com.oci.domain.vo.MaterialVo;
import com.oci.mapper.MaterialMapper;

/** 
 * @ClassName: MaterialDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午11:00:53 
 *  
 */
@Repository
public class MaterialDAOImpl implements MaterialDAO {
	@Autowired
	private MaterialMapper materialMapper;

	public void setMaterialMapper(MaterialMapper materialMapper) {
		this.materialMapper = materialMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllMaterialVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.MaterialDAO#findAllMaterialVo() 
	*/
	@Override
	public List<MaterialVo> findAllMaterialVo() {
		// TODO Auto-generated method stub
		return materialMapper.findAllMaterialVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.MaterialDAO#findMaterialVos(java.util.Map) 
	*/
	@Override
//	public List<MaterialVo> findMaterialVos(Map<String, Object> map) {
//		// TODO Auto-generated method stub
//		return materialMapper.findMaterialVos(map);
//	}
	
	public List<MaterialVo> findMaterialVos(
			MaterialSearcher material) {
		// TODO Auto-generated method stub
		return materialMapper.findMaterialVos(material);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterial</p> 
	 * <p>Description: </p> 
	 * @param materialId
	 * @return 
	 * @see com.oci.dao.MaterialDAO#findMaterial(java.lang.Integer) 
	*/
	@Override
	public Material findMaterial(Integer materialId) {
		// TODO Auto-generated method stub
		return materialMapper.findMaterial(materialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialVo</p> 
	 * <p>Description: </p> 
	 * @param materialId
	 * @return 
	 * @see com.oci.dao.MaterialDAO#findMaterialVo(java.lang.Integer) 
	*/
	@Override
	public MaterialVo findMaterialVo(Integer materialId) {
		// TODO Auto-generated method stub
		return materialMapper.findMaterialVo(materialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateMaterial</p> 
	 * <p>Description: </p> 
	 * @param material 
	 * @see com.oci.dao.MaterialDAO#updateMaterial(com.oci.domain.Material) 
	*/
	@Override
	public void updateMaterial(Material material) {
		// TODO Auto-generated method stub
		materialMapper.updateMaterial(material);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertMaterial</p> 
	 * <p>Description: </p> 
	 * @param material 
	 * @see com.oci.dao.MaterialDAO#insertMaterial(com.oci.domain.Material) 
	*/
	@Override
	public void insertMaterial(Material material) {
		// TODO Auto-generated method stub
		materialMapper.insertMaterial(material);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterials</p> 
	 * <p>Description: </p> 
	 * @param materialIds 
	 * @see com.oci.dao.MaterialDAO#deleteMaterials(java.util.List) 
	*/
	@Override
	public void deleteMaterials(List<Integer> materialIds) {
		// TODO Auto-generated method stub
		materialMapper.deleteMaterials(materialIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterial</p> 
	 * <p>Description: </p> 
	 * @param materialId 
	 * @see com.oci.dao.MaterialDAO#deleteMaterial(java.lang.Integer) 
	*/
	@Override
	public void deleteMaterial(Integer materialId) {
		// TODO Auto-generated method stub
		materialMapper.deleteMaterial(materialId);
	}
	
	
	
}
