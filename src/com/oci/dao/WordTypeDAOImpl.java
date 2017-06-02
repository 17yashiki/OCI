/**   
  * @Title: WordTypeDAOImpl.java 
  * @Package com.oci.dao 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月28日 下午9:25:49 
  * @version V1.0   
*/
package com.oci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oci.domain.WordType;
import com.oci.domain.searcher.WordTypeSearcher;
import com.oci.domain.vo.WordTypeVo;
import com.oci.mapper.WordTypeMapper;

/** 
 * @ClassName: WordTypeDAOImpl
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月28日 下午9:25:49 
 *  
 */
@Repository
public class WordTypeDAOImpl implements WordTypeDAO{
	
	@Autowired
	private WordTypeMapper wordTypeMapper;
	
	public void setWordTypeMapper(WordTypeMapper wordTypeMapper) {
		this.wordTypeMapper = wordTypeMapper;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllWordTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.dao.WordTypeDAO#findAllWordTypeVo() 
	*/
	@Override
	public List<WordTypeVo> findAllWordTypeVo() {
		// TODO Auto-generated method stub
		return wordTypeMapper.findAllWordTypeVo();
	}


	/* (非 Javadoc) 
	 * <p>Title: findWordType</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.dao.WordTypeDAO#findWordType(java.lang.Integer) 
	*/
	@Override
	public WordType findWordType(Integer typeId) {
		// TODO Auto-generated method stub
		return wordTypeMapper.findWordType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findWordTypeVo</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.dao.WordTypeDAO#findWordTypeVo(java.lang.Integer) 
	*/
	@Override
	public WordTypeVo findWordTypeVo(Integer typeId) {
		// TODO Auto-generated method stub
		return wordTypeMapper.findWordTypeVo(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateWordType</p> 
	 * <p>Description: </p> 
	 * @param wordType 
	 * @see com.oci.dao.WordTypeDAO#updateWordType(com.oci.domain.WordType) 
	*/
	@Override
	public void updateWordType(WordType wordType) {
		// TODO Auto-generated method stub
		wordTypeMapper.updateWordType(wordType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertWordType</p> 
	 * <p>Description: </p> 
	 * @param wordType 
	 * @see com.oci.dao.WordTypeDAO#insertWordType(com.oci.domain.WordType) 
	*/
	@Override
	public void insertWordType(WordType wordType) {
		// TODO Auto-generated method stub
		wordTypeMapper.insertWordType(wordType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteWordTypes</p> 
	 * <p>Description: </p> 
	 * @param typeIds 
	 * @see com.oci.dao.WordTypeDAO#deleteWordTypes(java.util.List) 
	*/
	@Override
	public void deleteWordTypes(List<Integer> typeIds) {
		// TODO Auto-generated method stub
		wordTypeMapper.deleteWordTypes(typeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteWordType</p> 
	 * <p>Description: </p> 
	 * @param typeId 
	 * @see com.oci.dao.WordTypeDAO#deleteWordType(java.lang.Integer) 
	*/
	@Override
	public void deleteWordType(Integer typeId) {
		// TODO Auto-generated method stub
		wordTypeMapper.deleteWordType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findWordTypeVos</p> 
	 * <p>Description: </p> 
	 * @param wordType
	 * @return 
	 * @see com.oci.dao.WordTypeDAO#findWordTypeVos(com.oci.domain.searcher.WordTypeSearcher) 
	*/
	@Override
	public List<WordTypeVo> findWordTypeVos(
			WordTypeSearcher wordType) {
		// TODO Auto-generated method stub
		return wordTypeMapper.findWordTypeVos(wordType);
	}

}
