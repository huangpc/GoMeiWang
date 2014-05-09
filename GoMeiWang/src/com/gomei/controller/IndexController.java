package com.gomei.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gomei.model.Ad;
import com.gomei.model.Article;
import com.gomei.model.Star;
import com.gomei.model.Topic;
import com.gomei.service.IAdService;
import com.gomei.service.IArticleService;
import com.gomei.service.IStarService;
import com.gomei.service.ITopicService;
import com.gomei.util.SpringMvcUtil;

@Controller
public class IndexController {

	private IAdService adService;
	private IStarService starService;
	private IArticleService articleService;
	private ITopicService topicService;
	
	@RequestMapping(value="/index.html", method=RequestMethod.GET)
	public String index(Model model){
		System.out.println("enter index controller");
		
		/**
		 *  ad service
		 */
		adService = (IAdService) SpringMvcUtil.getFactory().getBean("adService");
		List<Ad> ad1 = adService.loadByType(0);
		model.addAttribute("ad1", ad1);
		List<Ad> ad2 = adService.loadByType(1);
		model.addAttribute("ad2", ad2);
		List<Ad> ad3 = adService.loadByType(2);
		model.addAttribute("ad3", ad3);
		
		
		/**
		 * star service
		 */
		starService = (IStarService) SpringMvcUtil.getFactory().getBean("starService");
		List<Star> stars1 = starService.loadByType(0);
		model.addAttribute("stars1", stars1);
		
		
		/**
		 * topic service
		 */
		
		topicService = (ITopicService) SpringMvcUtil.getFactory().getBean("topicService");
		Topic hotTopic = topicService.load(1);
		int hotTopicId = hotTopic.getId();
		model.addAttribute("hotTopic", hotTopic);
		Topic tecTopic = topicService.load(5);
		int tecTopicId = tecTopic.getId();
		model.addAttribute("tecTopic", tecTopic);
		/**
		 * article service
		 * 
		 */
		articleService = (IArticleService)SpringMvcUtil.getFactory().getBean("articleService");
		List<Article> articles1 = articleService.loadByTopic(hotTopicId);
		model.addAttribute("articles1", articles1);
		
		List<Article> articles2 = articleService.loadByTopic(tecTopicId);
		model.addAttribute("articles2", articles2);
		return "index";
	}
}
