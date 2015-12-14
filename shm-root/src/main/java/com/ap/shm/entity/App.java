package com.ap.shm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ap.shm.dao.IServiceDao;
import com.ap.shm.util.ServiceDaoUtil;

/**
 * Hello App
 *
 */
public class App {
	
	@Autowired
	public static IServiceDao serviceDao;
	
    public static void main( String[] args ) {
       
    	
		@SuppressWarnings("resource")
		ApplicationContext context = 
    	    	  new ClassPathXmlApplicationContext(new String[] {"config/BeanLocations.xml"});
    	
    	ServiceDaoUtil svcDaoUtil = (ServiceDaoUtil)context.getBean("svcDaoUtil");
    	svcDaoUtil.somFun();
    	
    }
}
