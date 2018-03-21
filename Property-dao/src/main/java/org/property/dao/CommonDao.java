package org.property.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CommonDao<T,PK extends Serializable> {
	public void add(T entity);
	
	public void deleteById(PK id);
	
	public void batchDelete(@Param("ids")PK[] ids);
	
	public void update(T entity);

	public T getById(PK id);
	
	public List<T> getAll();
	
	/**
	 * 按条件分页检索数据
	 * @param start 起始位置
	 * @param pageSize 每页显示的数据条数
	 * @param condtion 查询条件
	 * @return
	 */
	public List<T> getByCondition(@Param("start")int start,@Param("pageSize") int pageSize,@Param("condition") T condition,@Param("columnName") String columnName,@Param("orderBy") String orderBy);
	
	/**
	 * 按条件查询总数
	 * @param condition
	 * @return
	 */
	public Integer getCountByCondition(@Param("condition") T condition);
}









