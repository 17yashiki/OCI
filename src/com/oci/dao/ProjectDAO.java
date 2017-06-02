/**   
  * @Title: ProjectDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午5:43:52 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import com.oci.domain.Project;
import com.oci.domain.searcher.ProjectSearcher;
import com.oci.domain.vo.ProjectVo;

/** 
 * @ClassName: ProjectDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午5:43:52 
 *  
 */
public interface ProjectDAO {
	public List<ProjectVo> findAllProjectVo();
	public List<ProjectVo> findProjectVos(ProjectSearcher project);
	public Project findProject(Integer projectId);
	public ProjectVo findProjectVo(Integer projectId);
	public void updateProject(Project project);
	public void insertProject(Project project);
	public void deleteProjects(List<Integer> projectIds);
	public void deleteProject(Integer projectId);
}
