/**   
  * @Title: RoleGroupDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午4:25:40 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import com.oci.domain.RoleAndGroup;
import com.oci.domain.searcher.RoleAndGroupSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleAndGroupVo;

/** 
 * @ClassName: RoleGroupDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午4:25:40 
 *  
 */
public interface RoleAndGroupDAO {
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
