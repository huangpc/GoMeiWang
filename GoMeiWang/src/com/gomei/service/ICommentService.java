package com.gomei.service;

import java.util.List;

import com.gomei.model.Comment;

public interface ICommentService {
	public Comment load(int id);
	public void add(Comment comment);
	public List<Comment> list();
}
