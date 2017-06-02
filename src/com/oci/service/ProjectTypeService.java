/**   
  * @Title: ProjectTypeService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午8:24:11 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import com.oci.domain.ProjectType;
import com.oci.domain.searcher.ProjectTypeSearcher;
import com.oci.domain.vo.ProjectTypeVo;

/** 
 * @ClassName: ProjectTypeService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午8:24:11 
 *  
 */
public interface ProjectTypeService {
	public List<ProjectTypeVo> findAllProjectTypeVo();
	public List<ProjectTypeVo> findProjectTypeVos(ProjectTypeSearcher projectType);
	public ProjectType findProjectType(Integer projectTypeId);
	public ProjectTypeVo findProjectTypeVo(Integer projectTypeId);

	public void updateProjectType(ProjectType projectType);
	public void insertProjectType(ProjectType projectType);
	public void deleteProjectTypes(List<Integer> projectTypeIds);
	public void deleteProjectType(Integer projectTypeId);
}
