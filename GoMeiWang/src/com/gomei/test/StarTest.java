package com.gomei.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gomei.dao.AdDao;
import com.gomei.dao.StarDao;
import com.gomei.model.Ad;
import com.gomei.model.Star;

public class StarTest {

	@Test
	public void test(){
		StarDao starDao = new StarDao();
		Star s = new Star();
		s.setImage("image");
		s.setName("name");
		s.setTitle("title");
		
		starDao.add(s);
	}
	
	
	@Test
	public void test1(){
		AdDao aDao = new AdDao();
		Ad a = new Ad();
		a.setImage("image");
		a.setTitle("name");
		a.setPosition(11);
		
		aDao.add(a);
	}

}
