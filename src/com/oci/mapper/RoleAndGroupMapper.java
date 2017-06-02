/**   
  * @Title: RoleGroupMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午7:29:25 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;

import com.oci.domain.RoleAndGroup;
import com.oci.domain.searcher.RoleAndGroupSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleAndGroupVo;

/** 
 * @ClassName: RoleGroupMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午7:29:25 
 *  
 */
public interface RoleAndGroupMapper {
	public List<RoleAndGroupVo> findAllRoleAndGroupVo();

	public List<RoleAndGroupVo> findRoleAndGroupVos(RoleAndGroupSearcher roleAndGroup);
	
	public List<RoleForOtherVo> findRGRoleVos(Integer groupId);

	public RoleAndGroupVo findRoleAndGroupVo(Integer roleGroupId);
	
	public RoleAndGroup findRoleAndGroup(Integer roleGroupId);
	
	public void updateRoleAndGroup(RoleAndGroup roleGroup);
	
	public void insertRoleAndGroup(RoleAndGroup roleGroup);
	
	public void deleteRoleAndGroups(List<Integer> roleGroupIds);
	
	public void deleteRoleAndGroup(Integer roleGroupId);

}
