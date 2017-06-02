/**   
  * @Title: State.java 
  * @Package com.oci.domain.utils 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月31日 下午5:36:25 
  * @version V1.0   
*/
package com.oci.domain.utils;

/** 
 * @ClassName: State 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月31日 下午5:36:25 
 *  
 */
public enum State {
	 ACTIVE("Active"), 
	 INACTIVE("Inactive"), 
	 DELETED("Deleted"), 
	 LOCKED("Locked"); 
	 private String state; 
	 private State(final String state){        
		 this.state = state;    
		 }           
	 public String getState(){ 
		 return this.state;     
		 }       
	 
	 @Override   
	 public String toString(){ 
		 return this.state;     
		 }        
	 
	 public String getName(){ 
		 return this.name();   
		 }   
}

