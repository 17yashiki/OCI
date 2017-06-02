/**   
  * @Title: RodAndMaterialServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 下午12:05:45 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.RodAndMaterialDAO;
import com.oci.domain.RodAndMaterial;
import com.oci.domain.vo.RodAndMaterialVo;

/** 
 * @ClassName: RodAndMaterialServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 下午12:05:45 
 *  
 */
@Service
@Transactional
public class RodAndMaterialServiceImpl implements RodAndMaterialService {
	
	
	@Resource
	@Autowired
	private RodAndMaterialDAO rodAndMaterialDAO;
	
	public void setRodAndMaterialDAO(RodAndMaterialDAO rodAndMaterialDAO) {
		this.rodAndMaterialDAO = rodAndMaterialDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRodAndMaterialVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.RodAndMaterialService#findAllRodAndMaterialVo() 
	 */
	@Override
	public List<RodAndMaterialVo> findAllRodAndMaterialVo() {
		// TODO Auto-generated method stub
		return rodAndMaterialDAO.findAllRodAndMaterialVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndMaterialVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.RodAndMaterialService#findRodAndMaterialVos(java.util.Map) 
	 */
	@Override
	public List<RodAndMaterialVo> findRodAndMaterialVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rodAndMaterialDAO.findRodAndMaterialVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialId
	 * @return 
	 * @see com.oci.service.RodAndMaterialService#findRodAndMaterial(java.lang.Integer) 
	 */
	@Override
	public RodAndMaterial findRodAndMaterial(Integer rodMaterialId) {
		// TODO Auto-generated method stub
		return rodAndMaterialDAO.findRodAndMaterial(rodMaterialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndMaterialVo</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialId
	 * @return 
	 * @see com.oci.service.RodAndMaterialService#findRodAndMaterialVo(java.lang.Integer) 
	 */
	@Override
	public RodAndMaterialVo findRodAndMaterialVo(Integer rodMaterialId) {
		// TODO Auto-generated method stub
		return rodAndMaterialDAO.findRodAndMaterialVo(rodMaterialId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodAndMaterial 
	 * @see com.oci.service.RodAndMaterialService#updateRodAndMaterial(com.oci.domain.RodAndMaterial) 
	 */
	@Override
	public void updateRodAndMaterial(RodAndMaterial rodAndMaterial) {
		// TODO Auto-generated method stub
		rodAndMaterialDAO.updateRodAndMaterial(rodAndMaterial);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodAndMaterial 
	 * @see com.oci.service.RodAndMaterialService#insertRodAndMaterial(com.oci.domain.RodAndMaterial) 
	 */
	@Override
	public void insertRodAndMaterial(RodAndMaterial rodAndMaterial) {
		// TODO Auto-generated method stub
		rodAndMaterialDAO.insertRodAndMaterial(rodAndMaterial);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndMaterials</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialIds 
	 * @see com.oci.service.RodAndMaterialService#deleteRodAndMaterials(java.util.List) 
	 */
	@Override
	public void deleteRodAndMaterials(List<Integer> rodMaterialIds) {
		// TODO Auto-generated method stub
		rodAndMaterialDAO.deleteRodAndMaterials(rodMaterialIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndMaterial</p> 
	 * <p>Description: </p> 
	 * @param rodMaterialId 
	 * @see com.oci.service.RodAndMaterialService#deleteRodAndMaterial(java.lang.Integer) 
	 */
	@Override
	public void deleteRodAndMaterial(Integer rodMaterialId) {
		// TODO Auto-generated method stub
		rodAndMaterialDAO.deleteRodAndMaterial(rodMaterialId);
	}

}
