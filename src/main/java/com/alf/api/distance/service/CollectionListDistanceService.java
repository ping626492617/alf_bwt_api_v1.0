package com.alf.api.distance.service;

import java.util.List;
import java.util.Map;

import com.alf.api.distance.pojo.CourierAddress;

/**
 * 列表用户查询快递员 返回信息操作
 * @author Administrator
 *
 */
public interface CollectionListDistanceService {
	/**
	 * 查询快递员 与 用户的局里
	 * @param lng  经度
	 * @param lat  纬度
	 * @param page 第几页
	 * @param rows 每页加载多少条
	 * @return
	 */
	public Map<String, Object> selectCourierListDistance(String lng,String lat,Integer type,Integer area,Integer range,Integer page,Integer rows);
}
