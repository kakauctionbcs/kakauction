package com.app.kaka.picture.model;

public interface PictureDAO {
	public int insertPicture(PictureVO pictureVo);
	public PictureVO pictureDetail(String carNum);
}