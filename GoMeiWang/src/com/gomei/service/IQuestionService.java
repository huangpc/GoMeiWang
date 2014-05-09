package com.gomei.service;

import java.util.List;

import com.gomei.model.Question;

public interface IQuestionService {
	public Question load(int id);
	public void add(Question question);
	public List<Question> list();
}
