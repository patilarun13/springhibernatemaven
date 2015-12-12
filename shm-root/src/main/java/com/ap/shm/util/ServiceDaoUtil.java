package com.ap.shm.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ap.shm.dao.IServiceDao;
import com.ap.shm.entity.Service;

public class ServiceDaoUtil {
	
	@Autowired
	private IServiceDao svcDao;
	
	public void somFun() {
		
		List<Service> svcList = this.svcDao.getRecords();
		System.out.println(svcList);
		
	}

}
