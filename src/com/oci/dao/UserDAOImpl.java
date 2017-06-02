/**   
  * @Title: UserDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午4:43:06 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.User;
import com.oci.domain.vo.UserForOtherVo;
import com.oci.domain.vo.UserVo;
import com.oci.mapper.UserMapper;

/** 
 * @ClassName: UserDAOImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午4:43:06 
 *  
 */
@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private UserMapper userMapper;

	/* (非 Javadoc) 
	 * <p>Title: findAllUserVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.UserDAO#findAllUserVo() 
	 */
	@Override
	public List<UserVo> findAllUserVo() {
		// TODO Auto-generated method stub
		return userMapper.findAllUserVo()
				;
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.dao.UserDAO#findUserVos(java.util.Map) 
	 */
	@Override
	public List<UserVo> findUserVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userMapper.findUserVos(map);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserVo</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return 
	 * @see com.oci.dao.UserDAO#findUserVo(java.lang.Integer) 
	 */
	@Override
	public UserVo findUserVo(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.findUserVo(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUser</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return 
	 * @see com.oci.dao.UserDAO#findUser(java.lang.Integer) 
	 */
	@Override
	public User findUser(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.findUser(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateUser</p> 
	 * <p>Description: </p> 
	 * @param user 
	 * @see com.oci.dao.UserDAO#updateUser(com.oci.domain.User) 
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertUser</p> 
	 * <p>Description: </p> 
	 * @param user 
	 * @see com.oci.dao.UserDAO#insertUser(com.oci.domain.User) 
	 */
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insertUser(user);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteUsers</p> 
	 * <p>Description: </p> 
	 * @param userIds 
	 * @see com.oci.dao.UserDAO#deleteUsers(java.util.List) 
	 */
	@Override
	public void deleteUsers(List<Integer> userIds) {
		// TODO Auto-generated method stub
		userMapper.deleteUsers(userIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteUser</p> 
	 * <p>Description: </p> 
	 * @param userId 
	 * @see com.oci.dao.UserDAO#deleteUser(java.lang.Integer) 
	 */
	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserForOtherVo</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return 
	 * @see com.oci.dao.UserDAO#findUserForOtherVo(java.lang.Integer) 
	*/
	@Override
	public UserForOtherVo findUserForOtherVo(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.findUserForOtherVo(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserForOtherVoByUserName</p> 
	 * <p>Description: </p> 
	 * @param userName
	 * @return 
	 * @see com.oci.dao.UserDAO#findUserForOtherVoByUserName(java.lang.String) 
	*/
	@Override
	public UserForOtherVo findUserForOtherVoByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findUserForOtherVoByUserName(userName);
	}

}
