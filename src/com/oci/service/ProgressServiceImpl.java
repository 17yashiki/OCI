/**   
  * @Title: ProgressServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 下午12:00:14 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.ProgressDAO;
import com.oci.domain.Progress;
import com.oci.domain.searcher.ProgressSearcher;
import com.oci.domain.vo.ProgressForOtherVo;
import com.oci.domain.vo.ProgressVo;

/** 
 * @ClassName: ProgressServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 下午12:00:14 
 *  
 */
@Service
@Transactional
public class ProgressServiceImpl implements ProgressService {
	
	
	@Resource
	@Autowired
	private ProgressDAO progressDAO;
	
	

	public void setProgressDAO(ProgressDAO progressDAO) {
		this.progressDAO = progressDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProgress</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.ProgressService#findAllProgress() 
	 */
	@Override
	public List<ProgressVo> findAllProgressVo() {
		// TODO Auto-generated method stub
		return progressDAO.findAllProgressVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgresss</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.ProgressService#findProgresss(java.util.Map) 
	 */
	@Override
	public List<ProgressVo> findProgresss(ProgressSearcher progress) {
		// TODO Auto-generated method stub
		return progressDAO.findProgresss(progress);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgress</p> 
	 * <p>Description: </p> 
	 * @param progressId
	 * @return 
	 * @see com.oci.service.ProgressService#findProgress(java.lang.Integer) 
	 */
	@Override
	public Progress findProgress(Integer progressId) {
		// TODO Auto-generated method stub
		return progressDAO.findProgress(progressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgressVo</p> 
	 * <p>Description: </p> 
	 * @param progressId
	 * @return 
	 * @see com.oci.service.ProgressService#findProgressVo(java.lang.Integer) 
	 */
	@Override
	public ProgressVo findProgressVo(Integer progressId) {
		// TODO Auto-generated method stub
		return progressDAO.findProgressVo(progressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProgress</p> 
	 * <p>Description: </p> 
	 * @param progress 
	 * @see com.oci.service.ProgressService#updateProgress(com.oci.domain.Progress) 
	 */
	@Override
	public void updateProgress(Progress progress) {
		// TODO Auto-generated method stub
		progressDAO.updateProgress(progress);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProgress</p> 
	 * <p>Description: </p> 
	 * @param progress 
	 * @see com.oci.service.ProgressService#insertProgress(com.oci.domain.Progress) 
	 */
	@Override
	public void insertProgress(Progress progress) {
		// TODO Auto-generated method stub
		progressDAO.insertProgress(progress);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProgresss</p> 
	 * <p>Description: </p> 
	 * @param progressIds 
	 * @see com.oci.service.ProgressService#deleteProgresss(java.util.List) 
	 */
	@Override
	public void deleteProgresss(List<Integer> progressIds) {
		// TODO Auto-generated method stub
		progressDAO.deleteProgresss(progressIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProgress</p> 
	 * <p>Description: </p> 
	 * @param progressId 
	 * @see com.oci.service.ProgressService#deleteProgress(java.lang.Integer) 
	 */
	@Override
	public void deleteProgress(Integer progressId) {
		// TODO Auto-generated method stub
		progressDAO.deleteProgress(progressId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProgressForOtherVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.ProgressService#findAllProgressForOtherVo() 
	*/
	@Override
	public List<ProgressForOtherVo> findAllProgressForOtherVo() {
		// TODO Auto-generated method stub
		return progressDAO.findAllProgressForOtherVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProgressForOtherVo</p> 
	 * <p>Description: </p> 
	 * @param progressId
	 * @return 
	 * @see com.oci.service.ProgressService#findProgressForOtherVo(java.lang.Integer) 
	*/
	@Override
	public ProgressForOtherVo findProgressForOtherVo(Integer progressId) {
		// TODO Auto-generated method stub
		return progressDAO.findProgressForOtherVo(progressId);
	}

}
