package com.app.kaka.car.model;

public interface CarService {

	public int insertCar(CarVO carVo);
	public CarVO carDetail(String carNum);

}