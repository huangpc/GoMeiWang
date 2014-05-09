package com.gomei.dao;

import java.util.List;
import com.gomei.model.Question;

public interface IQuestionDao {
	public void add(Question question);
	public Question load(int id);
	public List<Question> list();
}
