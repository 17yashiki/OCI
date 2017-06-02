/**   

  * @Title: RoleHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月23日 下午8:39:32 
  * @version V1.0   
*/
package com.oci.handler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oci.domain.Role;
import com.oci.domain.searcher.RoleSearcher;
import com.oci.domain.vo.RoleVo;
import com.oci.service.RoleService;

/** 
 * @ClassName: RoleHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月23日 下午8:39:32 
 *  
 */
@Controller
@RequestMapping("role")
public class RoleHandler {
	
	@Autowired
	@Qualifier("roleService")
	private RoleService roleService;
	

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@PreAuthorize("hasRole('role_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/role/addRole","role",new Role());
	}

	
	@PreAuthorize("hasRole('role_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addRole(@ModelAttribute("role")@Valid Role role,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/role/addRole";
		}
		roleService.insertRole(role);
		System.out.println(role);
		return "redirect:/role/findall";
		
	}
	
	
	
	@PreAuthorize("hasRole('role_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView findRoles(){
		
		return new ModelAndView("/role/findRole","roleForSearcher",new RoleSearcher());	
	}
	
	@PreAuthorize("hasRole('role_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView findRoles(@ModelAttribute("roleForSearcher")RoleSearcher role){
		System.out.println(role);
		List<RoleVo> roles=roleService.findRoleVos(role);
		System.out.println(roles.size());
		ModelAndView m = new ModelAndView("/role/findRole","roles", roles);
		return m;	
	}
	
	
	
	
	@PreAuthorize("hasRole('role_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteRole(@PathVariable("id") Integer id){
		
		roleService.deleteRole(id);
		
		return "redirect:/role/findall";
	}
	
	@PreAuthorize("hasRole('role_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView updateRole(@PathVariable("id") Integer id){
		Role role = roleService.findRole(id);
		return new ModelAndView("/role/updateRole","role",role);
	}
	
	@PreAuthorize("hasRole('role_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateRole(@ModelAttribute("role")@Valid Role role,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/role/updateRole";
		}
		roleService.updateRole(role);
		return "redirect:/role/find";
	}
	
	

	
	
}
