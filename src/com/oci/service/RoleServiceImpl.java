/**   
  * @Title: RoleServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午8:27:06 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.RoleDAO;
import com.oci.domain.Role;
import com.oci.domain.searcher.RoleSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleVo;

/** 
 * @ClassName: RoleServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午8:27:06 
 *  
 */
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Resource
	@Autowired
	private RoleDAO roleDAO;

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRole</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.RoleService#findAllRole() 
	*/
	@Override
	public List<RoleVo> findAllRoleVo() {
		return roleDAO.findAllRoleVo();
	}



	/* (非 Javadoc) 
	 * <p>Title: updateRole</p> 
	 * <p>Description: </p> 
	 * @param role 
	 * @see com.oci.service.RoleService#updateRole(com.oci.domain.Role) 
	*/
	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		roleDAO.updateRole(role);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRole</p> 
	 * <p>Description: </p> 
	 * @param role 
	 * @see com.oci.service.RoleService#insertRole(com.oci.domain.Role) 
	*/
	@Override
	public void insertRole(Role role) {
		roleDAO.insertRole(role);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRole</p> 
	 * <p>Description: </p> 
	 * @param roleIds 
	 * @see com.oci.service.RoleService#deleteRole(java.util.List) 
	*/
	@Override
	public void deleteRoles(List<Integer> roleIds) {
		if(!roleIds.isEmpty()){
			roleDAO.deleteRoles(roleIds);
		}	
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRole</p> 
	 * <p>Description: </p> 
	 * @param roleId 
	 * @see com.oci.service.RoleService#deleteRole(java.lang.Integer) 
	*/
	@Override
	public void deleteRole(Integer roleId) {
		roleDAO.deleteRole(roleId);
		
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleByPamater</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.RoleService#findRoleByPamater(java.util.Map) 
	*/
	@Override
	public List<RoleVo> findRoleVos(Map<String, String> map) {
		// TODO Auto-generated method stub
		return roleDAO.findRoleVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRole</p> 
	 * <p>Description: </p> 
	 * @param roleId
	 * @return 
	 * @see com.oci.service.RoleService#findRole(java.lang.Integer) 
	*/
	@Override
	public RoleVo findRoleVo(Integer roleId) {
		// TODO Auto-generated method stub
		return roleDAO.findRoleVo(roleId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRole</p> 
	 * <p>Description: </p> 
	 * @param roleId
	 * @return 
	 * @see com.oci.service.RoleService#findRole(java.lang.Integer) 
	*/
	@Override
	public Role findRole(Integer roleId) {
		// TODO Auto-generated method stub
		return roleDAO.findRole(roleId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleVos</p> 
	 * <p>Description: </p> 
	 * @param role
	 * @return 
	 * @see com.oci.service.RoleService#findRoleVos(com.oci.domain.vo.RoleForSercherVo) 
	*/
	@Override
	public List<RoleVo> findRoleVos(RoleSearcher role) {
		// TODO Auto-generated method stub
		return roleDAO.findRoleVos(role);
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllRoleForOtherVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.RoleService#findAllRoleForOtherVo() 
	*/
	@Override
	public List<RoleForOtherVo> findAllRoleForOtherVo() {
		// TODO Auto-generated method stub
		return roleDAO.findAllRoleForOtherVo();
	}
	
	
	
}
