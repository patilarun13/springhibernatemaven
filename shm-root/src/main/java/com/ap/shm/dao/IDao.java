package com.ap.shm.dao;

import java.util.List;

public interface IDao<T> {

	public List<T> getRecords();
	public Long getRecordsCount();
	
}
