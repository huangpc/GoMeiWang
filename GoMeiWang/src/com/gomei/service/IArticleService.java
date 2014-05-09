package com.gomei.service;

import java.util.List;

import com.gomei.model.Article;


public interface IArticleService {
	public Article load(int id);
	public void add(Article article);
	public List<Article> list();
	public List<Article> loadByType(int type);
	public List<Article> loadByTopic(int topicid);
}
