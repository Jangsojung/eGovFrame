<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<!-- 최신 컴파일 및 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
     integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- 옵션 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
     integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<!-- jQuery library 부트스트랩을 사용하려면 jQuery가 필요함-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<!-- 최신 컴파일 및 최소화된 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
     integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<style type="text/css">
	table {
		width:70%;
		margin-left:15%;
		margin-right:15%;
	}
	tr {
		height: 50px;
	}
	th, td {
		text-align: center;
	}
</style>
</head>
<body>
    <br/>
    <h1 class="text-center">게시판 목록</h1>
    <br/>
    <div class="container">
        <hr/>
        <table class="table table-hover table-striped text-center" style="border:1px solid;">
			<colgroup>
				<col width="10%" />
				<col width="50%" />
				<col width="20%" />
				<col width="20%" />
			</colgroup>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일자</th>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach items="${list}" var="result">
				<tr>
					<td>${result.BOARD_NO}</td>
					<td><a href="boardDetail.do?BOARD_NO=${result.BOARD_NO}">${result.BOARD_TITLE}</a></td>
					<td>${result.BOARD_WRITER}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${result.BOARD_WRITEDATE}"/></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
        <hr/>
<!--         <div>
			<ul class="pagination justify-content-center">
                <li><a href="#" style="margin-right:5px;" class="text-secondary">◀</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">1</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">2</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">3</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">4</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">5</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">▶</a></li>
            </ul>
        </div> -->
		<button id="btn_write" type="button" style="float:right" class="btn btn-default" onclick="location='boardWrite.do';">글쓰기</button>
    </div>
    <br>
</body>
</html>