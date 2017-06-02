/**   
  * @Title: RoleService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午8:26:51 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;






import com.oci.domain.Role;
import com.oci.domain.searcher.RoleSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleVo;

/** 
 * @ClassName: RoleService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午8:26:51 
 *  
 */
public interface RoleService {
	

	public List<RoleVo> findAllRoleVo();
	public List<RoleForOtherVo> findAllRoleForOtherVo();
	
	public List<RoleVo> findRoleVos(Map<String,String> map);
	
	
	public List<RoleVo> findRoleVos(RoleSearcher role);
	public RoleVo findRoleVo(Integer roleId);
	
	public Role findRole(Integer roleId);

	public void updateRole(Role role);

	public void insertRole(Role role);
	
	public void deleteRoles(List<Integer> roleIds);
	
	public void deleteRole(Integer roleId);
}
