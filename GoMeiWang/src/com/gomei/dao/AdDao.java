package com.gomei.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gomei.model.Ad;

@SuppressWarnings("rawtypes")
public class AdDao extends BaseDao implements IAdDao {

	@SuppressWarnings("unchecked")
	public void add(Ad ad) {
		// TODO Auto-generated method stub
		super.add(ad);
	}

	@SuppressWarnings("unchecked")
	public Ad load(int id) {
		// TODO Auto-generated method stub
		return (Ad) super.load(Ad.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Ad> list() {
		// TODO Auto-generated method stub
		return super.list(Ad.class, null);
	}
	
	@SuppressWarnings("unchecked")
	public List<Ad> loadByType(int type){
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("type", type);
		return super.loadByType(Ad.class, params);
	}

	
	
	/*public Ad load(int id) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		Ad ad;
		try{
			session = MyBatisUtil.createSession();
			ad = session.selectOne(Ad.class.getName() + ".load", id);
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return ad;
	}

	public List<Ad> loadList() {
		// TODO Auto-generated method stub
		
		SqlSession session = null;
		List<Ad> ads = new ArrayList<Ad>();
		try {
			session = MyBatisUtil.createSession();
			ads = session.selectList(Ad.class.getName()+".loadList");
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return ads;
	}

	public void add(Ad ad) {
		// TODO Auto-generated method stub
		
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			session.insert(Ad.class.getName() + ".add", ad);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}*/
	

}
