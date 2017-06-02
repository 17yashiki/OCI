/**   
  * @Title: RoleGroupServicetTest.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月24日 下午4:31:02 
  * @version V1.0   
*/
package com.oci.test;




import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oci.dao.MaterialTypeDAO;
import com.oci.dao.RodAndMaterialDAO;
import com.oci.domain.searcher.RoleAndGroupSearcher;
import com.oci.domain.vo.RoleAndGroupVo;
import com.oci.domain.vo.UserForOtherVo;
import com.oci.mapper.RoleAndGroupMapper;
import com.oci.mapper.RoleMapper;
import com.oci.mapper.UserMapper;
import com.oci.service.GroupService;
import com.oci.service.ProjectAndTypeService;
import com.oci.service.ProjectService;
import com.oci.service.ProjectTypeService;
import com.oci.service.RoleAndGroupService;
import com.oci.service.RoleService;

/** 
 * @ClassName: RoleGroupServicetTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月24日 下午4:31:02 
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/applicationContext.xml")
public class ServicetTest {
	
	@Autowired
	private RoleAndGroupService roleGroupService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private GroupService groupService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ProjectTypeService projectTypeService;
	@Autowired
	private ProjectAndTypeService projectAndTypeService;
	
	@Autowired
	private MaterialTypeDAO materialTypeDAO;
	
	
	@Autowired
	private RodAndMaterialDAO rodAndMaterialDAO;

	@Autowired
	private UserMapper userMapper;
	

	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private RoleAndGroupMapper roleAndGroupMapper;
	
	
	@org.junit.Test
	public void Test(){
//		RoleGroup roleGroup = new RoleGroup();
//		Role role = roleService.findRole(1);
//		Group group = groupService.findGroup(2);
//		roleGroup.setRole(role);
//		roleGroup.setGroup(group);
//		roleGroupService.insertRoleGroup(roleGroup);
		
//		roleGroupService.deleteRoleGroup(58);
//		List<RoleGroup> roleGroups=roleGroupService.findAllRoleGroup();
//		for(RoleGroup roleGroup:roleGroups){
//			System.out.println(roleGroup);
//		}
		
//		List<GroupVo> groups=groupService.findAllGroupVo();
//		for(GroupVo group:groups){
//			System.out.println(group);
//		}
//		Group group = groupService.findGroupById(2);
//		System.out.println(group);
		
//		List<ProjectAndTypeVo> projectAndTypes = projectAndTypeService.findAllProjectAndTypeVo();
//		for(ProjectAndTypeVo projectAndType:projectAndTypes){
//			System.out.println(projectAndType);
//		}
		
//		List<ProjectVo> projects = projectService.findAllProjectVo();
//		for(ProjectVo project:projects){
//			System.out.println(project);
//		}
		
//		List<ProjectTypeVo> projects = projectTypeService.findAllProjectTypeVo();
//		for(ProjectTypeVo project:projects){
//			System.out.println(project);
//		}
		
//		Project project = new Project();
//		project.setProjectName("汉口站");
//		project.setProjectTime(new Date());
//		projectService.insertProject(project);
//		ProjectType projectType=new ProjectType();
//		projectType.setProjectTypeName("路径施工");
//		projectTypeService.insertProjectType(projectType);
//		ProjectAndType projectAndType = new ProjectAndType();
//		projectAndType.setProjectId(5);
//		projectAndType.setProjectTypeId(4);
//		projectAndTypeService.insertProjectAndType(projectAndType);
//		projectAndType.setProjectId(5);
//		projectAndType.setProjectTypeId(3);
//		projectAndTypeService.insertProjectAndType(projectAndType);
//		projectAndType.setProjectId(5);
//		projectAndType.setProjectTypeId(2);
//		projectAndTypeService.insertProjectAndType(projectAndType);
//		projectAndType.setProjectId(5);
//		projectAndType.setProjectTypeId(1);
//		projectAndTypeService.insertProjectAndType(projectAndType);
//		
		
		
//		projectService.deleteProject(5);
		
		
//		projectAndTypeService.deleteProjectAndType(19);
//		List<Integer> projectAndTypeIds=new ArrayList<Integer>();
//		projectAndTypeIds.add(13);
//		projectAndTypeIds.add(14);
//		projectAndTypeIds.add(15);
//		projectAndTypeService.deleteProjectAndTypes(projectAndTypeIds);
		
//		List<MaterialTypeVo> mts=materialTypeDAO.findAllMaterialTypeVo();
//		
//		for(MaterialTypeVo mt:mts){
//			System.out.println(mt);
//		}	
		
//		Map<String,String> map = new HashMap<String,String>();
//		
//		map.put("typeName", "%类%");
//		List<MaterialTypeVo> mts=materialTypeDAO.findMaterialTypeVos(map);
//		System.out.println("mts.isEmpty()="+mts.isEmpty());
//		for(MaterialTypeVo mt:mts){
//			System.out.println(mt);
//		}
		
//		MaterialType mt1 = new MaterialType();
//		mt1.setTypeName("不知道什么类");
//		materialTypeDAO.insertMaterialType(mt1);
//		MaterialType mt2=materialTypeDAO.findMaterialType(11);
//		MaterialTypeVo mt3=materialTypeDAO.findMaterialTypeVo(11);
//		System.out.println(mt2);
//		System.out.println(mt3);
//		mt2.setReserve1("我就是个备注");
//		materialTypeDAO.updateMaterialType(mt2);
		
//		List<RodAndMaterialVo> rmvs = rodAndMaterialDAO.findAllRodAndMaterialVo();
//		for(RodAndMaterialVo rmv:rmvs){
//			System.out.println(rmv);
//		}
//		
//		List<UserVo> users = userMapper.findAllUserVo();
//		for(UserVo user : users){
//			System.out.println(user);
//		}
//		
//		UserForOtherVo user= userMapper.findUserForOtherVoByUserName("admin");
//		System.out.println(user);
//		
//		RoleForSercherVo role = new RoleForSercherVo();
//		role.setRoleName("add");
//		role.setDescription("");
//		role.setCategory("");
//		List<RoleVo> roles = roleMapper.findRoleVos(role);
//		for(RoleVo role1:roles){
//			System.out.println(role1);
//		}
			RoleAndGroupSearcher roleAndGroup = new RoleAndGroupSearcher();
			
			roleAndGroup.setRoleName("add");
			List<RoleAndGroupVo> rgs = roleAndGroupMapper.findRoleAndGroupVos(roleAndGroup);
			for(RoleAndGroupVo rg:rgs){
				System.out.println(rg);
			}
		
	}
	

}
