/**   
  * @Title: GroupDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午6:59:41 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.Group;
import com.oci.domain.searcher.GroupSearcher;
import com.oci.domain.vo.GroupForOtherVo;
import com.oci.domain.vo.GroupVo;
import com.oci.mapper.GroupMapper;

/** 
 * @ClassName: GroupDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午6:59:41 
 *  
 */
@Repository
public class GroupDAOImpl implements GroupDAO {
	
	@Autowired
	private GroupMapper groupMapper;

	public void setGroupMapper(GroupMapper groupMapper) {
		this.groupMapper = groupMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllGroup</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.GroupDAO#findAllGroup() 
	*/
	@Override
	public List<GroupVo> findAllGroupVo() {
		// TODO Auto-generated method stub
		return groupMapper.findAllGroupVo();
	}





	/* (非 Javadoc) 
	 * <p>Title: findGroupById</p> 
	 * <p>Description: 这个只限于用于Group单独业务使用</p> 
	 * @param groupId
	 * @return 
	 * @see com.oci.dao.GroupDAO#findGroupById(java.lang.Integer) 
	*/
	@Override
	public GroupVo findGroupVo(Integer groupId) {
		// TODO Auto-generated method stub
		return groupMapper.findGroupVo(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateGroup</p> 
	 * <p>Description: </p> 
	 * @param group 
	 * @see com.oci.dao.GroupDAO#updateGroup(com.oci.domain.Group) 
	*/
	@Override
	public void updateGroup(Group group) {
		groupMapper.updateGroup(group);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertGroup</p> 
	 * <p>Description: </p> 
	 * @param group 
	 * @see com.oci.dao.GroupDAO#insertGroup(com.oci.domain.Group) 
	*/
	@Override
	public void insertGroup(Group group) {
		groupMapper.insertGroup(group);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteGroups</p> 
	 * <p>Description: </p> 
	 * @param map 
	 * @see com.oci.dao.GroupDAO#deleteGroups(java.util.Map) 
	*/
	@Override
	public void deleteGroups(List<Integer> ids) {
		groupMapper.deleteGroups(ids);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteGroup</p> 
	 * <p>Description: </p> 
	 * @param groupId 
	 * @see com.oci.dao.GroupDAO#deleteGroup(java.lang.Integer) 
	*/
	@Override
	public void deleteGroup(Integer groupId) {
		groupMapper.deleteGroup(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findGroup</p> 
	 * <p>Description: </p> 
	 * @param groupId
	 * @return 
	 * @see com.oci.dao.GroupDAO#findGroup(java.lang.Integer) 
	*/
	@Override
	public Group findGroup(Integer groupId) {
		// TODO Auto-generated method stub
		return groupMapper.findGroup(groupId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findGroupVos</p> 
	 * <p>Description: </p> 
	 * @param group
	 * @return 
	 * @see com.oci.dao.GroupDAO#findGroupVos(com.oci.domain.searcher.GroupSearcher) 
	*/
	@Override
	public List<GroupVo> findGroupVos(GroupSearcher group) {
		// TODO Auto-generated method stub
		return groupMapper.findGroupVos(group);
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllGroupForOtherVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.GroupDAO#findAllGroupForOtherVo() 
	*/
	@Override
	public List<GroupForOtherVo> findAllGroupForOtherVo() {
		// TODO Auto-generated method stub
		return groupMapper.findAllGroupForOtherVo();
	}




	
	
	
}
