package com.alf.api.homepage.service;

import java.util.List;



import com.alf.api.homepage.pojo.PbAreaVo;

public interface UrbanDataJsonService {
	/**
	 *小程序做三级联动 形成文件  查询数据库 所有城市 形成json
	 * @param parentid
	 * @return
	 */
	public String  selectPbAreaAllData(Integer parentid);
	/**
	 * 查询街道的接口
	 * @param parentid
	 * @return
	 */
	public List<PbAreaVo>  selectByParentIdStreetDate(Integer parentid);
}
