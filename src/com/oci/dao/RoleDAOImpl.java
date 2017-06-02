/**   
  * @Title: RoleDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午8:24:50 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Role;
import com.oci.domain.searcher.RoleSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleVo;
import com.oci.mapper.RoleMapper;

/** 
 * @ClassName: RoleDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午8:24:50 
 *  
 */
@Repository
public class RoleDAOImpl implements RoleDAO {
	@Autowired
	private RoleMapper roleMapper;

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRole</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.RoleDAO#findAllRole() 
	*/
	@Override
	public List<RoleVo> findAllRoleVo() {
		// TODO Auto-generated method stub
		return roleMapper.findAllRoleVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findRole</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.RoleDAO#findRole(java.util.Map) 
	*/
	@Override
	public List<RoleVo> findRoleVos(Map<String, String> map) {
		// TODO Auto-generated method stub
		return roleMapper.findRoleVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRole</p> 
	 * <p>Description: </p> 
	 * @param role 
	 * @see com.oci.dao.RoleDAO#updateRole(com.oci.domain.Role) 
	*/
	@Override
	public void updateRole(Role role) {
		roleMapper.updateRole(role);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRole</p> 
	 * <p>Description: </p> 
	 * @param role 
	 * @see com.oci.dao.RoleDAO#insertRole(com.oci.domain.Role) 
	*/
	@Override
	public void insertRole(Role role) {
		roleMapper.insertRole(role);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRole</p> 
	 * <p>Description: </p> 
	 * @param roleIds 
	 * @see com.oci.dao.RoleDAO#deleteRole(java.util.List) 
	*/
	@Override
	public void deleteRoles(List<Integer> roleIds) {
		roleMapper.deleteRoles(roleIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRole</p> 
	 * <p>Description: </p> 
	 * @param roleId 
	 * @see com.oci.dao.RoleDAO#deleteRole(java.lang.Integer) 
	*/
	@Override
	public void deleteRole(Integer roleId) {
		roleMapper.deleteRole(roleId);
		
	}

	/* (非 Javadoc) 
	 * <p>Title: findRole</p> 
	 * <p>Description: </p> 
	 * @param roleId
	 * @return 
	 * @see com.oci.dao.RoleDAO#findRole(java.lang.Integer) 
	*/
	@Override
	public Role findRole(Integer roleId) {
		// TODO Auto-generated method stub
		return roleMapper.findRole(roleId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleVo</p> 
	 * <p>Description: </p> 
	 * @param roleId
	 * @return 
	 * @see com.oci.dao.RoleDAO#findRoleVo(java.lang.Integer) 
	*/
	@Override
	public RoleVo findRoleVo(Integer roleId) {
		// TODO Auto-generated method stub
		return roleMapper.findRoleVo(roleId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleVos</p> 
	 * <p>Description: </p> 
	 * @param role
	 * @return 
	 * @see com.oci.dao.RoleDAO#findRoleVos(com.oci.domain.vo.RoleForSercherVo) 
	*/
	@Override
	public List<RoleVo> findRoleVos(RoleSearcher role) {
		// TODO Auto-generated method stub
		return roleMapper.findRoleVos(role);
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRoleForOtherVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.RoleDAO#findAllRoleForOtherVo() 
	*/
	@Override
	public List<RoleForOtherVo> findAllRoleForOtherVo() {
		// TODO Auto-generated method stub
		return roleMapper.findAllRoleForOtherVo();
	}
	
	
}
