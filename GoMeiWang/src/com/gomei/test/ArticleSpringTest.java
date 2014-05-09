package com.gomei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gomei.model.Article;
import com.gomei.model.Star;
import com.gomei.service.ArticleService;
import com.gomei.service.StarService;

public class ArticleSpringTest {

	private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testArticleLoad(){
		ArticleService articleService = (ArticleService)factory.getBean("articleService");
		Article article = articleService.load(0);
		System.out.println(article);
	}
	
	
	@Test
	public void testArticleList(){
		ArticleService articleService = (ArticleService)factory.getBean("articleService");
		List<Article> articles = articleService.list();
		System.out.println(articles.get(1));
	}
	
	/*
	@Test
	public void testStarAdd(){
		StarService starService = (StarService)factory.getBean("starService");
		Star s = new Star();
		s.setImage("image");
		s.setName("name");
		s.setTitle("title");
		
		starService.add(s);
		//System.out.println(signedStar);
	}*/

	/*
	@Test
	public void testStarLoadByType(){
		StarService starService = (StarService)factory.getBean("starService");
		List<Star> stars = starService.loadByType(0);
		for(int i = 0; i < stars.size(); i++)
			System.out.println(stars.get(i));
	}*/
}
