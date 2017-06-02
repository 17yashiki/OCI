/**   
  * @Title: WordTypeMapper.java 
  * @Package com.oci.mapper 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午9:18:19 
  * @version V1.0   
*/
package com.oci.mapper;

import java.util.List;
import com.oci.domain.WordType;
import com.oci.domain.searcher.WordTypeSearcher;


import com.oci.domain.vo.WordTypeVo;

/** 
 * @ClassName: WordTypeMapper
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午9:18:19 
 *  
 */
public interface WordTypeMapper {
	public List<WordTypeVo> findAllWordTypeVo();
	public List<WordTypeVo> findWordTypeVos(WordTypeSearcher wordType);
	public WordType findWordType(Integer typeId);
	public WordTypeVo findWordTypeVo(Integer typeId);
//	public WordTypeForOtherVo findWordTypeForOtherVo(Integer typeId);
	
	public void updateWordType(WordType wordType);
	public void insertWordType(WordType wordType);
	public void deleteWordTypes(List<Integer> typeIds);
	public void deleteWordType(Integer typeId);
}
