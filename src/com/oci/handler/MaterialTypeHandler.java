/**   
  * @Title: MaterialTypeHandler.java 
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

import com.oci.domain.MaterialType;
import com.oci.domain.searcher.MaterialTypeSearcher;
import com.oci.domain.vo.MaterialTypeVo;
import com.oci.service.MaterialTypeService;

/** 
 * @ClassName: MaterialTypeHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午6:03:34 
 *  
 */
@Controller
@RequestMapping("materialType")
public class MaterialTypeHandler {
	@Autowired
	private MaterialTypeService materialTypeService;
	
	@PreAuthorize("hasRole('type_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/materialType/addMaterialType","materialType",new MaterialType());
	}
	
	@PreAuthorize("hasRole('type_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMaterialType(@ModelAttribute("materialType")@Valid MaterialType materialType,BindingResult result){
		if(result.hasErrors()){
			return "/materialType/addMaterialType";
		}
		materialTypeService.insertMaterialType(materialType);
		System.out.println(materialType);
		return "redirect:/materialType/find";
	}
	
	@PreAuthorize("hasRole('type_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteMaterialType(@PathVariable("id") Integer id){
		
		materialTypeService.deleteMaterialType(id);
		
		return "redirect:/materialType/find";
	}
	
	@PreAuthorize("hasRole('type_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String updateMaterialType(@PathVariable("id") Integer id,Model model){
		
		MaterialType materialType = materialTypeService.findMaterialType(id);
		model.addAttribute("materialType", materialType);	
		return "/materialType/updateMaterialType";
	}
	
	@PreAuthorize("hasRole('type_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateMaterialType(@ModelAttribute("materialType")@Valid MaterialType materialType,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/materialType/addMaterialType";
		}
		materialTypeService.updateMaterialType(materialType);
		System.out.println(materialType);
		return "redirect:/materialType/find";
	}
	
	@PreAuthorize("hasRole('type_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(){
		return new ModelAndView("/materialType/findMaterialType","materialTypeSearcher",new MaterialTypeSearcher());
	}
	
	@PreAuthorize("hasRole('type_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView find(@ModelAttribute("materialTypeSearcher") MaterialTypeSearcher materialType){
		List<MaterialTypeVo> materialTypes=materialTypeService.findMaterialTypeVos(materialType);
		return new ModelAndView("/materialType/findMaterialType","materialTypes",materialTypes);
	}

}
