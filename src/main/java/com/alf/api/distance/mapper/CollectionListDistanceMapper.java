package com.alf.api.distance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alf.api.distance.pojo.CourierAddress;

public interface CollectionListDistanceMapper {
	/**
	 * 查询快递员 与 用户的局里
	 * @param lng  经度
	 * @param lat  纬度
	 * @param type 1 代表距离排序 2代表价格排序
	 * @param rice 按照价格排序  半径为
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<CourierAddress> selectCourierListDistance(@Param("lng")String lng,@Param("lat")String lat,@Param("type")Integer type,@Param("area")Integer area,@Param("range")Integer range,@Param("page")Integer page,@Param("rows")Integer rows);
}
