/**   
  * @Title: ProjectHandler.java 
  * @Package com.oci.handler 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年6月1日 下午8:56:48 
  * @version V1.0   
*/
package com.oci.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oci.service.ProjectService;

/** 
 * @ClassName: ProjectHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年6月1日 下午8:56:48 
 *  
 */
@Controller
@RequestMapping("project")
public class ProjectHandler {
	
	
	@Autowired
	private ProjectService projectService;
	

}
