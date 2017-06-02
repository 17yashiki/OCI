/**   
  * @Title: UserDAO.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午4:42:10 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import com.oci.domain.User;
import com.oci.domain.vo.UserForOtherVo;
import com.oci.domain.vo.UserVo;

/** 
 * @ClassName: UserDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午4:42:10 
 *  
 */
public interface UserDAO {
	public List<UserVo> findAllUserVo();
	public List<UserVo> findUserVos(Map<String,Object> map);
	public UserVo findUserVo(Integer userId);
	public User findUser(Integer userId);
	public UserForOtherVo findUserForOtherVo(Integer userId);
	public UserForOtherVo findUserForOtherVoByUserName(String userName);
	
	public void updateUser(User user);
	public void insertUser(User user);
	public void deleteUsers(List<Integer> userIds);
	public void deleteUser(Integer userId);
}
