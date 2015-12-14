package com.ap.shm.dao;

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

}
