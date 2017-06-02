/**   
  * @Title: MaterialTypeDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午9:25:49 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.MaterialType;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialTypeVo;
import com.oci.mapper.MaterialTypeMapper;

/** 
 * @ClassName: MaterialTypeDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午9:25:49 
 *  
 */
@Repository
public class MaterialTypeDAOImpl implements MaterialTypeDAO{
	
	@Autowired
	private MaterialTypeMapper materialTypeMapper;
	
	public void setMaterialTypeMapper(MaterialTypeMapper materialTypeMapper) {
		this.materialTypeMapper = materialTypeMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllMaterialTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.MaterialTypeDAO#findAllMaterialTypeVo() 
	*/
	@Override
	public List<MaterialTypeVo> findAllMaterialTypeVo() {
		// TODO Auto-generated method stub
		return materialTypeMapper.findAllMaterialTypeVo();
	}


	/* (非 Javadoc) 
	 * <p>Title: findMaterialType</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.dao.MaterialTypeDAO#findMaterialType(java.lang.Integer) 
	*/
	@Override
	public MaterialType findMaterialType(Integer typeId) {
		// TODO Auto-generated method stub
		return materialTypeMapper.findMaterialType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialTypeVo</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.dao.MaterialTypeDAO#findMaterialTypeVo(java.lang.Integer) 
	*/
	@Override
	public MaterialTypeVo findMaterialTypeVo(Integer typeId) {
		// TODO Auto-generated method stub
		return materialTypeMapper.findMaterialTypeVo(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateMaterialType</p> 
	 * <p>Description: </p> 
	 * @param materialType 
	 * @see com.oci.dao.MaterialTypeDAO#updateMaterialType(com.oci.domain.MaterialType) 
	*/
	@Override
	public void updateMaterialType(MaterialType materialType) {
		// TODO Auto-generated method stub
		materialTypeMapper.updateMaterialType(materialType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertMaterialType</p> 
	 * <p>Description: </p> 
	 * @param materialType 
	 * @see com.oci.dao.MaterialTypeDAO#insertMaterialType(com.oci.domain.MaterialType) 
	*/
	@Override
	public void insertMaterialType(MaterialType materialType) {
		// TODO Auto-generated method stub
		materialTypeMapper.insertMaterialType(materialType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterialTypes</p> 
	 * <p>Description: </p> 
	 * @param typeIds 
	 * @see com.oci.dao.MaterialTypeDAO#deleteMaterialTypes(java.util.List) 
	*/
	@Override
	public void deleteMaterialTypes(List<Integer> typeIds) {
		// TODO Auto-generated method stub
		materialTypeMapper.deleteMaterialTypes(typeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteMaterialType</p> 
	 * <p>Description: </p> 
	 * @param typeId 
	 * @see com.oci.dao.MaterialTypeDAO#deleteMaterialType(java.lang.Integer) 
	*/
	@Override
	public void deleteMaterialType(Integer typeId) {
		// TODO Auto-generated method stub
		materialTypeMapper.deleteMaterialType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findMaterialTypeVos</p> 
	 * <p>Description: </p> 
	 * @param materialType
	 * @return 
	 * @see com.oci.dao.MaterialTypeDAO#findMaterialTypeVos(com.oci.domain.searcher.MaterialTypeSearcher) 
	*/
	@Override
	public List<MaterialTypeVo> findMaterialTypeVos(
			MaterialTypeSearcher materialType) {
		// TODO Auto-generated method stub
		return materialTypeMapper.findMaterialTypeVos(materialType);
	}

}
