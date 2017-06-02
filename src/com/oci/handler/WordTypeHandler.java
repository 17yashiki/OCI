/**   
  * @Title: WordTypeHandler.java 
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

import com.oci.domain.WordType;
import com.oci.domain.searcher.WordTypeSearcher;
import com.oci.domain.vo.WordTypeVo;
import com.oci.service.WordTypeService;

/** 
 * @ClassName: WordTypeHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午6:03:34 
 *  
 */
@Controller
@RequestMapping("wordType")
public class WordTypeHandler {
	@Autowired
	private WordTypeService wordTypeService;
	
	@PreAuthorize("hasRole('wordtype_add')")
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("/wordType/addWordType","wordType",new WordType());
	}
	
	@PreAuthorize("hasRole('wordtype_add')")
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addWordType(@ModelAttribute("wordType")@Valid WordType wordType,BindingResult result){
		if(result.hasErrors()){
			return "/wordType/addWordType";
		}
		wordTypeService.insertWordType(wordType);
		System.out.println(wordType);
		return "redirect:/wordType/find";
	}
	
	@PreAuthorize("hasRole('wordtype_delete')")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteWordType(@PathVariable("id") Integer id){
		
		wordTypeService.deleteWordType(id);
		
		return "redirect:/wordType/find";
	}
	
	@PreAuthorize("hasRole('wordtype_update')")
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String updateWordType(@PathVariable("id") Integer id,Model model){
		
		WordType wordType = wordTypeService.findWordType(id);
		model.addAttribute("wordType", wordType);	
		return "/wordType/updateWordType";
	}
	
	@PreAuthorize("hasRole('wordtype_update')")
	@RequestMapping(value="/update/modify",method=RequestMethod.POST)
	public String updateWordType(@ModelAttribute("wordType")@Valid WordType wordType,BindingResult result,Model model){
		if(result.hasErrors()){
			return "/wordType/addWordType";
		}
		wordTypeService.updateWordType(wordType);
		System.out.println(wordType);
		return "redirect:/wordType/find";
	}
	
	@PreAuthorize("hasRole('wordtype_find')")
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(){
		return new ModelAndView("/wordType/findWordType","wordTypeSearcher",new WordTypeSearcher());
	}
	
	@PreAuthorize("hasRole('wordtype_find')")
	@RequestMapping(value="/find",method=RequestMethod.POST)
	public ModelAndView find(@ModelAttribute("wordTypeSearcher") WordTypeSearcher wordType){
		List<WordTypeVo> wordTypes=wordTypeService.findWordTypeVos(wordType);
		return new ModelAndView("/wordType/findWordType","wordTypes",wordTypes);
	}

}
