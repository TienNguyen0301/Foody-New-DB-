<%-- 
    Document   : base
    Created on : Aug 7, 2022, 12:51:22 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <tiles:insertAttribute name="title" />
        </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
        
        <!--TEMPLATE-->  
        <link href="<c:url value="/css/style.css" />" rel="stylesheet" />
        <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet" />
        <link href="<c:url value="/css/food-detail.css" />" rel="stylesheet" />

        
        <script src="<c:url value="/js/main.js" />"></script>
        
        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="/WEB-INF/static/lib/wow/wow.min.js"></script>
        <script src="/WEB-INF/static/lib/easing/easing.min.js"></script>
        <script src="/WEB-INF/static/lib/waypoints/waypoints.min.js"></script>
        <script src="/WEB-INF/static/lib/owlcarousel/owl.carousel.min.js"></script>

            <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Lora:wght@600;700&display=swap" rel="stylesheet"> 

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    </head>
    <body>
     
            <!-- HEADER -->
            <tiles:insertAttribute name="header" />
            <!-- CONTENT -->
            <tiles:insertAttribute name="content" />
            <!-- FOOTER -->
            <tiles:insertAttribute name="footer" />
   
    </body>
</html>

