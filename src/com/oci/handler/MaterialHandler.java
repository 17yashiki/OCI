/**   
  * @Title: MaterialHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午6:03:34 
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

import com.oci.domain.Material;
import com.oci.domain.searcher.MaterialSearcher;
import com.oci.domain.vo.MaterialVo;
import com.oci.service.MaterialService;

/** 
 * @ClassName: MaterialHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午6:03:34 
 *  
 */
@Controller
@RequestMapping("material")
public class MaterialHandler {
	@Autowired
	private MaterialService materialService;
	
	@PreAuthorize("hasRole('material_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/material/addMaterial","material",new Material());
	}
	
	@PreAuthorize("hasRole('material_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMaterial(@ModelAttribute("material")@Valid Material material,BindingResult result){
		if(result.hasErrors()){
			return "/material/addMaterial";
		}
		materialService.insertMaterial(material);
		System.out.println(material);
		return "redirect:/material/find";
	}
	
	@PreAuthorize("hasRole('material_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteMaterial(@PathVariable("id") Integer id){
		
		materialService.deleteMaterial(id);
		
		return "redirect:/material/find";
	}
	
	@PreAuthorize("hasRole('material_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String updateMaterial(@PathVariable("id") Integer id,Model model){
		
		Material material = materialService.findMaterial(id);
		model.addAttribute("material", material);	
		return "/material/updateMaterial";
	}
	
	@PreAuthorize("hasRole('material_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateMaterial(@ModelAttribute("material")@Valid Material material,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/material/addMaterial";
		}
		materialService.updateMaterial(material);
		System.out.println(material);
		return "redirect:/material/find";
	}
	
	@PreAuthorize("hasRole('material_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(){
		return new ModelAndView("/material/findMaterial","materialSearcher",new MaterialSearcher());
	}
	
	@PreAuthorize("hasRole('material_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView find(@ModelAttribute("materialSearcher") MaterialSearcher material){
		List<MaterialVo> materials=materialService.findMaterialVos(material);
		return new ModelAndView("/material/findMaterial","materials",materials);
	}

}
