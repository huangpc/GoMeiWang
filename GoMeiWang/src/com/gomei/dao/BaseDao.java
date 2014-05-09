package com.gomei.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.gomei.util.MyBatisUtil;

public class BaseDao<T> {
	public void add(T obj) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.insert(obj.getClass().getName()+".add",obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}
	
	public void update(T obj) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.update(obj.getClass().getName()+".update", obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}
	
	public void delete(Class<T> clz,int id) {
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.delete(clz.getName()+".delete", id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}
	
	@SuppressWarnings("unchecked")
	public T load(Class<T> clz,int id) {
		SqlSession session = null;
		T t = null;
		try {
			session = MyBatisUtil.createSession();
			t = (T)session.selectOne(clz.getName()+".load",id);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public T loadBySqlId(String sqlId,Map<String,Object> params) {
		SqlSession session = null;
		T t = null;
		try {
			session = MyBatisUtil.createSession();
			t = (T)session.selectOne(sqlId,params);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public T loadBySqlId(String sqlId,Object obj) {
		SqlSession session = null;
		T t = null;
		try {
			session = MyBatisUtil.createSession();
			t = (T)session.selectOne(sqlId,obj);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return t;
	}
	
	public List<T> list(Class<T> clz,Map<String,Object> params) {
		return this.list(clz.getName()+".list", params);
	}
	
	public List<T> list(String sqlId,Map<String,Object> params) {
		List<T> list = null;
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			list = session.selectList(sqlId,params);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return list;
	}
	
	public List<T> loadByType(Class<T> clz, Map<String, Object> params){
		List<T> list = null;
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			list = session.selectList(clz.getName()+".loadByType",params);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return list;
	}
	
}
