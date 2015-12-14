package com.ap.shm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ap.shm.entity.Service;

@Component
@Repository
@Transactional
public class ServiceDao extends DaoBase<Service> implements IServiceDao{

	@Override
	protected String getQueryPrefix() {
		
		return "service";
	}

	public List<Service> getRecords() {
		
		//SQLQuery q = sessionFactory.getCurrentSession().createSQLQuery("select * from spms.ITServices where service_id = 3484");
		Query q = sessionFactory.getCurrentSession().createQuery("Select s from Service s where s.id = 3484");
        List<Service> records =  q.list();
        
        return records;
	}
	

}
