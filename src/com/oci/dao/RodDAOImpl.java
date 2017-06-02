/**   
  * @Title: RodDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:43:30 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Rod;
import com.oci.domain.vo.RodVo;
import com.oci.mapper.RodMapper;

/** 
 * @ClassName: RodDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:43:30 
 *  
 */
@Repository
public class RodDAOImpl implements RodDAO {
	
	@Autowired
	private RodMapper rodMapper;
	
	
	
	
	public void setRodMapper(RodMapper rodMapper) {
		this.rodMapper = rodMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRodVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.RodDAO#findAllRodVo() 
	 */
	@Override
	public List<RodVo> findAllRodVo() {
		// TODO Auto-generated method stub
		return rodMapper.findAllRodVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.RodDAO#findRodVos(java.util.Map) 
	 */
	@Override
	public List<RodVo> findRodVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rodMapper.findAllRodVo()
				;
	}

	/* (非 Javadoc) 
	 * <p>Title: findRod</p> 
	 * <p>Description: </p> 
	 * @param rodId
	 * @return 
	 * @see com.oci.dao.RodDAO#findRod(java.lang.Integer) 
	 */
	@Override
	public Rod findRod(Integer rodId) {
		// TODO Auto-generated method stub
		return rodMapper.findRod(rodId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRodVo</p> 
	 * <p>Description: </p> 
	 * @param rodId
	 * @return 
	 * @see com.oci.dao.RodDAO#findRodVo(java.lang.Integer) 
	 */
	@Override
	public RodVo findRodVo(Integer rodId) {
		// TODO Auto-generated method stub
		return rodMapper.findRodVo(rodId);
	}

	/* (非 Javadoc) 
	 * <p>Title: InsertRod</p> 
	 * <p>Description: </p> 
	 * @param rod 
	 * @see com.oci.dao.RodDAO#InsertRod(com.oci.domain.Rod) 
	 */
	@Override
	public void InsertRod(Rod rod) {
		// TODO Auto-generated method stub
		rodMapper.InsertRod(rod);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRod</p> 
	 * <p>Description: </p> 
	 * @param rod 
	 * @see com.oci.dao.RodDAO#updateRod(com.oci.domain.Rod) 
	 */
	@Override
	public void updateRod(Rod rod) {
		// TODO Auto-generated method stub
		rodMapper.updateRod(rod);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRods</p> 
	 * <p>Description: </p> 
	 * @param rodIds 
	 * @see com.oci.dao.RodDAO#deleteRods(java.util.List) 
	 */
	@Override
	public void deleteRods(List<Integer> rodIds) {
		// TODO Auto-generated method stub
		rodMapper.deleteRods(rodIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRod</p> 
	 * <p>Description: </p> 
	 * @param rodId 
	 * @see com.oci.dao.RodDAO#deleteRod(java.lang.Integer) 
	 */
	@Override
	public void deleteRod(Integer rodId) {
		// TODO Auto-generated method stub
		rodMapper.deleteRod(rodId);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRodsByIntervalId</p> 
	 * <p>Description: </p> 
	 * @param intervalId 
	 * @see com.oci.dao.RodDAO#deleteRodsByIntervalId(java.lang.Integer) 
	 */
	@Override
	public void deleteRodsByIntervalId(Integer intervalId) {
		// TODO Auto-generated method stub
		rodMapper.deleteRodsByIntervalId(intervalId);
	}

}
