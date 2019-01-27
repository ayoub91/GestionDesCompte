package com.org.cpt.generic;

import java.util.List;

public interface ICrud<T> {
	public List<T> getAll();
	public void remove(T t);
	public T save(T t);
	public T update(T t);
	public T getById(Long id);
}
