/**   
  * @Title: ProjectAndTypeDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午8:04:51 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import com.oci.domain.ProjectAndType;
import com.oci.domain.vo.ProjectAndTypeVo;

/** 
 * @ClassName: ProjectAndTypeDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午8:04:51 
 *  
 */
public interface ProjectAndTypeDAO {
	public List<ProjectAndTypeVo> findAllProjectAndTypeVo();
	public List<ProjectAndTypeVo> findProjectAndTypeVos(Map<String,Object> map);
	public ProjectAndType findProjectAndType(Integer projectAndTypeId);
	public ProjectAndTypeVo findProjectAndTypeVo(Integer projectAndTypeId);
	
	public void updateProjectAndType(ProjectAndType projectAndType);
	public void insertProjectAndType(ProjectAndType projectAndType);
	public void deleteProjectAndTypes(List<Integer> projectAndTypeIds);
	public void deleteProjectAndTypesByProjectId(List<Integer> projectIds);
	public void deleteProjectAndTypesByProjectTypeId(List<Integer> projectTypeIds);
	public  void deleteProjectAndType(Integer projectAndTypeIds);
	public  void deleteProjectAndTypeByProjectId(Integer projectId);
	public  void deleteProjectAndTypeByProjectTypeId(Integer projectTypeId);
	
}
