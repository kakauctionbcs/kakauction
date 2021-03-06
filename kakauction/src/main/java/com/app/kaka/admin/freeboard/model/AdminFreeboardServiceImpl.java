package com.app.kaka.admin.freeboard.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.kaka.freeboard.model.FreeboardVO;

@Service
public class AdminFreeboardServiceImpl implements AdminFreeboardService {
	private static final Logger logger = LoggerFactory.getLogger(AdminFreeboardServiceImpl.class);
	
	private AdminFreeboardDAO admFreeDao;

	@Override
	@Transactional
	public int deleteFreeboardMuti(List<FreeboardVO> freeList) {
		int cnt=0;
		for (FreeboardVO vo : freeList) {
			int freeboardNo = vo.getFreeboardNo();
			if (freeboardNo!=0) {
				cnt = admFreeDao.deleteFreeboardMuti(vo.getFreeboardNo());
			}
		}
		return cnt;
	}

	@Override
	public int deleteFreeboardMuti(int freeboardNo) {
		logger.info("freeboardNo====>",freeboardNo);
		return admFreeDao.deleteFreeboardMuti(freeboardNo);
	}
}
