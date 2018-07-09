package com.alf.api.homepage.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alf.api.commons.util.HttpMessageOut;
import com.alf.api.commons.util.JsonUtils;
import com.alf.api.commons.util.StringUtil;
import com.alf.api.homepage.service.UrbanDataJsonService;
import com.alibaba.fastjson.JSON;
/**
 * 三级联动生成数据   放到小程序文件里
 * @author Administrator
 *
 */
@Controller
public class UrbanDataJsonController {
	@Autowired
	private UrbanDataJsonService urbanDataJsonService;
	/**
	 *小程序做三级联动 形成文件  查询数据库 所有城市 形成json
	 * @param parentid
	 * @return
	 */
	@RequestMapping(value = "selectPbAreaAllData.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String  selectPbAreaAllData(Integer parentid) {
		return urbanDataJsonService.selectPbAreaAllData(parentid);
	}
	/**
	 * 查询街道的接口 11111
	 * @param parentid
	 * @return
	 */
	@RequestMapping(value = "selectByParentIdStreetDate.do", produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String  selectByParentIdStreetDate(String parentid,HttpServletResponse response) {
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		HttpMessageOut httpMessageOut = new HttpMessageOut();
		try {
			if(StringUtil.isEmpty(String.valueOf(parentid))) {
				httpMessageOut.setStatusParam();
				httpMessageOut.setStatusFail("parentid是必传递的参数");
			}else {
				httpMessageOut.setData(urbanDataJsonService.selectByParentIdStreetDate(Integer.parseInt(parentid)));
				httpMessageOut.setMsg("请求成功");
				httpMessageOut.setMsgCode(httpMessageOut.STATUS_SUCCESS);
			}
		} catch (Exception e) {
			e.printStackTrace();
			httpMessageOut.setData(null);
			httpMessageOut.setMsg("请求失败");
			httpMessageOut.setMsgCode(httpMessageOut.STATUS_FAIL);
		}
		return JSON.toJSONString(httpMessageOut);
	}
}
