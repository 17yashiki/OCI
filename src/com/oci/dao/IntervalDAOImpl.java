/**   
  * @Title: IntervalDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月26日 下午3:40:06 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Interval;
import com.oci.domain.vo.IntervalForOtherVo;
import com.oci.domain.vo.IntervalVo;
import com.oci.mapper.IntervalMapper;

/** 
 * @ClassName: IntervalDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月26日 下午3:40:06 
 *  
 */
@Repository
public class IntervalDAOImpl implements IntervalDAO {

	@Autowired
	private IntervalMapper intervalMapper;
	
	
	public IntervalMapper getIntervalMapper() {
		return intervalMapper;
	}

	public void setIntervalMapper(IntervalMapper intervalMapper) {
		this.intervalMapper = intervalMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllIntervalVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.IntervalDAO#findAllIntervalVo() 
	 */
	@Override
	public List<IntervalVo> findAllIntervalVo() {
		// TODO Auto-generated method stub
		return intervalMapper.findAllIntervalVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findIntervalVos</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.IntervalDAO#findIntervalVos() 
	 */
	@Override
	public List<IntervalVo> findIntervalVos(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return intervalMapper.findIntervalVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findIntervalVo</p> 
	 * <p>Description: </p> 
	 * @param intervalId
	 * @return 
	 * @see com.oci.dao.IntervalDAO#findIntervalVo(java.lang.Integer) 
	 */
	@Override
	public IntervalVo findIntervalVo(Integer intervalId) {
		// TODO Auto-generated method stub
		return intervalMapper.findIntervalVo(intervalId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findInterval</p> 
	 * <p>Description: </p> 
	 * @param intervalId
	 * @return 
	 * @see com.oci.dao.IntervalDAO#findInterval(java.lang.Integer) 
	 */
	@Override
	public Interval findInterval(Integer intervalId) {
		// TODO Auto-generated method stub
		return intervalMapper.findInterval(intervalId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findIntervalForOtherVo</p> 
	 * <p>Description: </p> 
	 * @param intervalId
	 * @return 
	 * @see com.oci.dao.IntervalDAO#findIntervalForOtherVo(java.lang.Integer) 
	 */
	@Override
	public IntervalForOtherVo findIntervalForOtherVo(Integer intervalId) {
		// TODO Auto-generated method stub
		return intervalMapper.findIntervalForOtherVo(intervalId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateInterval</p> 
	 * <p>Description: </p> 
	 * @param interval 
	 * @see com.oci.dao.IntervalDAO#updateInterval(com.oci.domain.Interval) 
	 */
	@Override
	public void updateInterval(Interval interval) {
		// TODO Auto-generated method stub
		intervalMapper.updateInterval(interval);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertInterval</p> 
	 * <p>Description: </p> 
	 * @param interval 
	 * @see com.oci.dao.IntervalDAO#insertInterval(com.oci.domain.Interval) 
	 */
	@Override
	public void insertInterval(Interval interval) {
		// TODO Auto-generated method stub
		intervalMapper.insertInterval(interval);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteIntervals</p> 
	 * <p>Description: </p> 
	 * @param intervalIds 
	 * @see com.oci.dao.IntervalDAO#deleteIntervals(java.util.List) 
	 */
	@Override
	public void deleteIntervals(List<Integer> intervalIds) {
		// TODO Auto-generated method stub
		intervalMapper.deleteIntervals(intervalIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteInterval</p> 
	 * <p>Description: </p> 
	 * @param intervalId 
	 * @see com.oci.dao.IntervalDAO#deleteInterval(java.lang.Integer) 
	 */
	@Override
	public void deleteInterval(Integer intervalId) {
		// TODO Auto-generated method stub
		intervalMapper.deleteInterval(intervalId);
	}

}
