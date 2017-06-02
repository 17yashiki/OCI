/**   
  * @Title: GroupServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午7:04:21 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.GroupDAO;
import com.oci.domain.Group;
import com.oci.domain.searcher.GroupSearcher;
import com.oci.domain.vo.GroupForOtherVo;
import com.oci.domain.vo.GroupVo;

/** 
 * @ClassName: GroupServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午7:04:21 
 *  
 */

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDAO groupDAO;
	
	public void setGroupDAO(GroupDAO groupDAO) {
		this.groupDAO = groupDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllGroup</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.GroupService#findAllGroup() 
	 */
	@Override
	public List<GroupVo> findAllGroupVo() {
		// TODO Auto-generated method stub
		return groupDAO.findAllGroupVo();
	}



	/* (非 Javadoc) 
	 * <p>Title: findGroupById</p> 
	 * <p>Description: </p> 
	 * @param groupId
	 * @return 
	 * @see com.oci.service.GroupService#findGroupById(java.lang.Integer) 
	 */
	@Override
	public GroupVo findGroupVo(Integer groupId) {
		// TODO Auto-generated method stub
		return groupDAO.findGroupVo(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateGroup</p> 
	 * <p>Description: </p> 
	 * @param group 
	 * @see com.oci.service.GroupService#updateGroup(com.oci.domain.Group) 
	 */
	@Override
	public void updateGroup(Group group) {
		groupDAO.updateGroup(group);

	}

	/* (非 Javadoc) 
	 * <p>Title: insertGroup</p> 
	 * <p>Description: </p> 
	 * @param group 
	 * @see com.oci.service.GroupService#insertGroup(com.oci.domain.Group) 
	 */
	@Override
	public void insertGroup(Group group) {
		groupDAO.insertGroup(group);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteGroups</p> 
	 * <p>Description: </p> 
	 * @param map 
	 * @see com.oci.service.GroupService#deleteGroups(java.util.Map) 
	 */
	@Override
	public void deleteGroups(List<Integer> groupIds) {
		groupDAO.deleteGroups(groupIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteGroup</p> 
	 * <p>Description: </p> 
	 * @param groupId 
	 * @see com.oci.service.GroupService#deleteGroup(java.lang.Integer) 
	 */
	@Override
	public void deleteGroup(Integer groupId) {
		groupDAO.deleteGroup(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findGroup</p> 
	 * <p>Description: </p> 
	 * @param groupId
	 * @return 
	 * @see com.oci.service.GroupService#findGroup(java.lang.Integer) 
	*/
	@Override
	public Group findGroup(Integer groupId) {
		// TODO Auto-generated method stub
		return groupDAO.findGroup(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findGroupVos</p> 
	 * <p>Description: </p> 
	 * @param group
	 * @return 
	 * @see com.oci.service.GroupService#findGroupVos(com.oci.domain.searcher.GroupSearcher) 
	*/
	@Override
	public List<GroupVo> findGroupVos(GroupSearcher group) {
		// TODO Auto-generated method stub
		return groupDAO.findGroupVos(group);
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllGroupForOtherVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.GroupService#findAllGroupForOtherVo() 
	*/
	@Override
	public List<GroupForOtherVo> findAllGroupForOtherVo() {
		// TODO Auto-generated method stub
		return groupDAO.findAllGroupForOtherVo();
	}





}
