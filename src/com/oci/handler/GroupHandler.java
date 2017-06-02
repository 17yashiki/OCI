/**   
  * @Title: GroupHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午4:54:01 
  * @version V1.0   
*/
package com.oci.handler;

import java.util.List;

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

import com.oci.domain.Group;
import com.oci.domain.searcher.GroupSearcher;
import com.oci.domain.vo.GroupVo;
import com.oci.service.GroupService;

/** 
 * @ClassName: GroupHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午4:54:01 
 *  
 */
@Controller
@RequestMapping("group")
public class GroupHandler {
	
	@Autowired
	private GroupService groupService;
	
	@PreAuthorize("hasRole('group_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/group/addGroup","group",new Group());
	}
	
	@PreAuthorize("hasRole('group_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addGroup(@ModelAttribute("group")@Valid Group group,BindingResult result){
		if(result.hasErrors()){
			return "/group/addGroup";
		}
		groupService.insertGroup(group);
		return "redirect:/group/find";
	}
	
	@PreAuthorize("hasRole('group_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(){
		return new ModelAndView("/group/findGroup","groupSearcher",new GroupSearcher());
	}
	
	@PreAuthorize("hasRole('group_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public String findGroups(@ModelAttribute("groupSearcher") GroupSearcher group,Model model){
		List<GroupVo> groups=groupService.findGroupVos(group);
		for(GroupVo group1:groups){
			System.out.println(group1);}
		model.addAttribute("groups", groups);
		return "/group/findGroup";
	}
	
	@PreAuthorize("hasRole('group_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable("id") Integer id){
		groupService.deleteGroup(id);
		return "redirect:/group/find";
	}
	
	@PreAuthorize("hasRole('group_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") Integer id){
		Group group=groupService.findGroup(id);
		return new ModelAndView("/group/updateGroup","group",group);
	}
	
	@PreAuthorize("hasRole('group_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateGroup(@ModelAttribute("group") Group group){
		groupService.updateGroup(group);
		return "redirect:/group/find";
	}
	
	
	

}
