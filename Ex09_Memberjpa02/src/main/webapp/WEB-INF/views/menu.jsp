<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Member JPA #01</h1>
		
		<a href="/insert">데이터추가</a><br><br>
		<a href="/selectAll">전체 조회</a><br><br>
		<a href="/selectById?id=1">개별조회 -By Id</a><br><br>
		
	<hr>
	
	<a href="selectByName?name=홍길동">개별조회 - By Name</a><br><br>		
	<a href="selectByEmail?email=hong@tjoeun.kr">개별조회 - By Email</a><br><br>
	<a href="selectByNameLike?name=홍"> 리스트 조회-Name Like</a><br><br>
	<a href="selectByNameLikeDesc?name=홍"> 리스트 조회-Name Like  Desc</a><br><br>
	<a href="selectByNameLikeSort?name=홍"> 리스트 조회-Name Like Sort</a><br><br>
</body>
</html>