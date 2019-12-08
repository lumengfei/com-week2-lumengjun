package com.week2.lumengjun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.week2.lumengjun.entity.GongCheng;

public interface GongChengMapper {

	
	void add(GongCheng gong);

	@Select("select * from gongcheng")
	List<GongCheng> getGongChengList();

}
