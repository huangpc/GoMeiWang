package com.gomei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gomei.model.Ad;
import com.gomei.service.AdService;

public class AdSpringTest {

	private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testAdSpring(){
		AdService adService = (AdService)factory.getBean("adService");
		Ad ad = adService.load(1);
		System.out.println(ad);
		List<Ad> ads = adService.loadByType(0);
		for(int i = 0; i < ads.size(); i++)
			System.out.println(ads.get(i));
	}
}
