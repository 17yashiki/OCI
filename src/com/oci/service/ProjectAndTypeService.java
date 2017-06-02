/**   
  * @Title: ProjectAndTypeService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月25日 下午8:23:55 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import com.oci.domain.ProjectAndType;
import com.oci.domain.vo.ProjectAndTypeVo;

/** 
 * @ClassName: ProjectAndTypeService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月25日 下午8:23:55 
 *  
 */
public interface ProjectAndTypeService {
	public List<ProjectAndTypeVo> findAllProjectAndTypeVo();
	public List<ProjectAndTypeVo> findProjectAndTypeVos(Map<String,Object> map);
	public ProjectAndType findProjectAndType(Integer projectAndTypeId);
	public ProjectAndTypeVo findProjectAndTypeVo(Integer projectAndTypeId);
	
	public void updateProjectAndType(ProjectAndType projectAndType);
	public void insertProjectAndType(ProjectAndType projectAndType);
	public void deleteProjectAndTypes(List<Integer> projectAndTypeIds);
	public  void deleteProjectAndType(Integer projectAndTypeIds);
}
