/**   
  * @Title: ProjectTypeDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午6:51:13 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.ProjectType;
import com.oci.domain.searcher.ProjectTypeSearcher;
import com.oci.domain.vo.ProjectTypeVo;
import com.oci.mapper.ProjectTypeMapper;

/** 
 * @ClassName: ProjectTypeDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午6:51:13 
 *  
 */
@Repository
public class ProjectTypeDAOImpl implements ProjectTypeDAO {
	
	@Autowired
	private ProjectTypeMapper projectTypeMapper;

	public void setProjectTypeMapper(ProjectTypeMapper projectTypeMapper) {
		this.projectTypeMapper = projectTypeMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProjectTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.ProjectTypeDAO#findAllProjectTypeVo() 
	 */
	@Override
	public List<ProjectTypeVo> findAllProjectTypeVo() {
		// TODO Auto-generated method stub
		return projectTypeMapper.findAllProjectTypeVo();
	}


	/* (非 Javadoc) 
	 * <p>Title: findProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectTypeId
	 * @return 
	 * @see com.oci.dao.ProjectTypeDAO#findProjectType(java.lang.Integer) 
	 */
	@Override
	public ProjectType findProjectType(Integer projectTypeId) {
		// TODO Auto-generated method stub
		return projectTypeMapper.findProjectType(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectTypeVo</p> 
	 * <p>Description: </p> 
	 * @param projectTypeId
	 * @return 
	 * @see com.oci.dao.ProjectTypeDAO#findProjectTypeVo(java.lang.Integer) 
	 */
	@Override
	public ProjectTypeVo findProjectTypeVo(Integer projectTypeId) {
		// TODO Auto-generated method stub
		return projectTypeMapper.findProjectTypeVo(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectType 
	 * @see com.oci.dao.ProjectTypeDAO#updateProjectType(com.oci.domain.ProjectType) 
	 */
	@Override
	public void updateProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		projectTypeMapper.updateProjectType(projectType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectType 
	 * @see com.oci.dao.ProjectTypeDAO#insertProjectType(com.oci.domain.ProjectType) 
	 */
	@Override
	public void insertProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		projectTypeMapper.insertProjectType(projectType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectTypes</p> 
	 * <p>Description: </p> 
	 * @param projectTypeIds 
	 * @see com.oci.dao.ProjectTypeDAO#deleteProjectTypes(java.util.List) 
	 */
	@Override
	public void deleteProjectTypes(List<Integer> projectTypeIds) {
		// TODO Auto-generated method stub
		projectTypeMapper.deleteProjectTypes(projectTypeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectTypeId 
	 * @see com.oci.dao.ProjectTypeDAO#deleteProjectType(java.lang.Integer) 
	 */
	@Override
	public void deleteProjectType(Integer projectTypeId) {
		// TODO Auto-generated method stub
		projectTypeMapper.deleteProjectType(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectTypeVos</p> 
	 * <p>Description: </p> 
	 * @param projectType
	 * @return 
	 * @see com.oci.dao.ProjectTypeDAO#findProjectTypeVos(com.oci.domain.searcher.ProjectTypeSearcher) 
	*/
	@Override
	public List<ProjectTypeVo> findProjectTypeVos(
			ProjectTypeSearcher projectType) {
		// TODO Auto-generated method stub
		return projectTypeMapper.findProjectTypeVos(projectType);
	}

}
