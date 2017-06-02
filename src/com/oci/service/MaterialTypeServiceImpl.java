/**   
  * @Title: MaterialTypeServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:57:06 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.MaterialTypeDAO;
import com.oci.domain.MaterialType;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialTypeVo;

/** 
 * @ClassName: MaterialTypeServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:57:06 
 *  
 */
@Service
@Transactional
public class MaterialTypeServiceImpl implements MaterialTypeService {
	
	@Resource
	@Autowired
	private MaterialTypeDAO materialTypeDAO;
	
	
	public void setMaterialTypeDAO(MaterialTypeDAO materialTypeDAO) {
		this.materialTypeDAO = materialTypeDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllMaterialTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.MaterialTypeService#findAllMaterialTypeVo() 
	 */
	@Override
	public List<MaterialTypeVo> findAllMaterialTypeVo() {
		// TODO Auto-generated method stub
		return materialTypeDAO.findAllMaterialTypeVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialType</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.service.MaterialTypeService#findMaterialType(java.lang.Integer) 
	 */
	@Override
	public MaterialType findMaterialType(Integer typeId) {
		// TODO Auto-generated method stub
		return materialTypeDAO.findMaterialType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialTypeVo</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.service.MaterialTypeService#findMaterialTypeVo(java.lang.Integer) 
	 */
	@Override
	public MaterialTypeVo findMaterialTypeVo(Integer typeId) {
		// TODO Auto-generated method stub
		return materialTypeDAO.findMaterialTypeVo(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateMaterialType</p> 
	 * <p>Description: </p> 
	 * @param materialType 
	 * @see com.oci.service.MaterialTypeService#updateMaterialType(com.oci.domain.MaterialType) 
	 */
	@Override
	public void updateMaterialType(MaterialType materialType) {
		// TODO Auto-generated method stub
		materialTypeDAO.updateMaterialType(materialType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertMaterialType</p> 
	 * <p>Description: </p> 
	 * @param materialType 
	 * @see com.oci.service.MaterialTypeService#insertMaterialType(com.oci.domain.MaterialType) 
	 */
	@Override
	public void insertMaterialType(MaterialType materialType) {
		// TODO Auto-generated method stub
		materialTypeDAO.insertMaterialType(materialType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterialTypes</p> 
	 * <p>Description: </p> 
	 * @param typeIds 
	 * @see com.oci.service.MaterialTypeService#deleteMaterialTypes(java.util.List) 
	 */
	@Override
	public void deleteMaterialTypes(List<Integer> typeIds) {
		// TODO Auto-generated method stub
		materialTypeDAO.deleteMaterialTypes(typeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterialType</p> 
	 * <p>Description: </p> 
	 * @param typeId 
	 * @see com.oci.service.MaterialTypeService#deleteMaterialType(java.lang.Integer) 
	 */
	@Override
	public void deleteMaterialType(Integer typeId) {
		// TODO Auto-generated method stub
		materialTypeDAO.deleteMaterialType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialTypeVos</p> 
	 * <p>Description: </p> 
	 * @param materialType
	 * @return 
	 * @see com.oci.service.MaterialTypeService#findMaterialTypeVos(com.oci.domain.searcher.MaterialTypeSearcher) 
	*/
	@Override
	public List<MaterialTypeVo> findMaterialTypeVos(
			MaterialTypeSearcher materialType) {
		// TODO Auto-generated method stub
		return materialTypeDAO.findMaterialTypeVos(materialType);
	}

}
