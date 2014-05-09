package com.gomei.dao;

import java.util.List;

import com.gomei.model.Topic;

public interface ITopicDao {
	public void add(Topic topic);
	public Topic load(int id);
	public List<Topic> list();
	public List<Topic> loadByType(int type);
}
