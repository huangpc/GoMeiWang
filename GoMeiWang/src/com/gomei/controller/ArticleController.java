package com.gomei.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gomei.model.Article;
import com.gomei.service.IArticleService;
import com.gomei.util.SpringMvcUtil;

@Controller
@RequestMapping("/article")
public class ArticleController{
	private IArticleService articleService;
	
	@RequestMapping(value="/articles", method=RequestMethod.GET)
	public String index(Model model){
		System.out.println("enter article");
		articleService =  (IArticleService) SpringMvcUtil.getFactory().getBean("articleService");
		List<Article> articles = articleService.loadByType(0);
		model.addAttribute("articles", articles);
		return "/article/list";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String show(@PathVariable int id, Model model){
		articleService =  (IArticleService) SpringMvcUtil.getFactory().getBean("articleService");
		System.out.println(id);
		Article article = articleService.load(id);
		System.out.println(article);
		model.addAttribute("article", article);
		return "/article/show";
	}

}
