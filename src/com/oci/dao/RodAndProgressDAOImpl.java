/**   
  * @Title: RodAndProgressDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:50:36 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.RodAndProgress;
import com.oci.domain.vo.RodAndProgressVo;
import com.oci.mapper.RodAndProgressMapper;

/** 
 * @ClassName: RodAndProgressDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:50:36 
 *  
 */
@Repository
public class RodAndProgressDAOImpl implements RodAndProgressDAO {
	
	@Autowired
	private RodAndProgressMapper rodAndProgressMapper;
	

	public void setRodAndProgressMapper(RodAndProgressMapper rodAndProgressMapper) {
		this.rodAndProgressMapper = rodAndProgressMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRodAndProgressVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.RodAndProgressDAO#findAllRodAndProgressVo() 
	 */
	@Override
	public List<RodAndProgressVo> findAllRodAndProgressVo() {
		// TODO Auto-generated method stub
		return rodAndProgressMapper.findAllRodAndProgressVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndProgresss</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.RodAndProgressDAO#findRodAndProgresss(java.util.Map) 
	 */
	@Override
	public List<RodAndProgressVo> findRodAndProgresss(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rodAndProgressMapper.findRodAndProgresss(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressId
	 * @return 
	 * @see com.oci.dao.RodAndProgressDAO#findRodAndProgress(java.lang.Integer) 
	 */
	@Override
	public RodAndProgress findRodAndProgress(Integer rodAndProgressId) {
		// TODO Auto-generated method stub
		return rodAndProgressMapper.findRodAndProgress(rodAndProgressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodAndProgressVo</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressId
	 * @return 
	 * @see com.oci.dao.RodAndProgressDAO#findRodAndProgressVo(java.lang.Integer) 
	 */
	@Override
	public RodAndProgressVo findRodAndProgressVo(Integer rodAndProgressId) {
		// TODO Auto-generated method stub
		return rodAndProgressMapper.findRodAndProgressVo(rodAndProgressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgress 
	 * @see com.oci.dao.RodAndProgressDAO#updateRodAndProgress(com.oci.domain.RodAndProgress) 
	 */
	@Override
	public void updateRodAndProgress(RodAndProgress rodAndProgress) {
		// TODO Auto-generated method stub
		rodAndProgressMapper.updateRodAndProgress(rodAndProgress);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgress 
	 * @see com.oci.dao.RodAndProgressDAO#insertRodAndProgress(com.oci.domain.RodAndProgress) 
	 */
	@Override
	public void insertRodAndProgress(RodAndProgress rodAndProgress) {
		// TODO Auto-generated method stub
		rodAndProgressMapper.insertRodAndProgress(rodAndProgress);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndProgresss</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressIds 
	 * @see com.oci.dao.RodAndProgressDAO#deleteRodAndProgresss(java.util.List) 
	 */
	@Override
	public void deleteRodAndProgresss(List<Integer> rodAndProgressIds) {
		// TODO Auto-generated method stub
		rodAndProgressMapper.deleteRodAndProgresss(rodAndProgressIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodAndProgress</p> 
	 * <p>Description: </p> 
	 * @param rodAndProgressId 
	 * @see com.oci.dao.RodAndProgressDAO#deleteRodAndProgress(java.lang.Integer) 
	 */
	@Override
	public void deleteRodAndProgress(Integer rodAndProgressId) {
		// TODO Auto-generated method stub
		rodAndProgressMapper.deleteRodAndProgress(rodAndProgressId);
	}

}
