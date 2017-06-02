/**   
  * @Title: ProgressDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午10:10:44 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Progress;
import com.oci.domain.searcher.ProgressSearcher;
import com.oci.domain.vo.ProgressForOtherVo;
import com.oci.domain.vo.ProgressVo;
import com.oci.mapper.ProgressMapper;

/** 
 * @ClassName: ProgressDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午10:10:44 
 *  
 */
@Repository
public class ProgressDAOImpl implements ProgressDAO {
	
	@Autowired
	private ProgressMapper progressMapper;
	
	
	
	public void setProgressMapper(ProgressMapper progressMapper) {
		this.progressMapper = progressMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProgress</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.ProgressDAO#findAllProgress() 
	 */
	@Override
	public List<ProgressVo> findAllProgressVo() {
		// TODO Auto-generated method stub
		return progressMapper.findAllProgressVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgresss</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.ProgressDAO#findProgresss(java.util.Map) 
	 */
	@Override
	public List<ProgressVo> findProgresss(ProgressSearcher progress) {
		// TODO Auto-generated method stub
		return progressMapper.findProgressVos(progress);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgress</p> 
	 * <p>Description: </p> 
	 * @param progressId
	 * @return 
	 * @see com.oci.dao.ProgressDAO#findProgress(java.lang.Integer) 
	 */
	@Override
	public Progress findProgress(Integer progressId) {
		// TODO Auto-generated method stub
		return progressMapper.findProgress(progressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgressVo</p> 
	 * <p>Description: </p> 
	 * @param progressId
	 * @return 
	 * @see com.oci.dao.ProgressDAO#findProgressVo(java.lang.Integer) 
	 */
	@Override
	public ProgressVo findProgressVo(Integer progressId) {
		// TODO Auto-generated method stub
		return progressMapper.findProgressVo(progressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProgress</p> 
	 * <p>Description: </p> 
	 * @param progress 
	 * @see com.oci.dao.ProgressDAO#updateProgress(com.oci.domain.Progress) 
	 */
	@Override
	public void updateProgress(Progress progress) {
		// TODO Auto-generated method stub
		progressMapper.updateProgress(progress);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProgress</p> 
	 * <p>Description: </p> 
	 * @param progress 
	 * @see com.oci.dao.ProgressDAO#insertProgress(com.oci.domain.Progress) 
	 */
	@Override
	public void insertProgress(Progress progress) {
		// TODO Auto-generated method stub
		progressMapper.insertProgress(progress);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProgresss</p> 
	 * <p>Description: </p> 
	 * @param progressIds 
	 * @see com.oci.dao.ProgressDAO#deleteProgresss(java.util.List) 
	 */
	@Override
	public void deleteProgresss(List<Integer> progressIds) {
		// TODO Auto-generated method stub
		progressMapper.deleteProgresss(progressIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProgress</p> 
	 * <p>Description: </p> 
	 * @param progressId 
	 * @see com.oci.dao.ProgressDAO#deleteProgress(java.lang.Integer) 
	 */
	@Override
	public void deleteProgress(Integer progressId) {
		// TODO Auto-generated method stub
		progressMapper.deleteProgress(progressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProgressForOtherVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.ProgressDAO#findAllProgressForOtherVo() 
	*/
	@Override
	public List<ProgressForOtherVo> findAllProgressForOtherVo() {
		return progressMapper.findAllProgressForOtherVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgressForOtherVo</p> 
	 * <p>Description: </p> 
	 * @param progressId
	 * @return 
	 * @see com.oci.dao.ProgressDAO#findProgressForOtherVo(java.lang.Integer) 
	*/
	@Override
	public ProgressForOtherVo findProgressForOtherVo(Integer progressId) {
		// TODO Auto-generated method stub
		return progressMapper.findProgressForOtherVo(progressId);
	}

}
