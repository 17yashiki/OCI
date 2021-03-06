/**   
  * @Title: RodAndProgressService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 下午12:08:00 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import com.oci.domain.RodAndProgress;
import com.oci.domain.vo.RodAndProgressVo;

/** 
 * @ClassName: RodAndProgressService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 下午12:08:00 
 *  
 */
public interface RodAndProgressService {
	public List<RodAndProgressVo> findAllRodAndProgressVo();
	public List<RodAndProgressVo> findRodAndProgresss(Map<String,Object> map);
	public RodAndProgress findRodAndProgress(Integer rodAndProgressId);
	public RodAndProgressVo findRodAndProgressVo(Integer rodAndProgressId);
	
	public void updateRodAndProgress(RodAndProgress rodAndProgress);
	public void insertRodAndProgress(RodAndProgress rodAndProgress);
	public void deleteRodAndProgresss(List<Integer> rodAndProgressIds);
	public void deleteRodAndProgress(Integer rodAndProgressId);
}
