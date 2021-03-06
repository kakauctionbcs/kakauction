package com.app.kaka.picture.model;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PictureDAOMybatis extends SqlSessionDaoSupport implements PictureDAO{
	private Logger logger = LoggerFactory.getLogger(PictureDAOMybatis.class);
	private String namespace = "config.mybatis.mapper.oracle.picture";

	@Override
	public int insertPicture(PictureVO pictureVo) {
		return getSqlSession().insert(namespace+".insertPicture", pictureVo);
	}

	@Override
	public PictureVO pictureDetail(String carNum) {
		return getSqlSession().selectOne(namespace+".selectByCarNum", carNum);
	}

	@Override
	public List<PictureVO> selectByMemberId(String memberId) {
		return getSqlSession().selectList(namespace+".selectByMemberId", memberId);
	}

	@Override
	public int editPicture(PictureVO pictureVo) {
		return getSqlSession().update(namespace+".editPicture", pictureVo);
	}
}
