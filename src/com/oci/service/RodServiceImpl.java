/**   
  * @Title: RodServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 下午12:03:11 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.RodDAO;
import com.oci.domain.Rod;
import com.oci.domain.vo.RodVo;

/** 
 * @ClassName: RodServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 下午12:03:11 
 *  
 */
@Service
@Transactional
public class RodServiceImpl implements RodService {
	
	@Resource
	@Autowired
	private RodDAO rodDAO;
	

	public void setRodDAO(RodDAO rodDAO) {
		this.rodDAO = rodDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRodVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.RodService#findAllRodVo() 
	 */
	@Override
	public List<RodVo> findAllRodVo() {
		// TODO Auto-generated method stub
		return rodDAO.findAllRodVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.RodService#findRodVos(java.util.Map) 
	 */
	@Override
	public List<RodVo> findRodVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rodDAO.findRodVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRod</p> 
	 * <p>Description: </p> 
	 * @param rodId
	 * @return 
	 * @see com.oci.service.RodService#findRod(java.lang.Integer) 
	 */
	@Override
	public Rod findRod(Integer rodId) {
		// TODO Auto-generated method stub
		return rodDAO.findRod(rodId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodVo</p> 
	 * <p>Description: </p> 
	 * @param rodId
	 * @return 
	 * @see com.oci.service.RodService#findRodVo(java.lang.Integer) 
	 */
	@Override
	public RodVo findRodVo(Integer rodId) {
		// TODO Auto-generated method stub
		return rodDAO.findRodVo(rodId);
	}

	/* (非 Javadoc) 
	 * <p>Title: InsertRod</p> 
	 * <p>Description: </p> 
	 * @param rod 
	 * @see com.oci.service.RodService#InsertRod(com.oci.domain.Rod) 
	 */
	@Override
	public void InsertRod(Rod rod) {
		// TODO Auto-generated method stub
		rodDAO.InsertRod(rod);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRod</p> 
	 * <p>Description: </p> 
	 * @param rod 
	 * @see com.oci.service.RodService#updateRod(com.oci.domain.Rod) 
	 */
	@Override
	public void updateRod(Rod rod) {
		// TODO Auto-generated method stub
		rodDAO.updateRod(rod);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRods</p> 
	 * <p>Description: </p> 
	 * @param rodIds 
	 * @see com.oci.service.RodService#deleteRods(java.util.List) 
	 */
	@Override
	public void deleteRods(List<Integer> rodIds) {
		// TODO Auto-generated method stub
		rodDAO.deleteRods(rodIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRod</p> 
	 * <p>Description: </p> 
	 * @param rodId 
	 * @see com.oci.service.RodService#deleteRod(java.lang.Integer) 
	 */
	@Override
	public void deleteRod(Integer rodId) {
		// TODO Auto-generated method stub
		rodDAO.deleteRod(rodId);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodsByIntervalId</p> 
	 * <p>Description: </p> 
	 * @param intervalId 
	 * @see com.oci.service.RodService#deleteRodsByIntervalId(java.lang.Integer) 
	 */
	@Override
	public void deleteRodsByIntervalId(Integer intervalId) {
		// TODO Auto-generated method stub
		rodDAO.deleteRodsByIntervalId(intervalId);
	}

}
