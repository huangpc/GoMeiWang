package com.gomei.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.gomei.model.Star;
import com.gomei.util.MyBatisUtil;

@SuppressWarnings("rawtypes")
public class StarDao extends BaseDao implements IStarDao {

	public void add(Star star) {
		// TODO Auto-generated method stub
		//super.add(star);
		
		SqlSession session = null;
		try {
			session = MyBatisUtil.createSession();
			session.insert(Star.class.getName()+".add",star);
			session.commit();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
			session.rollback();
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

	@SuppressWarnings("unchecked")
	public Star load(int id) {
		// TODO Auto-generated method stub
		System.out.println("star load");
		return (Star) super.load(Star.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Star> list() {
		// TODO Auto-generated method stub
		return super.list(Star.class, null);
	}
	
	@SuppressWarnings("unchecked")
	public List<Star> loadByType(int type){
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("type", type);
		return super.loadByType(Star.class, params);
	}


}
