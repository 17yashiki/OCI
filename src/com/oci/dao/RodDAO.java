/**   
  * @Title: RodDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:42:47 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import com.oci.domain.Rod;
import com.oci.domain.vo.RodVo;

/** 
 * @ClassName: RodDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:42:47 
 *  
 */
public interface RodDAO {
	public List<RodVo> findAllRodVo();
	public List<RodVo> findRodVos(Map<String,Object> map);
	public Rod findRod(Integer rodId);
	public RodVo findRodVo(Integer rodId);
	
	
	public void InsertRod(Rod rod);
	public void updateRod(Rod rod);
	public void deleteRods(List<Integer> rodIds);
	public void deleteRod(Integer rodId);
	public void deleteRodsByIntervalId(Integer intervalId);
}
