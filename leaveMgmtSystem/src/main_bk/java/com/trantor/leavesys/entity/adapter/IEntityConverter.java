package com.trantor.leavesys.entity.adapter;

/**
 * @author rajni.ubhi
 *
 */
public interface IEntityConverter<M,E> {
	
	public E convertModelToEntity(M m);
	
	public M convertEntityToModel(E e);
	
	public E convertModelToEntityUsingId(M m);
}
