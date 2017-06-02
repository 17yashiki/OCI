/**   
  * @Title: ProjectTypeMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午6:50:30 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;

import com.oci.domain.ProjectType;
import com.oci.domain.searcher.ProjectTypeSearcher;
import com.oci.domain.vo.PTForOtherVo;
import com.oci.domain.vo.ProjectTypeVo;

/** 
 * @ClassName: ProjectTypeMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午6:50:30 
 *  
 */
public interface ProjectTypeMapper {
	public List<ProjectTypeVo> findAllProjectTypeVo();
	public List<ProjectTypeVo> findProjectTypeVos(ProjectTypeSearcher projectType);
	public ProjectType findProjectType(Integer projectTypeId);
	public ProjectTypeVo findProjectTypeVo(Integer projectTypeId);
	public PTForOtherVo findPTForOtherVo(Integer projectTypeId);
	
	public void updateProjectType(ProjectType projectType);
	public void insertProjectType(ProjectType projectType);
	public void deleteProjectTypes(List<Integer> projectTypeIds);
	public void deleteProjectType(Integer projectTypeId);

}
