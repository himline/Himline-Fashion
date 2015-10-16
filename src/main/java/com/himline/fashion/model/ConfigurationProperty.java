package com.himline.fashion.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


@Entity
@Table(name = "config_property")
public class ConfigurationProperty implements Serializable{
	
	@Id
	@Column(name = "pname")
	String name;
	
	@Id
	@Column(name = "pvalue")
	String value;
	
	@Column(name = "date_added")
	private Date dateAdded = new Date(new java.util.Date().getTime());
	
	@Column(name = "config_property_desc" )
	String description;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
