package com.org.cpt.generic.impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.org.cpt.generic.ICrud;
import javax.persistence.Query;

public class CrudImpl<T> implements ICrud<T>{
	
	@PersistenceContext
	EntityManager em;
	
	private Class<T> type;
	
	
	public Class<T> getType() {
		return type;
	}

	@SuppressWarnings("unchecked")
	public CrudImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt =  (ParameterizedType)t;
		type =(Class<T>) pt.getActualTypeArguments()[0];
	}

	@Override
	public List<T> getAll() {
		Query query = em.createQuery("select t from " +type.getSimpleName()+ " t");
		return query.getResultList();
		
	}

	@Override
	public void remove(T t) {
		
		
	}

	@Override
	public T save(T t) {
		em.persist(t);
		 return t;
	}

	@Override
	public T update(T t) {
		return em.merge(t);
	}

	@Override
	public T getById(Long id) {
		return em.find(type,id);
	}

}
