package com.gomei.service;

import java.util.List;

import com.gomei.dao.IArticleDao;
import com.gomei.model.Article;

public class ArticleService implements IArticleService {

	private IArticleDao articleDao;
	
	
	public IArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(IArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public Article load(int id) {
		// TODO Auto-generated method stub
		return articleDao.load(id);
	}

	public void add(Article article) {
		// TODO Auto-generated method stub
		articleDao.add(article);
	}

	public List<Article> list() {
		// TODO Auto-generated method stub
		return articleDao.list();
	}
	
	public List<Article> loadByType(int type){
		return articleDao.loadByType(type);
	}
	
	public List<Article> loadByTopic(int topicid){
		return articleDao.loadByTopic(topicid);
	}

}
