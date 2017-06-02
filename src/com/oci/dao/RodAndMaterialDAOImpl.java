/**   
  * @Title: RodAndMaterialDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午11:37:21 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.RodAndMaterial;
import com.oci.domain.vo.RodAndMaterialVo;
import com.oci.mapper.RodAndMaterialMapper;

/** 
 * @ClassName: RodAndMaterialDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午11:37:21 
 *  
 */
@Repository
public class RodAndMaterialDAOImpl implements RodAndMaterialDAO {
	
	@Autowired
	private RodAndMaterialMapper rodAndMaterialMapper;
	

	public void setRodAndMaterialMapper(RodAndMaterialMapper rodAndMaterialMapper) {
		this.rodAndMaterialMapper = rodAndMaterialMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRodAndMaterialVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.mapper.RodAndMaterialMapper#findAllRodAndMaterialVo() 
	 */
	@Override
	public List<RodAndMaterialVo> findAllRodAndMaterialVo() {
		// TODO Auto-generated method stub
		return rodAndMaterialMapper.findAllRodAndMaterialVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndMaterialVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.mapper.RodAndMaterialMapper#findRodAndMaterialVos(java.util.Map) 
	 */
	@Override
	public List<RodAndMaterialVo> findRodAndMaterialVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rodAndMaterialMapper.findRodAndMaterialVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialId
	 * @return 
	 * @see com.oci.mapper.RodAndMaterialMapper#findRodAndMaterial(java.lang.Integer) 
	 */
	@Override
	public RodAndMaterial findRodAndMaterial(Integer rodMaterialId) {
		// TODO Auto-generated method stub
		return rodAndMaterialMapper.findRodAndMaterial(rodMaterialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndMaterialVo</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialId
	 * @return 
	 * @see com.oci.mapper.RodAndMaterialMapper#findRodAndMaterialVo(java.lang.Integer) 
	 */
	@Override
	public RodAndMaterialVo findRodAndMaterialVo(Integer rodMaterialId) {
		// TODO Auto-generated method stub
		return rodAndMaterialMapper.findRodAndMaterialVo(rodMaterialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodAndMaterial 
	 * @see com.oci.mapper.RodAndMaterialMapper#updateRodAndMaterial(com.oci.domain.RodAndMaterial) 
	 */
	@Override
	public void updateRodAndMaterial(RodAndMaterial rodAndMaterial) {
		// TODO Auto-generated method stub
		rodAndMaterialMapper.updateRodAndMaterial(rodAndMaterial);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodAndMaterial 
	 * @see com.oci.mapper.RodAndMaterialMapper#insertRodAndMaterial(com.oci.domain.RodAndMaterial) 
	 */
	@Override
	public void insertRodAndMaterial(RodAndMaterial rodAndMaterial) {
		// TODO Auto-generated method stub
		rodAndMaterialMapper.insertRodAndMaterial(rodAndMaterial);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndMaterials</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialIds 
	 * @see com.oci.mapper.RodAndMaterialMapper#deleteRodAndMaterials(java.util.List) 
	 */
	@Override
	public void deleteRodAndMaterials(List<Integer> rodMaterialIds) {
		// TODO Auto-generated method stub
		rodAndMaterialMapper.deleteRodAndMaterials(rodMaterialIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialId 
	 * @see com.oci.mapper.RodAndMaterialMapper#deleteRodAndMaterial(java.lang.Integer) 
	 */
	@Override
	public void deleteRodAndMaterial(Integer rodMaterialId) {
		// TODO Auto-generated method stub
		rodAndMaterialMapper.deleteRodAndMaterial(rodMaterialId);
	}

}
