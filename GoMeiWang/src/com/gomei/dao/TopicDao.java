package com.gomei.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gomei.model.Topic;

@SuppressWarnings("rawtypes")
public class TopicDao extends BaseDao implements ITopicDao {

	@SuppressWarnings("unchecked")
	public void add(Topic topic) {
		// TODO Auto-generated method stub
		super.add(topic);
	}

	@SuppressWarnings("unchecked")
	public Topic load(int id) {
		// TODO Auto-generated method stub
		return (Topic) super.load(Topic.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Topic> list() {
		// TODO Auto-generated method stub
		return super.list(Topic.class, null);
	}
	
	@SuppressWarnings("unchecked")
	public List<Topic> loadByType(int type){
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("type", type);
		return super.loadByType(Topic.class, params);
	}

}
