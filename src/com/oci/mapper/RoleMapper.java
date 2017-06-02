/**   
  * @Title: RoleMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午7:29:03 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;
import java.util.Map;

import com.oci.domain.Role;
import com.oci.domain.searcher.RoleSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleVo;

/** 
 * @ClassName: RoleMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午7:29:03 
 *  
 */
public interface RoleMapper {
	public List<RoleVo> findAllRoleVo();
	
	public List<RoleForOtherVo> findAllRoleForOtherVo();
	
	public List<RoleVo> findRoleVos(Map<String,String> map);
	
	public List<RoleVo> findRoleVos(RoleSearcher role);
	
	public RoleVo findRoleVo(Integer roleId);
	
	public Role findRole(Integer roleId);
	
	public RoleForOtherVo findRoleForOtherVo(Integer roleId);

	public List<RoleForOtherVo> findRoleForOtherVoByGroupId(Integer groupId);
	
	
	
	public void updateRole(Role role);
	
	public void insertRole(Role role);
	
	public void deleteRoles(List<Integer> roleIds);
	
	public void deleteRole(Integer roleId);

}
