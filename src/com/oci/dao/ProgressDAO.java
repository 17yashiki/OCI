/**   
  * @Title: ProgressDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午10:10:15 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import com.oci.domain.Progress;
import com.oci.domain.searcher.ProgressSearcher;
import com.oci.domain.vo.ProgressForOtherVo;
import com.oci.domain.vo.ProgressVo;

/** 
 * @ClassName: ProgressDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午10:10:15 
 *  
 */
public interface ProgressDAO {
	public List<ProgressVo> findAllProgressVo();
	public List<ProgressForOtherVo> findAllProgressForOtherVo();
	public List<ProgressVo> findProgresss(ProgressSearcher progress);
	public Progress findProgress(Integer progressId);
	public ProgressVo findProgressVo(Integer progressId);
	public ProgressForOtherVo findProgressForOtherVo(Integer progressId);
	
	
	public void updateProgress(Progress progress);
	public void insertProgress(Progress progress);
	public void deleteProgresss(List<Integer> progressIds);
	public void deleteProgress(Integer progressId);
}
