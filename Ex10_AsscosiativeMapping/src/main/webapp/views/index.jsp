<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="minsert" method="post">
		ID : <input name="id">
		NAME : <input name="name">
		PASSWORD : <input type="password" name="pwd">
		<button>회원가입</button>
	</form>
	
	<form action="binsert" method="post">
		제목 : <input name="title">
		내용 : <input name="content">
		<button>게시글 작성</button>
	</form>
</body>
</html>