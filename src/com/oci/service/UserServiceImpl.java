/**   
  * @Title: UserServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午4:47:02 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.UserDAO;
import com.oci.domain.User;
import com.oci.domain.vo.UserForOtherVo;
import com.oci.domain.vo.UserVo;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午4:47:02 
 *  
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	/* (非 Javadoc) 
	 * <p>Title: findAllUserVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.UserService#findAllUserVo() 
	 */
	@Override
	public List<UserVo> findAllUserVo() {
		// TODO Auto-generated method stub
		return userDAO.findAllUserVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserVos</p> 
	 * <p>Description: </p> 
	 * @param map
	 * @return 
	 * @see com.oci.service.UserService#findUserVos(java.util.Map) 
	 */
	@Override
	public List<UserVo> findUserVos(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDAO.findAllUserVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserVo</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return 
	 * @see com.oci.service.UserService#findUserVo(java.lang.Integer) 
	 */
	@Override
	public UserVo findUserVo(Integer userId) {
		// TODO Auto-generated method stub
		return userDAO.findUserVo(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUser</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return 
	 * @see com.oci.service.UserService#findUser(java.lang.Integer) 
	 */
	@Override
	public User findUser(Integer userId) {
		// TODO Auto-generated method stub
		return userDAO.findUser(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateUser</p> 
	 * <p>Description: </p> 
	 * @param user 
	 * @see com.oci.service.UserService#updateUser(com.oci.domain.User) 
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDAO.updateUser(user);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertUser</p> 
	 * <p>Description: </p> 
	 * @param user 
	 * @see com.oci.service.UserService#insertUser(com.oci.domain.User) 
	 */
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDAO.insertUser(user);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteUsers</p> 
	 * <p>Description: </p> 
	 * @param userIds 
	 * @see com.oci.service.UserService#deleteUsers(java.util.List) 
	 */
	@Override
	public void deleteUsers(List<Integer> userIds) {
		// TODO Auto-generated method stub
		userDAO.deleteUsers(userIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteUser</p> 
	 * <p>Description: </p> 
	 * @param userId 
	 * @see com.oci.service.UserService#deleteUser(java.lang.Integer) 
	 */
	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserForOtherVo</p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @return 
	 * @see com.oci.service.UserService#findUserForOtherVo(java.lang.Integer) 
	*/
	@Override
	public UserForOtherVo findUserForOtherVo(Integer userId) {
		// TODO Auto-generated method stub
		return userDAO.findUserForOtherVo(userId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findUserForOtherVoByUserName</p> 
	 * <p>Description: </p> 
	 * @param userName
	 * @return 
	 * @see com.oci.service.UserService#findUserForOtherVoByUserName(java.lang.String) 
	*/
	@Override
	public UserForOtherVo findUserForOtherVoByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDAO.findUserForOtherVoByUserName(userName);
	}

}
