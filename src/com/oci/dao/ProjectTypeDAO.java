/**   
  * @Title: ProjectTypeDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午6:41:14 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import com.oci.domain.ProjectType;
import com.oci.domain.searcher.ProjectTypeSearcher;
import com.oci.domain.vo.ProjectTypeVo;

/** 
 * @ClassName: ProjectTypeDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午6:41:14 
 *  
 */
public interface ProjectTypeDAO {
	public List<ProjectTypeVo> findAllProjectTypeVo();
	public List<ProjectTypeVo> findProjectTypeVos(ProjectTypeSearcher projectType);
	public ProjectType findProjectType(Integer projectTypeId);
	public ProjectTypeVo findProjectTypeVo(Integer projectTypeId);

	public void updateProjectType(ProjectType projectType);
	public void insertProjectType(ProjectType projectType);
	public void deleteProjectTypes(List<Integer> projectTypeIds);
	public void deleteProjectType(Integer projectTypeId);
}
