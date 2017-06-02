/**   
  * @Title: ProgressHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月2日 下午2:03:08 
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

import com.oci.domain.Progress;
import com.oci.domain.searcher.ProgressSearcher;
import com.oci.domain.vo.ProgressVo;
import com.oci.service.ProgressService;

/** 
 * @ClassName: ProgressHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月2日 下午2:03:08 
 *  
 */
@Controller
@RequestMapping("progress")
public class ProgressHandler {
	
	@Autowired
	private ProgressService progressService;
	
	@PreAuthorize("hasRole('progress_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/progress/addProgress","progress",new Progress());
	}
	
	@PreAuthorize("hasRole('progress_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addProgress(@ModelAttribute("progress")@Valid Progress progress,BindingResult result){
		if(result.hasErrors()){
			return "/progress/addProgress";
		}
		progressService.insertProgress(progress);
		System.out.println(progress);
		return "redirect:/progress/find";
	}
	
	@PreAuthorize("hasRole('progress_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteProgress(@PathVariable("id") Integer id){
		
		progressService.deleteProgress(id);
		
		return "redirect:/progress/find";
	}
	
	@PreAuthorize("hasRole('progress_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String updateProgress(@PathVariable("id") Integer id,Model model){
		
		Progress progress = progressService.findProgress(id);
		model.addAttribute("progress", progress);	
		return "/progress/updateProgress";
	}
	
	@PreAuthorize("hasRole('progress_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateProgress(@ModelAttribute("progress")@Valid Progress progress,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/progress/addProgress";
		}
		progressService.updateProgress(progress);
		System.out.println(progress);
		return "redirect:/progress/find";
	}
	
	@PreAuthorize("hasRole('progress_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(){
		return new ModelAndView("/progress/findProgress","progressSearcher",new ProgressSearcher());
	}
	
	@PreAuthorize("hasRole('progress_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView find(@ModelAttribute("progressSearcher") ProgressSearcher progress){
		List<ProgressVo> progresss=progressService.findProgresss(progress);
		return new ModelAndView("/progress/findProgress","progresss",progresss);
	}

	
	
	

}
