/**   
  * @Title: ProjectDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:44:34 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Project;
import com.oci.domain.searcher.ProjectSearcher;
import com.oci.domain.vo.ProjectVo;
import com.oci.mapper.ProjectMapper;

/** 
 * @ClassName: ProjectDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:44:34 
 *  
 */
@Repository
public class ProjectDAOImpl implements ProjectDAO {
		
	@Autowired
	private ProjectMapper projectMapper;
	
	
	public void setProjectMapper(ProjectMapper projectMapper) {
		this.projectMapper = projectMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProjectVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.ProjectDAO#findAllProjectVo() 
	 */
	@Override
	public List<ProjectVo> findAllProjectVo() {
		// TODO Auto-generated method stub
		return projectMapper.findAllProjectVo();
	}


	/* (非 Javadoc) 
	 * <p>Title: findProject</p> 
	 * <p>Description: </p> 
	 * @param projectId
	 * @return 
	 * @see com.oci.dao.ProjectDAO#findProject(java.lang.Integer) 
	 */
	@Override
	public Project findProject(Integer projectId) {
		// TODO Auto-generated method stub
		return projectMapper.findProject(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectVo</p> 
	 * <p>Description: </p> 
	 * @param projectId
	 * @return 
	 * @see com.oci.dao.ProjectDAO#findProjectVo(java.lang.Integer) 
	 */
	@Override
	public ProjectVo findProjectVo(Integer projectId) {
		// TODO Auto-generated method stub
		return projectMapper.findProjectVo(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProject</p> 
	 * <p>Description: </p> 
	 * @param project 
	 * @see com.oci.dao.ProjectDAO#updateProject(com.oci.domain.Project) 
	 */
	@Override
	public void updateProject(Project project) {
		projectMapper.updateProject(project);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProject</p> 
	 * <p>Description: </p> 
	 * @param project 
	 * @see com.oci.dao.ProjectDAO#insertProject(com.oci.domain.Project) 
	 */
	@Override
	public void insertProject(Project project) {
		projectMapper.insertProject(project);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjects</p> 
	 * <p>Description: </p> 
	 * @param projectIds 
	 * @see com.oci.dao.ProjectDAO#deleteProjects(java.util.List) 
	 */
	@Override
	public void deleteProjects(List<Integer> projectIds) {
		projectMapper.deleteProjects(projectIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProject</p> 
	 * <p>Description: </p> 
	 * @param projectId 
	 * @see com.oci.dao.ProjectDAO#deleteProject(java.lang.Integer) 
	 */
	@Override
	public void deleteProject(Integer projectId) {
		projectMapper.deleteProject(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectVos</p> 
	 * <p>Description: </p> 
	 * @param project
	 * @return 
	 * @see com.oci.dao.ProjectDAO#findProjectVos(com.oci.domain.searcher.ProjectSearcher) 
	*/
	@Override
	public List<ProjectVo> findProjectVos(ProjectSearcher project) {
		// TODO Auto-generated method stub
		return projectMapper.findProjectVos(project);
	}

}
