package com.luemgjun.test;
/*
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.Spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;



import com.lumengjun.cms.utils.FileUtils;
import com.week2.lumengjun.entity.GongCheng;
import com.week2.lumengjun.service.GongChengService;

@ContextConfiguration(value={"classpath:spring-beans.xml"})
@RunWith(SpringRunner.class)*/
public class Demo {
/*
	@Autowired
	GongChengService ser;
	
	@Test
	public void testadd() throws ParseException{
		System.out.println(1);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		GongCheng gong = new GongCheng();
		try {
			System.out.println(2);
			List<String> readByLines = FileUtils.readByLines("C:\\Users\\ASUS\\Desktop\\新建文本文档.txt");
			for (String string : readByLines) {
				System.out.println(string);
				String[] gc = string.split("\\|");
				System.out.println(gc[0]);
				gong.setGname(gc[0]);
				gong.setGender(gc[1]);
				gong.setCity(gc[2]);
				gong.setCompany(gc[3]);
				gong.setMajor1(gc[4]);
				gong.setMajor2(gc[5]);
				gong.setMajor3(gc[6]);
				gong.setRegister(gc[7]);
				gong.setPerform(gc[8]);
				
				String replace = gc[9].replace(".", "-");
				System.out.println(replace);
				Date parse = simpleDateFormat.parse(replace);
				gong.setDt(parse);
				ser.add(gong);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
}
