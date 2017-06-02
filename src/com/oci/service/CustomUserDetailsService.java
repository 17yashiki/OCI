/**   
  * @Title: CustomUserDetailsService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午4:46:28 
  * @version V1.0   
*/
package com.oci.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.domain.vo.RoleForOtherVo;
import com.oci.domain.vo.UserForOtherVo;

/** 
 * @ClassName: CustomUserDetailsService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午4:46:28 
 *  
 */
@Service("customUserDetailsService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserService userService;
	
	/* (非 Javadoc) 
	 * <p>Title: loadUserByUsername</p> 
	 * <p>Description: </p> 
	 * @param arg0
	 * @return
	 * @throws UsernameNotFoundException 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String) 
	 */
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		UserForOtherVo user = userService.findUserForOtherVoByUserName(userName);
		System.out.println("User : "+user);        
		if(user==null){         
			System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found");
		} 
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getUserPassword(),
				user.getUserState().equals("Active"), true, true, true, getGrantedAuthorities(user)); 

	}

	/** 
	 * @Title: getGrantedAuthorities 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param user
	 * @param @return    设定文件 
	 * @return Collection<? extends GrantedAuthority>    返回类型 
	 * @throws 
	*/
	private List<GrantedAuthority> getGrantedAuthorities(
			UserForOtherVo user) {
		List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getGroup().getGroupName()));
		for(RoleForOtherVo role:user.getRoles()){
			System.out.println(role);
			authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
		}
		System.out.println("authorities:"+authorities);
		return authorities;
	}

}
