/**   
  * @Title: ProjectAndTypeDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午8:05:25 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.ProjectAndType;
import com.oci.domain.vo.ProjectAndTypeVo;
import com.oci.mapper.ProjectAndTypeMapper;

/** 
 * @ClassName: ProjectAndTypeDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午8:05:25 
 *  
 */
@Repository
public class ProjectAndTypeDAOImpl implements ProjectAndTypeDAO {
	
	@Autowired
	private ProjectAndTypeMapper projectAndTypeMapper;
	
	
	
	
	public ProjectAndTypeMapper getProjectAndTypeMapper() {
		return projectAndTypeMapper;
	}

	public void setProjectAndTypeMapper(ProjectAndTypeMapper projectAndTypeMapper) {
		this.projectAndTypeMapper = projectAndTypeMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllProjectAndTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.ProjectAndTypeDAO#findAllProjectAndTypeVo() 
	 */
	@Override
	public List<ProjectAndTypeVo> findAllProjectAndTypeVo() {
		// TODO Auto-generated method stub
		return projectAndTypeMapper.findAllProjectAndTypeVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectAndTypeVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.ProjectAndTypeDAO#findProjectAndTypeVos(java.util.Map) 
	 */
	@Override
	public List<ProjectAndTypeVo> findProjectAndTypeVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return projectAndTypeMapper.findProjectAndTypeVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeId
	 * @return 
	 * @see com.oci.dao.ProjectAndTypeDAO#findProjectAndType(java.lang.Integer) 
	 */
	@Override
	public ProjectAndType findProjectAndType(Integer projectAndTypeId) {
		// TODO Auto-generated method stub
		return projectAndTypeMapper.findProjectAndType(projectAndTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectAndTypeVo</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeId
	 * @return 
	 * @see com.oci.dao.ProjectAndTypeDAO#findProjectAndTypeVo(java.lang.Integer) 
	 */
	@Override
	public ProjectAndTypeVo findProjectAndTypeVo(Integer projectAndTypeId) {
		// TODO Auto-generated method stub
		return projectAndTypeMapper.findProjectAndTypeVo(projectAndTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndType 
	 * @see com.oci.dao.ProjectAndTypeDAO#updateProjectAndType(com.oci.domain.ProjectAndType) 
	 */
	@Override
	public void updateProjectAndType(ProjectAndType projectAndType) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.updateProjectAndType(projectAndType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndType 
	 * @see com.oci.dao.ProjectAndTypeDAO#insertProjectAndType(com.oci.domain.ProjectAndType) 
	 */
	@Override
	public void insertProjectAndType(ProjectAndType projectAndType) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.insertProjectAndType(projectAndType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndTypes</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeIds 
	 * @see com.oci.dao.ProjectAndTypeDAO#deleteProjectAndTypes(java.util.List) 
	 */
	@Override
	public void deleteProjectAndTypes(List<Integer> projectAndTypeIds) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.deleteProjectAndTypes(projectAndTypeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeIds 
	 * @see com.oci.dao.ProjectAndTypeDAO#deleteProjectAndType(java.lang.Integer) 
	 */
	@Override
	public void deleteProjectAndType(Integer projectAndTypeIds) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.deleteProjectAndType(projectAndTypeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndTypeByProjectId</p> 
	 * <p>Description: </p> 
	 * @param projectIds 
	 * @see com.oci.dao.ProjectAndTypeDAO#deleteProjectAndTypeByProjectId(java.lang.Integer) 
	*/
	@Override
	public void deleteProjectAndTypeByProjectId(Integer projectId) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.deleteProjectAndTypeByProjectId(projectId);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndTypeByProjectTypeId</p> 
	 * <p>Description: </p> 
	 * @param projectTypeIds 
	 * @see com.oci.dao.ProjectAndTypeDAO#deleteProjectAndTypeByProjectTypeId(java.lang.Integer) 
	*/
	@Override
	public void deleteProjectAndTypeByProjectTypeId(Integer projectTypeId) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.deleteProjectAndTypeByProjectTypeId(projectTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndTypesByProjectId</p> 
	 * <p>Description: </p> 
	 * @param projectIds 
	 * @see com.oci.dao.ProjectAndTypeDAO#deleteProjectAndTypesByProjectId(java.util.List) 
	*/
	@Override
	public void deleteProjectAndTypesByProjectId(List<Integer> projectIds) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.deleteProjectAndTypesByProjectId(projectIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndTypesByProjectTypeId</p> 
	 * <p>Description: </p> 
	 * @param projectTypeIds 
	 * @see com.oci.dao.ProjectAndTypeDAO#deleteProjectAndTypesByProjectTypeId(java.util.List) 
	*/
	@Override
	public void deleteProjectAndTypesByProjectTypeId(
			List<Integer> projectTypeIds) {
		// TODO Auto-generated method stub
		projectAndTypeMapper.deleteProjectAndTypesByProjectTypeId(projectTypeIds);
	}

}
