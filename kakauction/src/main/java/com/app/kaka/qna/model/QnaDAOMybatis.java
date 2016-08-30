package com.app.kaka.qna.model;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.app.kaka.common.SearchVO;

@Repository
public class QnaDAOMybatis extends SqlSessionDaoSupport implements QnaDAO {
	
	private String namespace="config.mybatis.mapper.oracle.qna";

	@Override
	public List<QnaVO> selectAll(SearchVO searchVo) {
		return getSqlSession().selectList(namespace+".selectAll", searchVo);
	}

	@Override
	public int selectTotalCount(SearchVO searchVo) {
		return getSqlSession().selectOne(namespace+".selectTotalCount", searchVo);
	}

	@Override
	public QnaVO selectByNo(int questionNo) {
		return getSqlSession().selectOne(namespace+".selectByNo", questionNo);
	}
	
	
}