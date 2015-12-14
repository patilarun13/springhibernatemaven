package com.ap.shm.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ap.shm.dao.IServiceDao;
import com.ap.shm.entity.Service;

public class ServiceDaoUtil {
	
	@Autowired
	private IServiceDao svcDao;
	
	public void getServiceById(int svcId) {
		
		List<Service> svcList = this.svcDao.getRecordById(svcId);
		System.out.println(svcList);
		
	}

}