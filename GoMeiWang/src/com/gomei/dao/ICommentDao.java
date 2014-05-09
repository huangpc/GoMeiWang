package com.gomei.dao;

import java.util.List;

import com.gomei.model.Comment;

public interface ICommentDao {
	public void add(Comment comment);
	public Comment load(int id);
	public List<Comment> list();
}
