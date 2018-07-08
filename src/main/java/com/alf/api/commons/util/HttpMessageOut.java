package com.alf.api.commons.util;


/** 
* @ClassName: HttpMessageOut 
* @Description:  信息反馈实体类
* @author GuoXiangBiao
* @date 2017年11月29日 上午11:01:37 
*  
*/
public class HttpMessageOut {
	/**
	 * 系统繁忙
	 */
	public static final String STATUS_SYSTEMBUSY = "-1";
	/**
	 * 成功
	 */
	public static final String STATUS_SUCCESS = "0";
	/**
	 * 失败
	 */
	public static final String STATUS_FAIL = "1";
	/**
	 * token错误
	 */
	public static final String STATUS_TOKENERROR = "10001";
	/**
	 * 调用api频繁
	 */
	public static final String STATUS_APIBUSY = "10002";
	/**
	 * 用户未授权该api
	 */
	public static final String STATUS_AUTHORIZE = "10003";
	/**
	 * 用户受限，可能是违规后被封禁
	 */
	public static final String STATUS_USERLIMIT = "10004";
	/**
	 * 系统错误
	 */
	public static final String STATUS_SYSTEMERROR = "10005";
	/**
	 * 没有相应的用户
	 */
	public static final String STATUS_LACKUSER = "10006";
	/**
	 * 需要GET请求
	 */
	public static final String STATUS_GET = "11001";
	/**
	 * 需要POST请求
	 */
	public static final String STATUS_POST = "11002";
	/**
	 * 需要HTTPS请求
	 */
	public static final String STATUS_HTTPS = "11003";
	/**
	 * POST数据包为空
	 */
	public static final String STATUS_DATANULL = "12001";
	/**
	 * 内容消息为空
	 */
	public static final String STATUS_CONTENTNULL = "12002";
	/**
	 * 文本消息为空
	 */
	public static final String STATUS_TEXTNULL = "12003";
	/**
	 * 不合法的参数
	 */
	public static final String STATUS_PARAM = "20011";
	/**
	 * 不合法的请求格式
	 */
	public static final String STATUS_FORMAT = "20012";
	/**
	 * 日期格式错误
	 */
	public static final String STATUS_DATETIME = "20013";

	/**
	 * 代码标识
	 */
	private String msgCode;
	/**
	 * 信息
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private Object data;

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @描述 设置失败状态
	 */
	// public void setStatusFail() {
	// this.msgCode = STATUS_FAIL;
	// }

	/**
	 * @描述 设置失败状态和消息
	 */
	public void setStatusFail(String msg) {
		this.msgCode = STATUS_FAIL;
		this.msg = msg;
	}
	/**
	 * @描述 系统繁忙
	 */
	public void setStatusSystembusy() {
		this.msgCode = STATUS_SYSTEMBUSY;
		this.msg = "系统繁忙";
	}
	/**
	 * @描述 请求成功有参数
	 */
	public void setStatusSuccess(Object data) {
		this.msgCode = STATUS_SUCCESS;
		this.msg = "请求成功";	
		this.data = data; }
	/**
	 * @描述 请求成功无参数
	 */
	public void setStatusSuccess() {
		this.msgCode = STATUS_SUCCESS;
		this.msg = "请求成功";	
		this.data = "";}
	/**
	 * @描述 获取token失败
	 */
	public void setStatusTokenerror() {
		this.msgCode = STATUS_TOKENERROR;
		this.msg = "获取token时错误，或者token无效";	}
	/**
	 * @描述 API调用频繁，请稍后再试
	 */
	public void setStatusApibusy() {
		this.msgCode = STATUS_APIBUSY;
		this.msg = "API调用太频繁，请稍后再试";	}
	/**
	 * @描述 用户未授权该API
	 */
	public void setStatusAuthorize() {
		this.msgCode = STATUS_AUTHORIZE;
		this.msg = "用户未授权该API";	}
	/**
	 * @描述 用户受限
	 */
	public void setStatusUserlimit() {
		this.msgCode = STATUS_USERLIMIT;
		this.msg = "用户受限";	}
	/**
	 * @描述 系统错误
	 */
	public void setStatusSystemerror() {
		this.msgCode = STATUS_SYSTEMERROR;
		this.msg = "系统错误";	}
	/**
	 * @描述 没有相应的用户
	 */
	public void setStatusLackuser() {
		this.msgCode = STATUS_LACKUSER;
		this.msg = "没有相应的用户";	}
	/**
	 * @描述 需要GET请求
	 */
	public void setStatusGet() {
		this.msgCode = STATUS_GET;
		this.msg = "需要GET请求";	}
	/**
	 * @描述 需要POST请求
	 */
	public void setStatusPost() {
		this.msgCode = STATUS_POST;
		this.msg = "需要POST请求";	}
	/**
	 * @描述 需要HTTPS请求
	 */
	public void setStatusHttps() {
		this.msgCode = STATUS_HTTPS;
		this.msg = "需要HTTPS请求";	}
	/**
	 * @描述 POST的数据包为空
	 */
	public void setStatusDatanull() {
		this.msgCode = STATUS_DATANULL;
		this.msg = "POST的数据包为空";	}
	/**
	 * @描述 内容消息为空
	 */
	public void setStatusContentnull() {
		this.msgCode = STATUS_CONTENTNULL;
		this.msg = "内容消息为空";	}
	/**
	 * @描述 文本消息为空
	 */
	public void setStatusTextnull() {
		this.msgCode = STATUS_TEXTNULL;
		this.msg = "文本消息为空";	}
	/**
	 * @描述 不合法的参数
	 */
	public void setStatusParam() {
		this.msgCode = STATUS_PARAM;
		this.msg = "不合法的参数";	}
	/**
	 * @描述 不合法的请求格式
	 */
	public void setStatusFormat() {
		this.msgCode = STATUS_FORMAT;
		this.msg = "不合法的请求格式";	}
	/**
	 * @描述 日期格式错误
	 */
	public void setStatusDatetime() {
		this.msgCode = STATUS_DATETIME;
		this.msg = "日期格式错误";	}
	/**
	 * @描述 接口代码异常状态消息
	 */
	public void setStatusInterfaceFail() {
		this.msgCode = STATUS_APIBUSY;
		this.msg = "API调用太频繁，请稍后再试";
	}
	

}