/**   
  * @Title: UserMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午4:23:39 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;
import java.util.Map;

import com.oci.domain.User;
import com.oci.domain.vo.UserForOtherVo;
import com.oci.domain.vo.UserForWordVo;
import com.oci.domain.vo.UserVo;

/** 
 * @ClassName: UserMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午4:23:39 
 *  
 */
public interface UserMapper {
	public List<UserVo> findAllUserVo();
	public List<UserVo> findUserVos(Map<String,Object> map);
	public UserVo findUserVo(Integer userId);
	public User findUser(Integer userId);
	public UserForOtherVo findUserForOtherVo(Integer userId);
	public UserForWordVo findUserForWordVo(Integer userId);
	public UserForOtherVo findUserForOtherVoByUserName(String userName);
	
	public void updateUser(User user);
	public void insertUser(User user);
	public void deleteUsers(List<Integer> userIds);
	public void deleteUser(Integer userId);
}
