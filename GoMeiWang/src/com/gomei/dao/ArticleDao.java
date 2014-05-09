package com.gomei.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.gomei.model.Article;
import com.gomei.util.MyBatisUtil;

@SuppressWarnings("rawtypes")
public class ArticleDao extends BaseDao implements IArticleDao {

	@SuppressWarnings("unchecked")
	public void add(Article article) {
		// TODO Auto-generated method stub
		super.add(article);
	}

	@SuppressWarnings("unchecked")
	public Article load(int id) {
		// TODO Auto-generated method stub
		return (Article) super.load(Article.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Article> list() {
		// TODO Auto-generated method stub
		return super.list(Article.class, null);
	}
	
	@SuppressWarnings("unchecked")
	public List<Article> loadByType(int type){
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("type", type);
		return super.loadByType(Article.class, params);
	}
	
	public List<Article> loadByTopic(int topicid){
		System.out.println("topic = " + topicid);
		SqlSession session = null;
		List<Article> articles = new ArrayList<Article>();
		try {
			session = MyBatisUtil.createSession();
			Map<String, Integer> params = new HashMap<String, Integer>();
			params.put("topicid", topicid);
			articles = session.selectList(Article.class.getName()+".loadByTopic",params);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return articles;
	}

}
