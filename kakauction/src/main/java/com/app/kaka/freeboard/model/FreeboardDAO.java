package com.app.kaka.freeboard.model;

public interface FreeboardDAO {
	public int insertFreeboard(FreeboardVO freeboardVo);
	public FreeboardVO detailFreeboard(int freeboardNo);
}
