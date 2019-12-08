package com.week2.lumengjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.week2.lumengjun.dao.GongChengMapper;
import com.week2.lumengjun.entity.GongCheng;
import com.week2.lumengjun.service.GongChengService;
@Service
public class GongChengServiceImpl implements GongChengService {

	@Autowired
	GongChengMapper ma;

	@Override
	public void add(GongCheng gong) {
		System.out.println(gong);
		ma.add(gong);
		System.out.println("插入第"+gong.getGid()+"条数据");
	}

	@Override
	public List<GongCheng> getGongChengList() {
		// TODO Auto-generated method stub
		return ma.getGongChengList();
	}
	
	
}
