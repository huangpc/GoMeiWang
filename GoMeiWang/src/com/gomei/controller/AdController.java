package com.gomei.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gomei.model.Ad;
import com.gomei.service.IAdService;
import com.gomei.util.SpringMvcUtil;

@Controller
public class AdController{
	private IAdService adService;
	
	@RequestMapping(value="/ad", method=RequestMethod.GET)
	public String index(Model model){
		System.out.println("enter ad");
		adService = (IAdService) SpringMvcUtil.getFactory().getBean("adService");
		List<Ad> ad1 = adService.loadByType(0);
		for(int i = 0; i < ad1.size(); i++)
			System.out.println(ad1.get(i));
		
		model.addAttribute("ad1", ad1);
		List<Ad> ad2 = adService.loadByType(1);
		for(int i = 0; i < ad2.size(); i++)
			System.out.println(ad2.get(i));
		model.addAttribute("ad2", ad2);
		List<Ad> ad3 = adService.loadByType(2);
		for(int i = 0; i < ad3.size(); i++)
			System.out.println(ad3.get(i));
		model.addAttribute("ad3", ad3);
		return "ad";
	}

}
