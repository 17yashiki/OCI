/**   
  * @Title: MaterialServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:54:17 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.MaterialDAO;
import com.oci.domain.Material;
import com.oci.domain.searcher.MaterialSearcher;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialTypeVo;
import com.oci.domain.vo.MaterialVo;

/** 
 * @ClassName: MaterialServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:54:17 
 *  
 */
@Service
@Transactional
public class MaterialServiceImpl implements MaterialService {
	
	@Resource
	@Autowired
	private MaterialDAO materialDAO;
	
	public void setMaterialDAO(MaterialDAO materialDAO) {
		this.materialDAO = materialDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllMaterialVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.MaterialService#findAllMaterialVo() 
	 */
	@Override
	public List<MaterialVo> findAllMaterialVo() {
		// TODO Auto-generated method stub
		return materialDAO.findAllMaterialVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.MaterialService#findMaterialVos(java.util.Map) 
	 */
	
//	public List<MaterialVo> findMaterialVos(Map<String, Object> map) {
//		// TODO Auto-generated method stub
//		return materialDAO.findMaterialVos(map);
//	}

	public List<MaterialVo> findMaterialVos(
			MaterialSearcher material) {
		// TODO Auto-generated method stub
		return materialDAO.findMaterialVos(material);
	}
	/* (非 Javadoc) 
	 * <p>Title: findMaterial</p> 
	 * <p>Description: </p> 
	 * @param materialId
	 * @return 
	 * @see com.oci.service.MaterialService#findMaterial(java.lang.Integer) 
	 */
	@Override
	public Material findMaterial(Integer materialId) {
		// TODO Auto-generated method stub
		return materialDAO.findMaterial(materialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialVo</p> 
	 * <p>Description: </p> 
	 * @param materialId
	 * @return 
	 * @see com.oci.service.MaterialService#findMaterialVo(java.lang.Integer) 
	 */
	@Override
	public MaterialVo findMaterialVo(Integer materialId) {
		// TODO Auto-generated method stub
		return materialDAO.findMaterialVo(materialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateMaterial</p> 
	 * <p>Description: </p> 
	 * @param material 
	 * @see com.oci.service.MaterialService#updateMaterial(com.oci.domain.Material) 
	 */
	@Override
	public void updateMaterial(Material material) {
		// TODO Auto-generated method stub
		materialDAO.updateMaterial(material);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertMaterial</p> 
	 * <p>Description: </p> 
	 * @param material 
	 * @see com.oci.service.MaterialService#insertMaterial(com.oci.domain.Material) 
	 */
	@Override
	public void insertMaterial(Material material) {
		// TODO Auto-generated method stub
		materialDAO.insertMaterial(material);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterials</p> 
	 * <p>Description: </p> 
	 * @param materialIds 
	 * @see com.oci.service.MaterialService#deleteMaterials(java.util.List) 
	 */
	@Override
	public void deleteMaterials(List<Integer> materialIds) {
		// TODO Auto-generated method stub
		materialDAO.deleteMaterials(materialIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterial</p> 
	 * <p>Description: </p> 
	 * @param materialId 
	 * @see com.oci.service.MaterialService#deleteMaterial(java.lang.Integer) 
	 */
	@Override
	public void deleteMaterial(Integer materialId) {
		// TODO Auto-generated method stub
		materialDAO.deleteMaterial(materialId);
	}

}
