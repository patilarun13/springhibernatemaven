package com.ap.shm.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ap.shm.dao.IServiceDao;

/**
 * Hello world!
 *
 */
public class App {
	
	@Autowired
	public static IServiceDao serviceDao;
	
    public static void main( String[] args ) {
       
    	ApplicationContext context = 
    	    	  new ClassPathXmlApplicationContext(new String[] {"config/BeanLocations.xml"});
    	
    	List<Service> svcs = serviceDao.getRecords();
    	int count = 0;
    	for(Service svc: svcs) {
    		if(count != 5) {
    			System.out.println(svc);
    		}else{
    			break;
    		}
    	}
    	
    }
}
