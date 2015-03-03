package com.school.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;

import com.school.domain.SchoolInfo;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	@Override
	@Transactional
	public void insertRow(SchoolInfo schoolInfo) {
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			if(schoolInfo.getId() == 0){
			session.save(schoolInfo);
			tx.commit();
			}
		}catch (HibernateException e) {
			tx.rollback();
		 e.printStackTrace();
		 } finally {
		 session.close();
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SchoolInfo> getList() {
		session = sessionFactory.openSession();		
		List<SchoolInfo> schoolList = session.createQuery("from SchoolInfo").list();
		session.close();
		return schoolList;
	}

	@Override
	public SchoolInfo getRowById(int id) {
		session = sessionFactory.openSession();
		SchoolInfo schoolInfo = (SchoolInfo) session.load(SchoolInfo.class, id);
		return schoolInfo;
	}

	@Override
	public void updateRow(SchoolInfo schoolInfo) {
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();		
			session.update(schoolInfo);
			tx.commit();		
		}catch (HibernateException e) {
			tx.rollback();
		 e.printStackTrace();
		 } finally {
		 session.close();
		}	
	}

	@Override
	public void deleteRow(int id) {
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			SchoolInfo schoolInfo = (SchoolInfo) session.load(SchoolInfo.class, id);
			session.delete(schoolInfo);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
		 e.printStackTrace();
		 } finally {
		 session.close();
		}	

	}

}
