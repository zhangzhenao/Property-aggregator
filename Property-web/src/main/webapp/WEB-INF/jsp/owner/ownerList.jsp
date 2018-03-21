<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
	<%@ include file="/common.jsp" %>
	<title>业主信息</title>
</head>
<body>
		
	<table id = "ownerTable" title = "permission list" 
        data-options="url:'owner/list',fitColumns:true,singleSelect:false,striped:true,rownumbers:true,iconCls:'icon-search' ">
	    <thead>   
	        <tr>
	        	<th data-options="field:'aaa',checkbox:true"></th>
	            <th data-options="field:'id',width:100">id</th>
	            <th data-options="field:'text',width:100">角色名</th>
	            <th data-options="field:'available',width:100">是否可用</th>
	            <th data-options="field:'url',width:100">url</th>
	            
	        </tr>
	    </thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="role_add()">添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="role_edit()">修改</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="role_remove()">删除</a>
	</div>
	
</body>
</html>