package com.gomei.dao;

import java.util.List;

import com.gomei.model.Question;

@SuppressWarnings("rawtypes")
public class QuestionDao extends BaseDao implements IQuestionDao {

	@SuppressWarnings("unchecked")
	public void add(Question question) {
		// TODO Auto-generated method stub
		super.add(question);
	}

	@SuppressWarnings("unchecked")
	public Question load(int id) {
		// TODO Auto-generated method stub
		return (Question) super.load(Question.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Question> list() {
		// TODO Auto-generated method stub
		return super.list(Question.class, null);
	}

}
