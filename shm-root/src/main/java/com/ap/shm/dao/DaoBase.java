package com.ap.shm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class DaoBase<T> implements IDao<T>{

	abstract protected String getQueryPrefix();
	
	@Autowired(required=true)
	protected SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<T> getRecords() {
		String findAllName = this.getQueryPrefix() + ".findAll";
        Query q = sessionFactory.getCurrentSession().getNamedQuery(findAllName);
        return q.list();
	}

	public Long getRecordsCount() {

		String countQueryName = this.getQueryPrefix() + ".findAllCount";
    	return (Long) sessionFactory.getCurrentSession().getNamedQuery(countQueryName).uniqueResult();
    	
	}

}
