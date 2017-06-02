/**   
  * @Title: RoleAndGroupDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午4:26:18 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.RoleAndGroup;
import com.oci.domain.searcher.RoleAndGroupSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleAndGroupVo;
import com.oci.mapper.RoleAndGroupMapper;

/** 
 * @ClassName: RoleAndGroupDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午4:26:18 
 *  
 */

@Repository
public class RoleAndGroupDAOImpl implements RoleAndGroupDAO {
	
	@Autowired
	private RoleAndGroupMapper roleAndGroupMapper;
	
	
	public void setRoleAndGroupMapper(RoleAndGroupMapper roleAndGroupMapper) {
		this.roleAndGroupMapper = roleAndGroupMapper;
	}


	/* (非 Javadoc) 
	 * <p>Title: findAllRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.RoleAndGroupDAO#findAllRoleAndGroup() 
	 */
	@Override
	public List<RoleAndGroupVo> findAllRoleAndGroupVo() {
		// TODO Auto-generated method stub
		return roleAndGroupMapper.findAllRoleAndGroupVo();
	}




	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroupByGroupId</p> 
	 * <p>Description: </p> 
	 * @param groupId
	 * @return 
	 * @see com.oci.dao.RoleAndGroupDAO#findRoleAndGroupByGroupId(java.lang.Integer) 
	*/
	@Override
	public List<RoleForOtherVo> findRGRoleVos(Integer groupId) {
		// TODO Auto-generated method stub
		return roleAndGroupMapper.findRGRoleVos(groupId);
	}


	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param id
	 * @return 
	 * @see com.oci.dao.RoleAndGroupDAO#findRoleAndGroup(java.lang.Integer) 
	*/
	@Override
	public RoleAndGroup findRoleAndGroup(Integer roleGroupId) {
		// TODO Auto-generated method stub
		return roleAndGroupMapper.findRoleAndGroup(roleGroupId);
	}
	
	

	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroupVo</p> 
	 * <p>Description: </p> 
	 * @param roleGroupId
	 * @return 
	 * @see com.oci.dao.RoleAndGroupDAO#findRoleAndGroupVo(java.lang.Integer) 
	*/
	@Override
	public RoleAndGroupVo findRoleAndGroupVo(Integer roleGroupId) {
		// TODO Auto-generated method stub
		return roleAndGroupMapper.findRoleAndGroupVo(roleGroupId);
	}


	/* (非 Javadoc) 
	 * <p>Title: updateRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param roleGroup 
	 * @see com.oci.dao.RoleAndGroupDAO#updateRoleAndGroup(com.oci.domain.RoleAndGroup) 
	*/
	@Override
	public void updateRoleAndGroup(RoleAndGroup roleGroup) {
		// TODO Auto-generated method stub
		roleAndGroupMapper.updateRoleAndGroup(roleGroup);
	}


	/* (非 Javadoc) 
	 * <p>Title: insertRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param roleGroup 
	 * @see com.oci.dao.RoleAndGroupDAO#insertRoleAndGroup(com.oci.domain.RoleAndGroup) 
	*/
	@Override
	public void insertRoleAndGroup(RoleAndGroup roleGroup) {
		roleAndGroupMapper.insertRoleAndGroup(roleGroup);
	}


	/* (非 Javadoc) 
	 * <p>Title: deleteRoleAndGroups</p> 
	 * <p>Description: </p> 
	 * @param ids 
	 * @see com.oci.dao.RoleAndGroupDAO#deleteRoleAndGroups(java.util.List) 
	*/
	@Override
	public void deleteRoleAndGroups(List<Integer> roleGroupIds) {
		roleAndGroupMapper.deleteRoleAndGroups(roleGroupIds);
		
	}


	/* (非 Javadoc) 
	 * <p>Title: deleteRoleAndGroups</p> 
	 * <p>Description: </p> 
	 * @param id 
	 * @see com.oci.dao.RoleAndGroupDAO#deleteRoleAndGroups(java.lang.Integer) 
	*/
	@Override
	public void deleteRoleAndGroup(Integer roleGroupId) {
		// TODO Auto-generated method stub
		roleAndGroupMapper.deleteRoleAndGroup(roleGroupId);
	}


	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroupVos</p> 
	 * <p>Description: </p> 
	 * @param roleAndGroup
	 * @return 
	 * @see com.oci.dao.RoleAndGroupDAO#findRoleAndGroupVos(com.oci.domain.searcher.RoleAndGroupSearcher) 
	*/
	@Override
	public List<RoleAndGroupVo> findRoleAndGroupVos(
			RoleAndGroupSearcher roleAndGroup) {
		// TODO Auto-generated method stub
		return roleAndGroupMapper.findRoleAndGroupVos(roleAndGroup);
	}



}
