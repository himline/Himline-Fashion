package com.himline.fashion.service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import com.himline.fashion.model.ConfigurationProperty;

@Service
public class ConfigurationService {
	@PersistenceContext
	private EntityManager entityManager;
	
	public ConfigurationProperty getConfigurationProperty(String name){
		entityManager.clear();
		Query query = entityManager.createQuery(
				"select cnf from ConfigProperty as cnf where cnf.name='"+name+"'",
				ConfigurationProperty.class);
		ConfigurationProperty configProperty = new ConfigurationProperty();
		try{
			configProperty = (ConfigurationProperty)query.getSingleResult();
		}catch (NoResultException e ){
			
		}
	    return configProperty;
	}
}
