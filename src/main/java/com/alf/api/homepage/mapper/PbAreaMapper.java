package com.alf.api.homepage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alf.api.entity.PbArea;
import com.alf.api.homepage.pojo.PbAreaVo;

public interface PbAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PbArea record);

    int insertSelective(PbArea record);

    PbArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PbArea record);

    int updateByPrimaryKey(PbArea record);
    /**
     * 根据父id查询所有数据 返回数据给小程序 做三级联动
     * @param parentid
     * @return
     */
    public List<PbAreaVo> selectByParentIdIsAllUrban(@Param("parentid")Integer parentid);
}