<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../design/inc/top.jsp" %>
	<h1>Excel Download</h1>
	<form name="frm1" method="post" action="<c:url value='/excel/downloadExcel.do'/>">
		<input type="submit" value="고객리스트 엑셀파일 출력">
	</form>
	<%-- <a href="<c:url value='/excel/downloadExcel.do'/>">고객리스트 엑셀파일 출력</a> --%>
<%@ include file="../design/inc/bottom.jsp" %>