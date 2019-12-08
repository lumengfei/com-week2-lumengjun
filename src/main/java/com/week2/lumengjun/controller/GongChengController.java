package com.week2.lumengjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.week2.lumengjun.entity.GongCheng;
import com.week2.lumengjun.service.GongChengService;


@Controller
public class GongChengController {

	@Autowired
	GongChengService ser;
	
	
	@RequestMapping("list")
	public String list(Model m){
		PageHelper.startPage(1, 10);
		List<GongCheng> list = ser.getGongChengList();
		PageInfo<GongCheng> pageInfo = new PageInfo<GongCheng>(list);
		m.addAttribute("list", pageInfo);
		return "list";
		
	}
	
}
