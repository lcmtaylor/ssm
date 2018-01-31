<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>     
    <title>My JSP 'showDeptList.jsp' starting page</title>
  </head>
  
  <body>
    <center>
    <form id="myForm" action="" method="post"></form>
    	<table width="500px">
    		<tr>
    			<td>部门编号</td><td>部门名称</td><td>部门地址</td><td>操作</td>
    		</tr>
    		<c:forEach items="${depts }" var="dept">
    			<tr>
    				<td><input type="text" value="${dept.deptno }" readonly="readonly"></td>
    				<td><input type="text" value="${dept.dname }"></td>
    				<td><input type="text" value="${dept.loc }"></td>
    			</tr>
    		</c:forEach>
    		<tr>
    			<td colspan="5">
		    		<input type="submit" value="保存" />
    			</td>
    		</tr>
    	</table>
    </center>
  </body>
</html>
