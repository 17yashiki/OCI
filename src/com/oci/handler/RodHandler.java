/**   
  * @Title: RodHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午9:58:38 
  * @version V1.0   
*/
package com.oci.handler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oci.domain.Rod;
import com.oci.service.RodService;

/** 
 * @ClassName: RodHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午9:58:38 
 *  
 */
@Controller
@RequestMapping("rod")
public class RodHandler {
	
	@Autowired
	private RodService rodService;
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/rod/addRod","rod",new Rod());
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addRod(@ModelAttribute("rod")@Valid Rod rod,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/rod/addRod";
		}
		rodService.InsertRod(rod);
		System.out.println(rod);
		return "redirect:/rod/findall";
	}
	

}
