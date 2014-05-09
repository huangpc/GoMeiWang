package com.gomei.dao;

import java.util.List;

import com.gomei.model.Article;

public interface IArticleDao {
	public void add(Article article);
	public Article load(int id);
	public List<Article> list();
	public List<Article> loadByType(int type);
	public List<Article> loadByTopic(int topicid);
}
