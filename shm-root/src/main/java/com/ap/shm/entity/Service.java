package com.ap.shm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;;

@Entity
@Table(name = "ITServices", schema = "spms")
@NamedQueries({ @NamedQuery(name = "service.findAll", query = "select s from Service s where s.dataStateId=1"),
		@NamedQuery(name = "service.findAllCount", query = "select COUNT(s) from Service s where s.dataStateId=1"),
		@NamedQuery(name = "service.findById", query = "select s from Service s where s.id=:id"),
})
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "service_id", nullable = false)
	private Integer id;

	@Column(nullable = false)
	private String name;

	@Column(name = "data_state_id", nullable = false)
	private Integer dataStateId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDataStateId() {
		return dataStateId;
	}

	public void setDataStateId(Integer dataStateId) {
		this.dataStateId = dataStateId;
	}

	@Override
	public String toString() {
		return name;
	}

}
