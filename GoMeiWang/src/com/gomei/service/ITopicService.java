package com.gomei.service;

import java.util.List;

import com.gomei.model.Topic;

public interface ITopicService {
	public Topic load(int id);
	public void add(Topic topic);
	public List<Topic> list();
	public List<Topic> loadByType(int type);
}
