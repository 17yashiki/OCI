/**   
  * @Title: GroupMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午7:28:43 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;

import com.oci.domain.Group;
import com.oci.domain.searcher.GroupSearcher;
import com.oci.domain.vo.GroupForOtherVo;
import com.oci.domain.vo.GroupVo;

/** 
 * @ClassName: GroupMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午7:28:43 
 *  
 */
public interface GroupMapper {
	public List<GroupVo> findAllGroupVo();
	
	public List<GroupForOtherVo> findAllGroupForOtherVo();
	
	public List<GroupVo> findGroupVos(GroupSearcher group);
	
	public GroupVo findGroupVo(Integer groupId);
	
	public Group findGroup(Integer groupId);
	
	public GroupForOtherVo findGroupForOtherVo(Integer groupId);
	
	public void updateGroup(Group group);
	
	public void insertGroup(Group group);
	
	public void deleteGroups(List<Integer> groupIds);
	
	public void deleteGroup(Integer groupId);
}
