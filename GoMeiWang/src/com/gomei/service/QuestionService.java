package com.gomei.service;

import java.util.List;

import com.gomei.dao.IQuestionDao;
import com.gomei.model.Question;

public class QuestionService implements IQuestionService {

	private IQuestionDao questionDao;
	
	
	public IQuestionDao getQuestionDao() {
		return questionDao;
	}

	public void setQuestionDao(IQuestionDao questionDao) {
		this.questionDao = questionDao;
	}

	public Question load(int id) {
		// TODO Auto-generated method stub
		return questionDao.load(id);
	}

	public void add(Question question) {
		// TODO Auto-generated method stub
		questionDao.add(question);
	}

	public List<Question> list() {
		// TODO Auto-generated method stub
		return questionDao.list();
	}

}
