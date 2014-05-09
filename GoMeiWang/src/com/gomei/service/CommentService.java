package com.gomei.service;

import java.util.List;

import com.gomei.dao.ICommentDao;
import com.gomei.model.Comment;

public class CommentService implements ICommentService {

	private ICommentDao commentDao;
	
	
	public ICommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(ICommentDao commentDao) {
		this.commentDao = commentDao;
	}

	public Comment load(int id) {
		// TODO Auto-generated method stub
		return commentDao.load(id);
	}

	public void add(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.add(comment);
	}

	public List<Comment> list() {
		// TODO Auto-generated method stub
		return commentDao.list();
	}

}
