/**   
  * @Title: ProjectTypeServiceImple.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午9:15:48 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.ProjectAndTypeDAO;
import com.oci.dao.ProjectTypeDAO;
import com.oci.domain.ProjectType;
import com.oci.domain.searcher.ProjectTypeSearcher;
import com.oci.domain.vo.ProjectTypeVo;

/** 
 * @ClassName: ProjectTypeServiceImple 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午9:15:48 
 *  
 */
@Service
@Transactional
public class ProjectTypeServiceImple implements ProjectTypeService {
	
	@Autowired
	private ProjectTypeDAO projectTypeDAO;
	
	@Autowired
	private ProjectAndTypeDAO projectAndTypeDAO;
	
	public void setProjectTypeDAO(ProjectTypeDAO projectTypeDAO) {
		this.projectTypeDAO = projectTypeDAO;
	}

	public void setProjectAndTypeDAO(ProjectAndTypeDAO projectAndTypeDAO) {
		this.projectAndTypeDAO = projectAndTypeDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProjectTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.ProjectTypeService#findAllProjectTypeVo() 
	 */
	@Override
	public List<ProjectTypeVo> findAllProjectTypeVo() {
		// TODO Auto-generated method stub
		return projectTypeDAO.findAllProjectTypeVo();
	}


	/* (非 Javadoc) 
	 * <p>Title: findProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectTypeId
	 * @return 
	 * @see com.oci.service.ProjectTypeService#findProjectType(java.lang.Integer) 
	 */
	@Override
	public ProjectType findProjectType(Integer projectTypeId) {
		// TODO Auto-generated method stub
		return projectTypeDAO.findProjectType(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectTypeVo</p> 
	 * <p>Description: </p> 
	 * @param projectTypeId
	 * @return 
	 * @see com.oci.service.ProjectTypeService#findProjectTypeVo(java.lang.Integer) 
	 */
	@Override
	public ProjectTypeVo findProjectTypeVo(Integer projectTypeId) {
		// TODO Auto-generated method stub
		return projectTypeDAO.findProjectTypeVo(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectType 
	 * @see com.oci.service.ProjectTypeService#updateProjectType(com.oci.domain.ProjectType) 
	 */
	@Override
	public void updateProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		projectTypeDAO.updateProjectType(projectType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectType 
	 * @see com.oci.service.ProjectTypeService#insertProjectType(com.oci.domain.ProjectType) 
	 */
	@Override
	public void insertProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		projectTypeDAO.insertProjectType(projectType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectTypes</p> 
	 * <p>Description: </p> 
	 * @param projectTypeIds 
	 * @see com.oci.service.ProjectTypeService#deleteProjectTypes(java.util.List) 
	 */
	@Override
	public void deleteProjectTypes(List<Integer> projectTypeIds) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.deleteProjectAndTypesByProjectTypeId(projectTypeIds);
		projectTypeDAO.deleteProjectTypes(projectTypeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectType</p> 
	 * <p>Description: </p> 
	 * @param projectTypeId 
	 * @see com.oci.service.ProjectTypeService#deleteProjectType(java.lang.Integer) 
	 */
	@Override
	public void deleteProjectType(Integer projectTypeId) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.deleteProjectAndTypeByProjectTypeId(projectTypeId);
		projectTypeDAO.deleteProjectType(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectTypeVos</p> 
	 * <p>Description: </p> 
	 * @param projectType
	 * @return 
	 * @see com.oci.service.ProjectTypeService#findProjectTypeVos(com.oci.domain.searcher.ProjectTypeSearcher) 
	*/
	@Override
	public List<ProjectTypeVo> findProjectTypeVos(
			ProjectTypeSearcher projectType) {
		// TODO Auto-generated method stub
		return projectTypeDAO.findProjectTypeVos(projectType);
	}

}
