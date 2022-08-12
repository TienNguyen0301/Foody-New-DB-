<%-- 
    Document   : login
    Created on : Aug 8, 2022, 10:46:45 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var ="action" />
<h1 class="text-center text-danger title-login">DANG NHAP</h1>

<c:if test="${param.error != null}">
    <div class="alert alert-danger">
        Da co loi xay ra!!! Vui long quay lai sau!
    </div>
</c:if>

<c:if test="${param.accessDenied}">
    <div class="alert alert-danger">
        Ban khong co quyen truy cap!!
    </div>
</c:if>

<form method="post" action="${action}" class="form-login container">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" class="form-control"/>
    </div>
      <div class="form-group btn-login">
          <input class="btn btn-danger" type="submit" value="Dang nhap"/>
    </div>
</form>