package com.bc.web_project.dao;

import java.util.List;

import com.bc.web_project.vo.PlaceVo;

public interface PlaceDao {
	public List<PlaceVo> selectList(int cityNum);
	public PlaceVo selectOne(int num);
}
