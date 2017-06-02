/**   
  * @Title: WordTypeServiceImpl.java 
  * @Package com.oci.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月29日 上午11:57:06 
  * @version V1.0   
*/
package com.oci.service;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oci.dao.WordTypeDAO;
import com.oci.domain.WordType;
import com.oci.domain.searcher.WordTypeSearcher;
import com.oci.domain.vo.WordTypeVo;

/** 
 * @ClassName: WordTypeServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月29日 上午11:57:06 
 *  
 */
@Service
@Transactional
public class WordTypeServiceImpl implements WordTypeService {
	
	@Resource
	@Autowired
	private WordTypeDAO wordTypeDAO;
	
	
	public void setWordTypeDAO(WordTypeDAO wordTypeDAO) {
		this.wordTypeDAO = wordTypeDAO;
	}

	/* (非 Javadoc) 
	 * <p>Title: findAllWordTypeVo</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see com.oci.service.WordTypeService#findAllWordTypeVo() 
	 */
	@Override
	public List<WordTypeVo> findAllWordTypeVo() {
		// TODO Auto-generated method stub
		return wordTypeDAO.findAllWordTypeVo();
	}

	/* (非 Javadoc) 
	 * <p>Title: findWordType</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.service.WordTypeService#findWordType(java.lang.Integer) 
	 */
	@Override
	public WordType findWordType(Integer typeId) {
		// TODO Auto-generated method stub
		return wordTypeDAO.findWordType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findWordTypeVo</p> 
	 * <p>Description: </p> 
	 * @param typeId
	 * @return 
	 * @see com.oci.service.WordTypeService#findWordTypeVo(java.lang.Integer) 
	 */
	@Override
	public WordTypeVo findWordTypeVo(Integer typeId) {
		// TODO Auto-generated method stub
		return wordTypeDAO.findWordTypeVo(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: updateWordType</p> 
	 * <p>Description: </p> 
	 * @param wordType 
	 * @see com.oci.service.WordTypeService#updateWordType(com.oci.domain.WordType) 
	 */
	@Override
	public void updateWordType(WordType wordType) {
		// TODO Auto-generated method stub
		wordTypeDAO.updateWordType(wordType);
	}

	/* (非 Javadoc) 
	 * <p>Title: insertWordType</p> 
	 * <p>Description: </p> 
	 * @param wordType 
	 * @see com.oci.service.WordTypeService#insertWordType(com.oci.domain.WordType) 
	 */
	@Override
	public void insertWordType(WordType wordType) {
		// TODO Auto-generated method stub
		wordTypeDAO.insertWordType(wordType);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteWordTypes</p> 
	 * <p>Description: </p> 
	 * @param typeIds 
	 * @see com.oci.service.WordTypeService#deleteWordTypes(java.util.List) 
	 */
	@Override
	public void deleteWordTypes(List<Integer> typeIds) {
		// TODO Auto-generated method stub
		wordTypeDAO.deleteWordTypes(typeIds);
	}

	/* (非 Javadoc) 
	 * <p>Title: deleteWordType</p> 
	 * <p>Description: </p> 
	 * @param typeId 
	 * @see com.oci.service.WordTypeService#deleteWordType(java.lang.Integer) 
	 */
	@Override
	public void deleteWordType(Integer typeId) {
		// TODO Auto-generated method stub
		wordTypeDAO.deleteWordType(typeId);
	}

	/* (非 Javadoc) 
	 * <p>Title: findWordTypeVos</p> 
	 * <p>Description: </p> 
	 * @param wordType
	 * @return 
	 * @see com.oci.service.WordTypeService#findWordTypeVos(com.oci.domain.searcher.WordTypeSearcher) 
	*/
	@Override
	public List<WordTypeVo> findWordTypeVos(
			WordTypeSearcher wordType) {
		// TODO Auto-generated method stub
		return wordTypeDAO.findWordTypeVos(wordType);
	}

}
