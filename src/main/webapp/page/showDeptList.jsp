<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>     
    <title>My JSP 'showDeptList.jsp' starting page</title>
	<script type="text/javascript">
	function delBatch(){
		var obj = document.getElementsByName("deptno");
		var deptnos = new Array();
		for (var i = 0; i < obj.length; i++) {
			if(obj[i].checked == true){
			alert(obj[i].value);
				deptnos.push(obj[i].value);
			}
		}
		
		location.href = "delBatch.action?deptno="+deptnos;
	}
	function updBatch(){
		location.href = "showDeptList.action?type=update";
	}	
	</script>
  </head>
  
  <body>
    <center>
    <form id="myForm" action="" method="post"></form>
    	<table width="500px">
    		<tr>
    			<td>&nbsp;</td><td>部门编号</td><td>部门名称</td><td>部门地址</td><td>操作</td>
    		</tr>
    		<c:forEach items="${depts }" var="dept">
    			<tr>
    				<td><input type="checkbox" name="deptno" value="${dept.deptno }" /></td>
    				<td>${dept.deptno }</td>
    				<td>${dept.dname }</td>
    				<td>${dept.loc }</td>
    				<td><a href="delete.action?deptno=${dept.deptno }">删除</a></td>
    			</tr>
    		</c:forEach>
    		<tr>
    			<td colspan="5">
		    		<input id="delbtn" type="button" value="批量删除" onclick="delBatch()" />
		    		<input id="updbtn" type="button" value="批量删除" onclick="updBatch()" />
    			</td>
    		</tr>
    	</table>
    </center>
  </body>
</html>
