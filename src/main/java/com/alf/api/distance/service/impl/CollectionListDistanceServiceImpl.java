package com.alf.api.distance.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alf.api.distance.mapper.CollectionListDistanceMapper;
import com.alf.api.distance.pojo.CourierAddress;
import com.alf.api.distance.service.CollectionListDistanceService;
/**
 * 列表用户查询快递员 返回信息操作
 * @author Administrator
 *
 */
@Service
public class CollectionListDistanceServiceImpl implements CollectionListDistanceService {
	@Autowired
	private CollectionListDistanceMapper collectionListDistanceMapper;
	/**
	 * 查询快递员 与 用户的局里
	 * 1 当距离查询的时候 type为1 area与range 不必穿值
	 * 2当区域查询的时候 type为2  range 不必传值 area 必须传
	 * 3当范围查询的时候 type 为 3 area 不必传值  range 必须传值 
	 * @param lng  经度
	 * @param lat  纬度
	 * @param page 第几页
	 * @param rows 每页加载多少条
	 * @param type 1代表距离排序 2代表价格排序 市区内搜索内搜索   3代表附近三千米的 快递员
	 * @param response
	 * @return
	 */
	public Map<String, Object> selectCourierListDistance(String lng,String lat,Integer type,Integer area,Integer range,Integer page,Integer rows){
		Map<String, Object> map = new HashMap<String, Object>();
		List<CourierAddress> list = null;
		if(type == 3){
			range = 3000;
			list = collectionListDistanceMapper.selectCourierListDistance(lng, lat, type,null,range,(page-1)*rows, rows);
		}else if(type == 2 ) {
			
			list = collectionListDistanceMapper.selectCourierListDistance(lng, lat, type,area,null,(page-1)*rows, rows);
			
		}else {
			list = collectionListDistanceMapper.selectCourierListDistance(lng, lat, 1,null,null,(page-1)*rows, rows);
		}
		map.put("list", list);
		return map;
		
	}
}
