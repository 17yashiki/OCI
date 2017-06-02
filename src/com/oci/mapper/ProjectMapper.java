/**   
  * @Title: ProjectMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:32:38 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;

import com.oci.domain.Project;
import com.oci.domain.searcher.ProjectSearcher;
import com.oci.domain.vo.ProjectForOtherVo;
import com.oci.domain.vo.ProjectVo;

/** 
 * @ClassName: ProjectMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:32:38 
 *  
 */
public interface ProjectMapper {
	public List<ProjectVo> findAllProjectVo();
	public List<ProjectVo> findProjectVos(ProjectSearcher project);
	public Project findProject(Integer projectId);
	public ProjectVo findProjectVo(Integer projectId);
	public ProjectForOtherVo findProjectForOtherVo(Integer projectId);
	
	public void updateProject(Project project);
	public void insertProject(Project project);
	public void deleteProjects(List<Integer> projectIds);
	public void deleteProject(Integer projectId);
}
