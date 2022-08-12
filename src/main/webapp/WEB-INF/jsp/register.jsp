<%-- 
    Document   : register
    Created on : Aug 8, 2022, 12:40:50 AM
    Author     : Admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:url value="/register" var ="action" />

<h1 class="text-center text-danger title-login">DANG KY</h1>

<c:if test="${errMsg != null}">
    <div class="alert alert-danger">
        ${errMsg}
    </div>
</c:if>

<form:form method="post" action="${action}" modelAttribute="user" class="form-login container">
    <div class="form-group">
        <label for="firstname">First Name</label>
        <form:input type="text" id="firstname" path="firstname" class="form-control" />
    </div>
    <div class="form-group">
        <label for="lastname">Last Name</label>
        <form:input type="text" id="lastname" path="lastname" class="form-control" />
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <form:input type="email" id="email" path="email" class="form-control" />
    </div>

    <div class="form-group">
        <label for="phone">Phone</label>
        <form:input type="number" id="phone" path="phone" class="form-control" onkeypress="javascript:return isNumber(event)" />
    </div>

    <div class="form-group">
        <label for="username">Username</label>
        <form:input type="text" id="username" path="username" class="form-control" />
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <form:input type="password" id="password" path="password" class="form-control" />
    </div>
    <div class="form-group">
        <label for="password">Confirm Password</label>
        <form:input type="password" id="confirm-password" path="confirmPassword" class="form-control" />
    </div>

    <div class="form-group">
        <label for="idUsertype">User Type</label>

        <form:select id="idUsertype" path="idUsertype" class="control-label col-lg-12">
            <c:forEach items="${usertype}" var="u">
                <option value="${u.id}">${u.name }</option>                                                  
            </c:forEach>
        </form:select>
    </div>

    <c:forEach items="${userstatus}" var="s">
        <option value="${s.id}">${s.name }</option>                                                  
    </c:forEach>

    <div class="form-group btn-login">
        <input class="btn btn-danger" type="submit" value="Dang ky"/>
    </div>
</form:form>


    <style>
        input[type=number]::-webkit-inner-spin-button,
        input[type=number]::-webkit-outer-spin-button {
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
            margin: 0;
        }

    </style>
    
        <script>
        //Custom number validating function
        function isNumber(evt) {
            var iKeyCode = (evt.which) ? evt.which : evt.keyCode
            if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
                return false;

            return true;
        } 
    </script>