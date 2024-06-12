<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
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
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
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
    <h1 class="text-center">게시글 작성</h1>
    <br/>
    <div class="container">
    	<hr/>
		<form id="writeForm" action="boardInsert.do" method="post" encType="multiplart/form-data">
			<table>
				<tbody>
					<tr>
						<th>제목</th>
						<td><input type="text" placeholder="제목을 입력해주세요." name="BOARD_TITLE" id="BOARD_TITLE"/></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea placeholder="내용을 입력해주세요." name="BOARD_CONTENTS" id="BOARD_CONTENTS" style="height: 200px;"/></textarea></td>
					</tr>
				</tbody>
			</table>
      		<hr/>
			<div id="btn_div" style="float:right;">
				<button id="btn_insert" class="btn btn-success" type="button">등록하기</button>
				<button id="btn_back" type="button" class="btn btn-default" onclick="location='boardList.do';">목록으로 돌아가기</button>
			</div>
		</form>
	</div>
</body>

<script type="text/javascript">
	$(document).on('click', '#btn_insert', function(e) {
		$("#writeForm").submit();
		alert("성공적으로 작성되었습니다.");
	});
</script>
</html>