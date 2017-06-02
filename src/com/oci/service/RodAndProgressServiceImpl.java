/**   
  * @Title: RodAndProgressServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 下午12:08:36 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.RodAndProgressDAO;
import com.oci.domain.RodAndProgress;
import com.oci.domain.vo.RodAndProgressVo;

/** 
 * @ClassName: RodAndProgressServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 下午12:08:36 
 *  
 */
@Service
@Transactional
public class RodAndProgressServiceImpl implements RodAndProgressService {
		
	@Resource
	@Autowired
	private RodAndProgressDAO rodAndProgressDAO;
	 

	public void setRodAndProgressDAO(RodAndProgressDAO rodAndProgressDAO) {
		this.rodAndProgressDAO = rodAndProgressDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRodAndProgressVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.RodAndProgressService#findAllRodAndProgressVo() 
	 */
	@Override
	public List<RodAndProgressVo> findAllRodAndProgressVo() {
		// TODO Auto-generated method stub
		return rodAndProgressDAO.findAllRodAndProgressVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndProgresss</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.RodAndProgressService#findRodAndProgresss(java.util.Map) 
	 */
	@Override
	public List<RodAndProgressVo> findRodAndProgresss(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rodAndProgressDAO.findRodAndProgresss(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressId
	 * @return 
	 * @see com.oci.service.RodAndProgressService#findRodAndProgress(java.lang.Integer) 
	 */
	@Override
	public RodAndProgress findRodAndProgress(Integer rodAndProgressId) {
		// TODO Auto-generated method stub
		return rodAndProgressDAO.findRodAndProgress(rodAndProgressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndProgressVo</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressId
	 * @return 
	 * @see com.oci.service.RodAndProgressService#findRodAndProgressVo(java.lang.Integer) 
	 */
	@Override
	public RodAndProgressVo findRodAndProgressVo(Integer rodAndProgressId) {
		// TODO Auto-generated method stub
		return rodAndProgressDAO.findRodAndProgressVo(rodAndProgressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgress 
	 * @see com.oci.service.RodAndProgressService#updateRodAndProgress(com.oci.domain.RodAndProgress) 
	 */
	@Override
	public void updateRodAndProgress(RodAndProgress rodAndProgress) {
		// TODO Auto-generated method stub
		rodAndProgressDAO.updateRodAndProgress(rodAndProgress);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgress 
	 * @see com.oci.service.RodAndProgressService#insertRodAndProgress(com.oci.domain.RodAndProgress) 
	 */
	@Override
	public void insertRodAndProgress(RodAndProgress rodAndProgress) {
		// TODO Auto-generated method stub
		rodAndProgressDAO.insertRodAndProgress(rodAndProgress);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndProgresss</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressIds 
	 * @see com.oci.service.RodAndProgressService#deleteRodAndProgresss(java.util.List) 
	 */
	@Override
	public void deleteRodAndProgresss(List<Integer> rodAndProgressIds) {
		// TODO Auto-generated method stub
		rodAndProgressDAO.deleteRodAndProgresss(rodAndProgressIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressId 
	 * @see com.oci.service.RodAndProgressService#deleteRodAndProgress(java.lang.Integer) 
	 */
	@Override
	public void deleteRodAndProgress(Integer rodAndProgressId) {
		// TODO Auto-generated method stub
		rodAndProgressDAO.deleteRodAndProgress(rodAndProgressId);
	}

}
