/**   
  * @Title: RoleAndGroupServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午4:29:08 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.RoleAndGroupDAO;
import com.oci.domain.RoleAndGroup;
import com.oci.domain.searcher.RoleAndGroupSearcher;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.RoleAndGroupVo;

/** 
 * @ClassName: RoleAndGroupServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午4:29:08 
 *  
 */
@Service
@Transactional
public class RoleAndGroupServiceImpl implements RoleAndGroupService {
	
	@Resource
	@Autowired
	private RoleAndGroupDAO roleAndGroupDAO;
	
	/* (非 Javadoc) 
	 * <p>Title: findAllRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.RoleAndGroupService#findAllRoleAndGroup() 
	 */
	@Override
	public List<RoleAndGroupVo> findAllRoleAndGroupVo() {
		// TODO Auto-generated method stub
		return roleAndGroupDAO.findAllRoleAndGroupVo();
	}


	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroupByGroupId</p> 
	 * <p>Description: </p> 
	 * @param groupId
	 * @return 
	 * @see com.oci.service.RoleAndGroupService#findRoleAndGroupByGroupId(java.lang.Integer) 
	*/
	@Override
	public List<RoleForOtherVo> findRGRoleVos(Integer groupId) {
		// TODO Auto-generated method stub
		return roleAndGroupDAO.findRGRoleVos(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param id
	 * @return 
	 * @see com.oci.service.RoleAndGroupService#findRoleAndGroup(java.lang.Integer) 
	*/
	@Override
	public RoleAndGroup findRoleAndGroup(Integer roleGroupId) {
		// TODO Auto-generated method stub
		return roleAndGroupDAO.findRoleAndGroup(roleGroupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param roleGroup 
	 * @see com.oci.service.RoleAndGroupService#updateRoleAndGroup(com.oci.domain.RoleAndGroup) 
	*/
	@Override
	public void updateRoleAndGroup(RoleAndGroup roleGroup) {
		// TODO Auto-generated method stub
		roleAndGroupDAO.updateRoleAndGroup(roleGroup);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param roleGroup 
	 * @see com.oci.service.RoleAndGroupService#insertRoleAndGroup(com.oci.domain.RoleAndGroup) 
	*/
	@Override
	public void insertRoleAndGroup(RoleAndGroup roleGroup) {
		// TODO Auto-generated method stub
		roleAndGroupDAO.insertRoleAndGroup(roleGroup);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRoleAndGroups</p> 
	 * <p>Description: </p> 
	 * @param ids 
	 * @see com.oci.service.RoleAndGroupService#deleteRoleAndGroups(java.util.List) 
	*/
	@Override
	public void deleteRoleAndGroups(List<Integer> roleGroupIds) {
		roleAndGroupDAO.deleteRoleAndGroups(roleGroupIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteRoleAndGroup</p> 
	 * <p>Description: </p> 
	 * @param id 
	 * @see com.oci.service.RoleAndGroupService#deleteRoleAndGroup(java.lang.Integer) 
	*/
	@Override
	public void deleteRoleAndGroup(Integer roleGroupId) {
		// TODO Auto-generated method stub
		roleAndGroupDAO.deleteRoleAndGroup(roleGroupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroupVo</p> 
	 * <p>Description: </p> 
	 * @param roleGroupId
	 * @return 
	 * @see com.oci.service.RoleAndGroupService#findRoleAndGroupVo(java.lang.Integer) 
	*/
	@Override
	public RoleAndGroupVo findRoleAndGroupVo(Integer roleGroupId) {
		// TODO Auto-generated method stub
		return roleAndGroupDAO.findRoleAndGroupVo(roleGroupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findRoleAndGroupVos</p> 
	 * <p>Description: </p> 
	 * @param roleAndGroup
	 * @return 
	 * @see com.oci.service.RoleAndGroupService#findRoleAndGroupVos(com.oci.domain.searcher.RoleAndGroupSearcher) 
	*/
	@Override
	public List<RoleAndGroupVo> findRoleAndGroupVos(
			RoleAndGroupSearcher roleAndGroup) {
		// TODO Auto-generated method stub
		return roleAndGroupDAO.findRoleAndGroupVos(roleAndGroup);
	}

}
