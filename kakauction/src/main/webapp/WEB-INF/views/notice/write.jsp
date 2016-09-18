<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../design/inc/top.jsp"%>
<script src="<c:url value='/ckeditor/ckeditor.js'/>" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/mainstyle.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/css/clear.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/css/formLayout.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/css/mystyle.css'/>" />
<script type="text/javascript">

	$(document).ready(function(){
		CKEDITOR.replace('noticeContent');	
		
		$("#frmWrite").submit(function(event){
			if($("#title").val()==""){
				alert("제목을 입력하세요");
				$("#title").focus();
				return false;
			}else if($("#noticeContent").val()==""){
				alert("내용을 입력하세요");
				$("#noticeContent").focus();
				return false;
			}
		});
		
		$("#listPage").click(function(){
			location.href="${pageContext.request.contextPath}/notice/list.do";
		});
	});
</script>

<title>카카옥션 공지 쓰기</title>
	<div class="divForm">
	<form name="noticeWrite" id="noticeWrite" method="post"
		enctype="multipart/form-data" 
	  action="<c:url value='/notice/write.do'/>" >
	 <fieldset>
		<legend>글쓰기</legend>
	        <div class="firstDiv">
	            <label for="title">제목</label>
	            <input type="text" id="noticeTitle" name="noticeTitle"  />
	        </div>
	        <div>
	            <label for="name">작성자</label>
	            <input type="text" id="memberId" name="memberId" value="${sessionScope.memberId }" readonly/>
	        </div>
	        <div>
	            <label for="upfile">첨부파일</label>
	            <input type="file" id="upfile" name="upfile" />
	            (최대 100M)
	        </div>
	        <div>  
	        	<label for="noticeContent">내용</label>
	        </div>
	        <div>	        
	 			<textarea id="noticeContent" name="noticeContent" 
	 			rows="12" cols="40"></textarea>
	 			
	<!--  			<textarea id="content" name="content" 
	 			rows="12" cols="40" class="ckeditor"></textarea> -->
	        </div>
	        
	        <div class="center">
	            <input type = "submit" value="등록"/>
	            <input type = "Button" name="listPage" id="listPage" value="글목록" 
	      			onclick
	="location.href='<c:url value="/notice/list.do"/>';" />         
	        </div>
	    </fieldset>
	</form>
	</div>   
<%@ include file="../design/inc/bottom.jsp"%>