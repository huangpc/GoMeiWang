package com.gomei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gomei.model.Ad;
import com.gomei.model.Topic;
import com.gomei.service.AdService;
import com.gomei.service.TopicService;

public class TopicSpringTest {

	private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testTopicSpring(){
		TopicService topicService = (TopicService)factory.getBean("topicService");
		Topic topic = topicService.load(1);
		System.out.println(topic);
		List<Topic> topics = topicService.loadByType(0);
		for(int i = 0; i < topics.size(); i++)
			System.out.println(topics.get(i));
	}

}
