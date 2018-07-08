package com.alf.api.homepage.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alf.api.commons.util.JsonUtils;
import com.alf.api.homepage.mapper.PbAreaMapper;
import com.alf.api.homepage.pojo.PbAreaVo;
import com.alf.api.homepage.service.UrbanDataJsonService;
import com.alibaba.fastjson.JSON;
/**
 * 三级联动生成数据   放到小程序文件里  业务实现层
 * @author Administrator
 *
 */
@Service
public class UrbanDataJsonServiceImpl implements UrbanDataJsonService{
	@Autowired
	private PbAreaMapper pbAreaMapper;
	/**
	 *小程序做三级联动 形成文件  查询数据库 所有城市 形成json
	 * @param parentid
	 * @return
	 */
	public String  selectPbAreaAllData(Integer parentid) {
		List<PbAreaVo> list = pbAreaMapper.selectByParentIdIsAllUrban(parentid);
		Map<Integer, List<PbAreaVo>>  citymap = new HashMap<Integer, List<PbAreaVo>>();
		Map<Integer, List<PbAreaVo>>  areamap = new HashMap<Integer, List<PbAreaVo>>();
		for (int i = 0; i < list.size(); i++) {
			PbAreaVo pv = list.get(i);
			List<PbAreaVo> citylist = pbAreaMapper.selectByParentIdIsAllUrban(pv.getId());
			citymap.put(pv.getId(), citylist);
			for (int j = 0; j < citylist.size(); j++) {
				PbAreaVo citypv = citylist.get(j);
				List<PbAreaVo> arealist = pbAreaMapper.selectByParentIdIsAllUrban(citypv.getId());
				areamap.put(citypv.getId(), arealist);
			}
		}
		System.out.println(JSON.toJSONString(list));
		System.out.println(JSON.toJSONString(citymap));
		System.out.println(JSON.toJSONString(areamap));
		return JSON.toJSONString(list);
	}
	/**
	 * 查询街道的接口
	 * @param parentid
	 * @return
	 */
	public List<PbAreaVo>  selectByParentIdStreetDate(Integer parentid) {
		List<PbAreaVo> list = pbAreaMapper.selectByParentIdIsAllUrban(parentid);
		PbAreaVo pbarea = new PbAreaVo();
		pbarea.setAreaname("其它(本区域)");
		pbarea.setId(-1);
		pbarea.setParentid(parentid);
		pbarea.setShortname("其它(本区域)");
		list.add(pbarea);
		return list;
	}
}
