package com.gomei.dao;

public class DAOFactory {
	
	public static IAdDao getAdDao(){
		return new AdDao();
	}
	
	public static ICommentDao getCommentDao(){
		return new CommentDao();
	}
	
	public static IDoctorDao getDoctorDao(){
		return new DoctorDao();
	}
	
	public static IHospitalDao getHospitalDao(){
		return new HospitalDao();
	}
	
	public static IQuestionDao getQuestionDao(){
		return new QuestionDao();
	}
	
	public static ITopicDao getTopicDao(){
		return new TopicDao();
	}
	
	public static IStarDao getStarDao(){
		return new StarDao();
	}
	
	public static IArticleDao getArticleDao(){
		return new ArticleDao();
	}
	
	public static IUserDao getUserDao(){
		return new UserDao();
	}
	
}
