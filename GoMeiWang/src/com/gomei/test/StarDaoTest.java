package com.gomei.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gomei.dao.DAOFactory;
import com.gomei.dao.IAdDao;
import com.gomei.dao.IStarDao;
import com.gomei.model.Ad;
import com.gomei.model.Star;

public class StarDaoTest {

	private IStarDao starDao;
	
	@Before
	public void init() {
		starDao = DAOFactory.getStarDao();
	}
	
	@Test
	public void testStarAdd(){
		Star s = new Star();
		s.setImage("www.baidu.com/a.jpg");
		s.setTitle("hello world2");
		s.setName("star name");
		
		starDao.add(s);
	}
	
	@Test
	public void testStarLoad(){
		Star s = new Star();
		s = starDao.load(1);
		System.out.println(s);
	}
	/*
	@Test 
	public void testAdList(){
		List<Ad> ads = new ArrayList<Ad>();
		ads = adDao.list();
		for(int i = 0; i < ads.size(); i++){
			Ad ad = ads.get(i);
			System.out.println(ad);
		}
	}*/

}
