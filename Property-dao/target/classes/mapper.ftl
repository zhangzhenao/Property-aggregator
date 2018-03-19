<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="Property-dao Maven java.dao.${pojoName}Dao">

	<select id="getAll" resultType="${pojoName}">
		select * from ${table_name}
	</select>
	
	<select id="getById" resultType="${pojoName}">
		select * from ${table_name} where id = ${r'#'}{id}
	</select>
	<sql id="sqlCondition">
		<if test="condition != null">
			<where>
				
			</where>
		</if>
	</sql>
	
	<resultMap type="${pojoName}" id="${pojoName}Map" autoMapping="true">
		<id column="id" property="id"/>
	</resultMap>
	
	<select id="getByCondition" resultMap="${pojoName}Map" >
		select * from ${table_name} 
		<include refid="sqlCondition"></include>
		limit ${r'#'}{start},${r'#'}{pageSize}
	</select>
	
	<select id="getCountByCondition" resultType="int">
		select count(1) from ${table_name} 
		<include refid="sqlCondition"></include>
	</select>
	
	
	<insert id="add" parameterType="${pojoName}" useGeneratedKeys="true" keyColumn="id" keyProperty="id">
		insert into ${table_name}(<#list columnNames as c>${c}<#if c_has_next>,</#if></#list>) 
			values(<#list columnNames as c>${r'#'}{${c}}<#if c_has_next>,</#if></#list>)
	</insert>
	
	<update id="update" parameterType="${pojoName}">
		update ${table_name} set 
			<#list columnNames as c>
				${c} = ${r'#'}{${c}}<#if c_has_next>,</#if>
			</#list>
			where id = ${r'#'}{id}
	</update>
	
	<delete id="batchDelete" parameterType="java.lang.reflect.Array">
		delete from ${table_name} where id in
		<foreach collection="ids" open="(" close=")" separator="," item="item">
			${r'#'}{item}
		</foreach>
	</delete>
	
	
	
	
</mapper>