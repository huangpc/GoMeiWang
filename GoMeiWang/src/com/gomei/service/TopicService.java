package com.gomei.service;

import java.util.List;

import com.gomei.dao.ITopicDao;
import com.gomei.model.Topic;

public class TopicService implements ITopicService {

	private ITopicDao topicDao;
	
	
	public ITopicDao getTopicDao() {
		return topicDao;
	}

	public void setTopicDao(ITopicDao topicDao) {
		this.topicDao = topicDao;
	}

	public Topic load(int id) {
		// TODO Auto-generated method stub
		return topicDao.load(id);
	}

	public void add(Topic topic) {
		// TODO Auto-generated method stub
		topicDao.add(topic);
	}

	public List<Topic> list() {
		// TODO Auto-generated method stub
		return topicDao.list();
	}
	
	public List<Topic> loadByType(int type){
		return topicDao.loadByType(type);
	}

}
