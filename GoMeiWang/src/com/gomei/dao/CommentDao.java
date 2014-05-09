package com.gomei.dao;

import java.util.List;

import com.gomei.model.Comment;


@SuppressWarnings("rawtypes")
public class CommentDao extends BaseDao implements ICommentDao {

	@SuppressWarnings("unchecked")
	public void add(Comment comment) {
		// TODO Auto-generated method stub
		super.add(comment);
	}

	@SuppressWarnings("unchecked")
	public Comment load(int id) {
		// TODO Auto-generated method stub
		return (Comment) super.load(Comment.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Comment> list() {
		// TODO Auto-generated method stub
		return super.list(Comment.class, null);
	}

}
