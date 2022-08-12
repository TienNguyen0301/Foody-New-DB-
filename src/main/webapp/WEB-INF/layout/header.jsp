<%-- 
    Document   : header
    Created on : Aug 7, 2022, 12:51:27 PM
    Author     : Admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


 <div class="container-fluid fixed-top px-0 wow fadeIn background-header" data-wow-delay="0.1s">
        <nav class="navbar navbar-expand-lg navbar-light py-lg-0 px-lg-5 wow fadeIn" data-wow-delay="0.1s">
            <a href="index.html" class="navbar-brand ms-4 ms-lg-0">
                <h1 class="fw-bold text-primary m-0">F<span class="text-secondary">oo</span>dy</h1>
            </a>
            <button type="button" class="navbar-toggler me-4" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ms-auto p-4 p-lg-0">
                    <a href="<c:url value="/" />" class="nav-item nav-link">Home</a>
                    <a href="<c:url value="/register" />" class="nav-item nav-link">Đăng ký</a>

                    <c:if test="${pageContext.request.userPrincipal.name == null}">
                        <a href="<c:url value="/login" />" class="nav-item nav-link">Đăng nhập</a>
                    </c:if>
                    
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <a href="<c:url value="/" />" class="nav-item nav-link">${pageContext.request.userPrincipal.name}</a>
                        <a href="<c:url value="/logout" />" class="nav-item nav-link">Đăng xuất</a>
                    </c:if>
                    <a href="<c:url value="/cart" />" class="nav-item nav-link">
                        <i class="fas fa-cart-plus"></i>
                        <div class="badge badge-danger" id="cartCounter">0</div>
                    </a>

                        
                </div>
                <div class="d-none d-lg-flex ms-2">
                    <a class="btn-sm-square bg-white rounded-circle ms-3" href="">
                        <small class="fa fa-search text-body"></small>
                    </a>
                    <a class="btn-sm-square bg-white rounded-circle ms-3" href="">
                        <small class="fa fa-user text-body"></small>
                    </a>
                    <a class="btn-sm-square bg-white rounded-circle ms-3" href="">
                        <small class="fa fa-shopping-bag text-body"></small>
                    </a>
                </div>
            </div>
        </nav>
    </div>