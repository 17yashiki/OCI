/**   
  * @Title: WordTypeService.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:56:24 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;

import com.oci.domain.WordType;
import com.oci.domain.searcher.WordTypeSearcher;
import com.oci.domain.vo.WordTypeVo;

/** 
 * @ClassName: WordTypeService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:56:24 
 *  
 */
public interface WordTypeService {
	public List<WordTypeVo> findAllWordTypeVo();
	public List<WordTypeVo> findWordTypeVos(WordTypeSearcher wordType);
	public WordType findWordType(Integer typeId);
	public WordTypeVo findWordTypeVo(Integer typeId);

	public void updateWordType(WordType wordType);
	public void insertWordType(WordType wordType);
	public void deleteWordTypes(List<Integer> typeIds);
	public void deleteWordType(Integer typeId);
}
