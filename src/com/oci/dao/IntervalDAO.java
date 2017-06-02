/**   
  * @Title: IntervalDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月26日 下午3:39:44 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import com.oci.domain.Interval;
import com.oci.domain.vo.IntervalForOtherVo;
import com.oci.domain.vo.IntervalVo;

/** 
 * @ClassName: IntervalDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月26日 下午3:39:44 
 *  
 */
public interface IntervalDAO {
	public List<IntervalVo> findAllIntervalVo();
	public List<IntervalVo> findIntervalVos(Map<String,Object> map);
	public IntervalVo findIntervalVo(Integer intervalId);
	public Interval findInterval(Integer intervalId);
	public IntervalForOtherVo findIntervalForOtherVo(Integer intervalId);
	
	public void updateInterval(Interval interval);
	public void insertInterval(Interval interval);
	public void deleteIntervals(List<Integer> intervalIds);
	public void deleteInterval(Integer intervalId);
}
