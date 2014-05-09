package com.gomei.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gomei.dao.DAOFactory;
import com.gomei.dao.IAdDao;
import com.gomei.model.Ad;

public class AdDaoTest {

	private IAdDao adDao;
	
	@Before
	public void init() {
		adDao = DAOFactory.getAdDao();
	}
	
	@Test
	public void testAdAdd(){
		Ad ad = new Ad();
		ad.setImage("www.baidu.com/a.jpg");
		ad.setTitle("hello world2");
		ad.setPosition(2);
		ad.setIntro("id intro");
		
		adDao.add(ad);
	}
	
	@Test
	public void testAdLoad(){
		Ad ad = new Ad();
		ad = adDao.load(1);
		System.out.println(ad);
	}
	
	@Test 
	public void testAdList(){
		List<Ad> ads = new ArrayList<Ad>();
		ads = adDao.list();
		for(int i = 0; i < ads.size(); i++){
			Ad ad = ads.get(i);
			System.out.println(ad);
		}
	}

}
