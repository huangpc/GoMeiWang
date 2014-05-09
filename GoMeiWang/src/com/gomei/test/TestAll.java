package com.gomei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gomei.model.Ad;
import com.gomei.model.Article;
import com.gomei.model.Comment;
import com.gomei.model.Doctor;
import com.gomei.model.Hospital;
import com.gomei.model.Question;
import com.gomei.model.Star;
import com.gomei.model.Topic;
import com.gomei.model.User;
import com.gomei.service.AdService;
import com.gomei.service.ArticleService;
import com.gomei.service.CommentService;
import com.gomei.service.DoctorService;
import com.gomei.service.HospitalService;
import com.gomei.service.QuestionService;
import com.gomei.service.StarService;
import com.gomei.service.TopicService;
import com.gomei.service.UserService;

public class TestAll {

private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	
	@Test
	public void testAdSpring(){
		AdService adService = (AdService)factory.getBean("adService");
		
		Ad ad_add = new Ad();
		ad_add.setImage("add ad image");
		ad_add.setPosition(11);
		ad_add.setTitle("add ad title");
		
		adService.add(ad_add);
		
		Ad ad = adService.load(1);
		System.out.println(ad);
		List<Ad> ads = adService.list();
		for(int i = 0; i < ads.size(); i++)
			System.out.println(ads.get(i));
	}
	
	@Test
	public void testStarSpring(){
		StarService starService = (StarService)factory.getBean("starService");
		
		Star star_add = new Star();
		star_add.setImage("add star image");
		star_add.setName("add star name");
		star_add.setTitle("add star title");
		
		starService.add(star_add);
		
		
		Star star = starService.load(1);
		System.out.println(star);
		List<Star> stars = starService.list();
		for(int i = 0; i < stars.size(); i++)
			System.out.println(stars.get(i));
	}
	
	@Test
	public void testCommentSpring(){
		CommentService commentService = (CommentService)factory.getBean("commentService");
		
		Comment comment_add = new Comment();
		comment_add.setArticle(1);
		comment_add.setContent("add comment content");
		comment_add.setUser(1);
		
		commentService.add(comment_add);
		
		Comment comment = commentService.load(1);
		System.out.println(comment);
		List<Comment> comments = commentService.list();
		for(int i = 0; i < comments.size(); i++)
			System.out.println(comments.get(i));
	}
	
	@Test
	public void testUserSpring(){
		UserService userService = (UserService)factory.getBean("userService");
		
		User user_add = new User();
		user_add.setAddress("add user address");
		user_add.setAge(11);
		user_add.setEmail("add user email");
		user_add.setFans(111);
		user_add.setFollow(21);
		user_add.setGender(true);
		user_add.setHeadpic("add user headpic");
		user_add.setMessage(11);
		user_add.setName("add user name");
		user_add.setPassword("add user password");
		user_add.setPhone("user phone");
		user_add.setType(2);
		
		userService.add(user_add);
		
		User user = userService.load(1);
		System.out.println(user);
		List<User> users = userService.list();
		for(int i = 0; i < users.size(); i++)
			System.out.println(users.get(i));
	}
	
	@Test
	public void testTopicSpring(){
		TopicService topicService = (TopicService)factory.getBean("topicService");
		
		Topic topic_add = new Topic();
		topic_add.setComment("add topic comment");
		topic_add.setContent("add topic content");
		topic_add.setTitle("add topic title");
		topic_add.setType(1);
		
		topicService.add(topic_add);
		
		Topic topic = topicService.load(1);
		System.out.println(topic);
		List<Topic> topics = topicService.list();
		for(int i = 0; i < topics.size(); i++)
			System.out.println(topics.get(i));
	}
	
	@Test
	public void testDoctorSpring(){
		DoctorService doctorService = (DoctorService)factory.getBean("doctorService");
		
		Doctor doctor1 = new Doctor();
		doctor1.setAddress("doctor1 address");
		doctor1.setAge(32);
		doctor1.setEmail("doctor1 email");
		doctor1.setGender(false);
		doctor1.setHeadpic("doctor1 headpic");
		doctor1.setHospital(1);
		doctor1.setLicense("doctor1 license");
		doctor1.setName("doctor1 name");
		doctor1.setPassword("doctor1 password");
		doctor1.setPhone("doctor1 phone");
		
		doctorService.add(doctor1);
		
		Doctor doctor = doctorService.load(1);
		System.out.println(doctor);
		List<Doctor> doctors = doctorService.list();
		for(int i = 0; i < doctors.size(); i++)
			System.out.println(doctors.get(i));
	}
	
	@Test
	public void testHospitalSpring(){
		HospitalService hospitalService = (HospitalService)factory.getBean("hospitalService");
		
		Hospital h1 = new Hospital();
		h1.setAboutus("h1 about us");
		h1.setAddress("h1 address");
		h1.setImage("h1 image");
		h1.setLink("h1 link");
		h1.setName("h1 name");
		h1.setPhone("h1 phone");
		
		hospitalService.add(h1);
		
		Hospital hospital = hospitalService.load(1);
		System.out.println(hospital);
		List<Hospital> hospitals = hospitalService.list();
		for(int i = 0; i < hospitals.size(); i++)
			System.out.println(hospitals.get(i));
	}
	
	@Test
	public void testQuestionSpring(){
		QuestionService questionService = (QuestionService)factory.getBean("questionService");
		
		Question q1 = new Question();
		q1.setContent("q1 content");
		q1.setTitle("q1 title");
		q1.setType(1);
		q1.setUser(12);
		
		questionService.add(q1);
		
		Question question = questionService.load(1);
		System.out.println(question);
		List<Question> questions = questionService.list();
		for(int i = 0; i < questions.size(); i++)
			System.out.println(questions.get(i));
	}
	
	
	@Test
	public void testArticleSpring(){
		ArticleService articleService = (ArticleService)factory.getBean("articleService");
		
		Article a1 = new Article();
		a1.setAuthor(1);
		a1.setContent("a1 content");
		a1.setTitle("a1 title");
		//a1.setTopic(1);
		a1.setType(1);
		
		articleService.add(a1);
		
		Article article = articleService.load(1);
		System.out.println(article);
		List<Article> articles = articleService.list();
		for(int i = 0; i < articles.size(); i++)
			System.out.println(articles.get(i));
	}

}
