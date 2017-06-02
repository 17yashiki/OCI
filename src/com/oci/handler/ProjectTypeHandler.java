/**   
  * @Title: ProjectTypeHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午8:08:53 
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

import com.oci.domain.ProjectType;
import com.oci.domain.searcher.ProjectTypeSearcher;
import com.oci.domain.vo.ProjectTypeVo;
import com.oci.service.ProjectTypeService;

/** 
 * @ClassName: ProjectTypeHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午8:08:53 
 *  
 */
@Controller
@RequestMapping("projectType")
public class ProjectTypeHandler {
	
	@Autowired
	private ProjectTypeService projectTypeService;
	
	@PreAuthorize("hasRole('projecttype_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/projectType/addProjectType","projectType",new ProjectType());
	}
	
	@PreAuthorize("hasRole('projecttype_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addProjectType(@ModelAttribute("projectType")@Valid ProjectType projectType,BindingResult result){
		if(result.hasErrors()){
			return "/projectType/addProjectType";
		}
		projectTypeService.insertProjectType(projectType);
		System.out.println(projectType);
		return "redirect:/projectType/find";
	}
	
	@PreAuthorize("hasRole('projecttype_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteProjectType(@PathVariable("id") Integer id){
		
		projectTypeService.deleteProjectType(id);
		
		return "redirect:/projectType/find";
	}
	
	@PreAuthorize("hasRole('projecttype_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String updateProjectType(@PathVariable("id") Integer id,Model model){
		ProjectType projectType = projectTypeService.findProjectType(id);
		model.addAttribute("projectType", projectType);	
		return "/projectType/updateProjectType";
	}
	
	@PreAuthorize("hasRole('projecttype_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateProjectType(@ModelAttribute("projectType")@Valid ProjectType projectType,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/projectType/addProjectType";
		}
		projectTypeService.updateProjectType(projectType);
		System.out.println(projectType);
		return "redirect:/projectType/find";
	}
	
	@PreAuthorize("hasRole('projecttype_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(){
		return new ModelAndView("/projectType/findProjectType","projectTypeSearcher",new ProjectTypeSearcher());
	}
	
	@PreAuthorize("hasRole('projecttype_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView find(@ModelAttribute("projectTypeSearcher") ProjectTypeSearcher projectType){
		List<ProjectTypeVo> projectTypes=projectTypeService.findProjectTypeVos(projectType);
		return new ModelAndView("/projectType/findProjectType","projectTypes",projectTypes);
	}

	
	
	

}
