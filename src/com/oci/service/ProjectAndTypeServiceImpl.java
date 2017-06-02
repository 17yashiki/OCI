/**   
  * @Title: ProjectAndTypeServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午8:44:02 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.ProjectAndTypeDAO;
import com.oci.domain.ProjectAndType;
import com.oci.domain.vo.ProjectAndTypeVo;

/** 
 * @ClassName: ProjectAndTypeServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午8:44:02 
 *  
 */

@Service
@Transactional
public class ProjectAndTypeServiceImpl implements ProjectAndTypeService {
	
	@Autowired
	private ProjectAndTypeDAO projectAndTypeDAO;
	
	
	/* (非 Javadoc) 
	 * <p>Title: findAllProjectAndTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.ProjectAndTypeService#findAllProjectAndTypeVo() 
	 */
	@Override
	public List<ProjectAndTypeVo> findAllProjectAndTypeVo() {
		// TODO Auto-generated method stub
		return projectAndTypeDAO.findAllProjectAndTypeVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectAndTypeVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.ProjectAndTypeService#findProjectAndTypeVos(java.util.Map) 
	 */
	@Override
	public List<ProjectAndTypeVo> findProjectAndTypeVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return projectAndTypeDAO.findProjectAndTypeVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeId
	 * @return 
	 * @see com.oci.service.ProjectAndTypeService#findProjectAndType(java.lang.Integer) 
	 */
	@Override
	public ProjectAndType findProjectAndType(Integer projectAndTypeId) {
		// TODO Auto-generated method stub
		return projectAndTypeDAO.findProjectAndType(projectAndTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findProjectAndTypeVo</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeId
	 * @return 
	 * @see com.oci.service.ProjectAndTypeService#findProjectAndTypeVo(java.lang.Integer) 
	 */
	@Override
	public ProjectAndTypeVo findProjectAndTypeVo(Integer projectAndTypeId) {
		// TODO Auto-generated method stub
		return projectAndTypeDAO.findProjectAndTypeVo(projectAndTypeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndType 
	 * @see com.oci.service.ProjectAndTypeService#updateProjectAndType(com.oci.domain.ProjectAndType) 
	 */
	@Override
	public void updateProjectAndType(ProjectAndType projectAndType) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.updateProjectAndType(projectAndType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndType 
	 * @see com.oci.service.ProjectAndTypeService#insertProjectAndType(com.oci.domain.ProjectAndType) 
	 */
	@Override
	public void insertProjectAndType(ProjectAndType projectAndType) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.insertProjectAndType(projectAndType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndTypes</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeIds 
	 * @see com.oci.service.ProjectAndTypeService#deleteProjectAndTypes(java.util.List) 
	 */
	@Override
	public void deleteProjectAndTypes(List<Integer> projectAndTypeIds) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.deleteProjectAndTypes(projectAndTypeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteProjectAndType</p> 
	 * <p>Description: </p> 
	 * @param projectAndTypeIds 
	 * @see com.oci.service.ProjectAndTypeService#deleteProjectAndType(java.lang.Integer) 
	 */
	@Override
	public void deleteProjectAndType(Integer projectAndTypeIds) {
		// TODO Auto-generated method stub
		projectAndTypeDAO.deleteProjectAndType(projectAndTypeIds);
	}

}
