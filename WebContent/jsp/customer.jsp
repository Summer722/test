<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world!</h1>
<form class="form-inline" action="${pageContext.request.contextPath }/customer/list.action" method="get">
	<div class="form-group">
		<label for="customerName">客户名称</label> 
		<input type="text" class="form-control" id="customerName" value="${custName }" name="custName">
	</div>
	<div class="form-group">
		<label for="customerFrom">客户来源</label> 
		<select	class="form-control" id="customerFrom" placeholder="客户来源" name="custSource">
			<option value="">--请选择--</option>
			<c:forEach items="${fromType}" var="item">
				<option value="${item.dict_id}"<c:if test="${item.dict_id == custSource}"> selected</c:if>>${item.dict_item_name }</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="custIndustry">所属行业</label> 
		<select	class="form-control" id="custIndustry"  name="custIndustry">
			<option value="">--请选择--</option>
			<c:forEach items="${industryType}" var="item">
				<option value="${item.dict_id}"<c:if test="${item.dict_id == custIndustry}"> selected</c:if>>${item.dict_item_name }</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="custLevel">客户级别</label>
		<select	class="form-control" id="custLevel" name="custLevel">
			<option value="">--请选择--</option>
			<c:forEach items="${levelType}" var="item">
				<option value="${item.dict_id}"<c:if test="${item.dict_id == custLevel}"> selected</c:if>>${item.dict_item_name }</option>
			</c:forEach>
		</select>
	</div>
	<button type="submit" class="btn btn-primary">查询</button>
</form>


</body>
</html>