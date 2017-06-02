/**   
  * @Title: ProjectService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:53:00 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import com.oci.domain.Project;
import com.oci.domain.searcher.ProjectSearcher;
import com.oci.domain.vo.ProjectVo;

/** 
 * @ClassName: ProjectService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:53:00 
 *  
 */
public interface ProjectService {
	public List<ProjectVo> findAllProjectVo();
	public List<ProjectVo> findProjectVos(ProjectSearcher project);
	public Project findProject(Integer projectId);
	public ProjectVo findProjectVo(Integer projectId);
	public void updateProject(Project project);
	public void insertProject(Project project);
	public void deleteProjects(List<Integer> projectIds);
	public void deleteProject(Integer projectId);
}
