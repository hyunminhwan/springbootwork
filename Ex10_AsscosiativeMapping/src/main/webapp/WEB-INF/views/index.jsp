<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="minsert">
		ID : <input name="id"><br><br>
		NAME :  <input name="name"><br><br>
		PASSWORD :  <input type="password" name="password"><br><br>
		<button>회원가입</button>
	</form>
	<br>
	<hr>
	
	<form action="binsert">
		ID : <input name="id"><br><br>
		제목 :  <input name="title"><br><br> 
		내용 :  <input name="content"><br><br>
		<button>게시글 작성</button>
	</form>
	<br>
	<hr>
	<form action="mupdate">
		ID : <input name="id"><br><br>
		NAME :  <input name="name"><br><br>
		PASSWORD :  <input type="password" name="password"><br><br>
		<button>업데이트</button>
	</form>
</body>
</html>