/**   
  * @Title: ProjectSerivceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:59:16 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.ProjectAndTypeDAO;
import com.oci.dao.ProjectDAO;
import com.oci.domain.Project;
import com.oci.domain.searcher.ProjectSearcher;
import com.oci.domain.vo.ProjectVo;

/** 
 * @ClassName: ProjectSerivceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:59:16 
 *  
 */
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectDAO projectDAO;
	
	@Autowired
	private ProjectAndTypeDAO projectAndTypeDAO;
	
	
	
	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	public void setProjectAndTypeDAO(ProjectAndTypeDAO projectAndTypeDAO) {
		this.projectAndTypeDAO = projectAndTypeDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProjectVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.ProjectService#findAllProjectVo() 
	*/
	@Override
	public List<ProjectVo> findAllProjectVo() {
		// TODO Auto-generated method stub
		return projectDAO.findAllProjectVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProject</p> 
	 * <p>Description: </p> 
	 * @param projectId
	 * @return 
	 * @see com.oci.service.ProjectService#findProject(java.lang.Integer) 
	*/
	@Override
	public Project findProject(Integer projectId) {
		// TODO Auto-generated method stub
		return projectDAO.findProject(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectVo</p> 
	 * <p>Description: </p> 
	 * @param projectId
	 * @return 
	 * @see com.oci.service.ProjectService#findProjectVo(java.lang.Integer) 
	*/
	@Override
	public ProjectVo findProjectVo(Integer projectId) {
		// TODO Auto-generated method stub
		return projectDAO.findProjectVo(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProject</p> 
	 * <p>Description: </p> 
	 * @param project 
	 * @see com.oci.service.ProjectService#updateProject(com.oci.domain.Project) 
	*/
	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		projectDAO.updateProject(project);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProject</p> 
	 * <p>Description: </p> 
	 * @param project 
	 * @see com.oci.service.ProjectService#insertProject(com.oci.domain.Project) 
	*/
	@Override
	public void insertProject(Project project) {
		// TODO Auto-generated method stub
		projectDAO.insertProject(project);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjects</p> 
	 * <p>Description: </p> 
	 * @param projectIds 
	 * @see com.oci.service.ProjectService#deleteProjects(java.util.List) 
	*/
	@Override
	public void deleteProjects(List<Integer> projectIds) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.deleteProjectAndTypesByProjectId(projectIds);
		projectDAO.deleteProjects(projectIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProject</p> 
	 * <p>Description: </p> 
	 * @param projectId 
	 * @see com.oci.service.ProjectService#deleteProject(java.lang.Integer) 
	*/
	@Override
	public void deleteProject(Integer projectId) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.deleteProjectAndTypeByProjectId(projectId);
		projectDAO.deleteProject(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectVos</p> 
	 * <p>Description: </p> 
	 * @param project
	 * @return 
	 * @see com.oci.service.ProjectService#findProjectVos(com.oci.domain.searcher.ProjectSearcher) 
	*/
	@Override
	public List<ProjectVo> findProjectVos(ProjectSearcher project) {
		// TODO Auto-generated method stub
		return projectDAO.findProjectVos(project);
	}

}
