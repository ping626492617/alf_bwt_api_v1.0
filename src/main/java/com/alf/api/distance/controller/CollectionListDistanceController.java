package com.alf.api.distance.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alf.api.commons.util.HttpMessageOut;
import com.alf.api.commons.util.JsonUtils;
import com.alf.api.commons.util.StringUtil;
import com.alf.api.distance.service.CollectionListDistanceService;

/**
 * 列表用户查询快递员 返回信息操作
 * @author Administrator
 *
 */
@Controller
public class CollectionListDistanceController {
	@Autowired
	private CollectionListDistanceService collectionListDistanceService;
	/**
	 * 查询快递员 与 用户的局里
	 * @param lng  经度
	 * @param lat  纬度
	 * @param page 第几页
	 * @param rows 每页加载多少条
	 * @param type 1代表距离排序 2代表价格排序  三千米内
	 * @param response
	 * @return
	 */
	@RequestMapping(value=("selectCourierListDistance"), produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String selectCourierListDistance(String lng,String lat,Integer type,@RequestParam(defaultValue="110105")Integer area,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="10")Integer rows,HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		if(page <= 0) {
			page = 1;
		}
		HttpMessageOut messageOut=new HttpMessageOut();
		try {
			if(StringUtil.isEmpty(String.valueOf(lng))) {
				messageOut.setStatusParam();
				messageOut.setStatusFail("lng是必传递的参数");
			}else if(StringUtil.isEmpty(String.valueOf(lat))){
				messageOut.setStatusParam();
				messageOut.setStatusFail("lat是必传递的参数");
			}else {
				messageOut.setData(collectionListDistanceService.selectCourierListDistance(lng, lat,type,area, page, rows));
				messageOut.setMsg("请求成功");
				messageOut.setMsgCode(messageOut.STATUS_SUCCESS);
			}
		} catch (Exception e) {
			e.printStackTrace();
			messageOut.setData(null);
			messageOut.setMsg("请求失败");
			messageOut.setMsgCode(messageOut.STATUS_FAIL);
		}
		return JsonUtils.objectToJson(messageOut);
	}
}
