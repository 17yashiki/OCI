/**   
  * @Title: RoleAndGroupHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午10:20:06 
  * @version V1.0   
*/
package com.oci.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oci.domain.RoleAndGroup;
import com.oci.domain.searcher.RoleAndGroupSearcher;
import com.oci.domain.vo.GroupForOtherVo;
import com.oci.domain.vo.RoleAndGroupAdd;
import com.oci.domain.vo.RoleAndGroupVo;
import com.oci.domain.vo.RoleForOtherVo;
import com.oci.service.GroupService;
import com.oci.service.RoleAndGroupService;
import com.oci.service.RoleService;

/** 
 * @ClassName: RoleAndGroupHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午10:20:06 
 *  
 */
@Controller
@RequestMapping("roleAndGroup")
public class RoleAndGroupHandler {
	
	@Autowired
	private RoleAndGroupService roleAndGroupService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private GroupService groupService;
	
	
	@PreAuthorize("hasRole('grouprole_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/roleAndGroup/addRoleAndGroup","roleAndGroup",new RoleAndGroup());
	}

	
	@PreAuthorize("hasRole('grouprole_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addRoleAndGroup(@ModelAttribute("roleAndGroup")@Valid RoleAndGroup roleAndGroup,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/roleAndGroup/addRoleAndGroup";
		}
		roleAndGroupService.insertRoleAndGroup(roleAndGroup);
		System.out.println(roleAndGroup);
		return "redirect:/roleAndGroup/find";
		
	}
	
	
	@PreAuthorize("hasRole('grouprole_add')")
	@RequestMapping(value="/adds",method=RequestMethod.GET)
	public ModelAndView adds(){
		return new ModelAndView("/roleAndGroup/addsRoleAndGroup","roleAndGroupAdd",new RoleAndGroupAdd());
	}

	
	@PreAuthorize("hasRole('grouprole_add')")
	@RequestMapping(value="/adds",method=RequestMethod.POST)
	public String addsRoleAndGroup(@ModelAttribute("roleAndGroupAdd")@Valid RoleAndGroupAdd roleAndGroup,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/roleAndGroup/addsRoleAndGroup";
		}
		List<Integer> roleIds = roleAndGroup.getRoleIds();
		Integer groupId = roleAndGroup.getGroupId();
		RoleAndGroup rg=new RoleAndGroup();
		for(Integer roleId:roleIds){
			rg.setRoleId(roleId);
			rg.setGroupId(groupId);
			roleAndGroupService.insertRoleAndGroup(rg);
		}	
		System.out.println(roleAndGroup);
		return "redirect:/roleAndGroup/find";
		
	}
	
	
	
	
	@PreAuthorize("hasRole('grouprole_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView findRoleAndGroups(){
		
		return new ModelAndView("/roleAndGroup/findRoleAndGroup","roleAndGroupSearcher",new RoleAndGroupSearcher());	
	}
	
	@PreAuthorize("hasRole('grouprole_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView findRoleAndGroups(@ModelAttribute("roleAndGroupSearcher")RoleAndGroupSearcher roleAndGroup){
		System.out.println(roleAndGroup);
		List<RoleAndGroupVo> roleAndGroups=roleAndGroupService.findRoleAndGroupVos(roleAndGroup);
		System.out.println(roleAndGroups.size());
		ModelAndView m = new ModelAndView("/roleAndGroup/findRoleAndGroup","roleAndGroups", roleAndGroups);
		return m;	
	}
	
	
	
	
	@PreAuthorize("hasRole('grouprole_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteRoleAndGroup(@PathVariable("id") Integer id){
		
		roleAndGroupService.deleteRoleAndGroup(id);
		
		return "redirect:/roleAndGroup/find";
	}
	
	@PreAuthorize("hasRoleAndGroup('grouprole_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView updateRoleAndGroup(@PathVariable("id") Integer id){
		RoleAndGroup roleAndGroup = roleAndGroupService.findRoleAndGroup(id);
		return new ModelAndView("/roleAndGroup/updateRoleAndGroup","roleAndGroup",roleAndGroup);
	}
	
	@PreAuthorize("hasRole('grouprole_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateRoleAndGroup(@ModelAttribute("roleAndGroup")@Valid RoleAndGroup roleAndGroup,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/roleAndGroup/updateRoleAndGroup";
		}
		roleAndGroupService.updateRoleAndGroup(roleAndGroup);
		return "redirect:/roleAndGroup/find";
	}
	
	   @ModelAttribute("groupList")
	   public Map<Object, Object> getGroupList()
	   {
	      Map<Object, Object> groupList = new HashMap<Object, Object>();
	      List<GroupForOtherVo> groupVos = groupService.findAllGroupForOtherVo();
	      for(GroupForOtherVo groupVo:groupVos){
	    	  groupList.put(groupVo.getGroupId(),groupVo.getGroupName());
	      }
	      return groupList;
	   }
	   
	   
	   @ModelAttribute("roleList")
	   public Map<Object, Object> getRoleList()
	   {
	      Map<Object, Object> roleList = new HashMap<Object, Object>();
	      List<RoleForOtherVo> roleVos = roleService.findAllRoleForOtherVo();
	      for(RoleForOtherVo roleVo:roleVos){
	    	  roleList.put(roleVo.getRoleId(),roleVo.getRoleName());
	      }
	      return roleList;
	   }
	
	

}
