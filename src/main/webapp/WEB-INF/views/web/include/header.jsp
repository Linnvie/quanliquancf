 
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "/WEB-INF/views/tagLib/tagLib.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <!-- Basic -->
  <base href="${pageContext.servletContext.contextPath}/">
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />

  <title>violette</title>

  <!-- slider stylesheet -->
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.1.3/assets/owl.carousel.min.css" />
  
  <!-- gg icons -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

  <!-- font awesome icons -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css" rel="stylesheet" />

  <!-- bootstrap icons -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
  
  <!-- bootstrap core css -->
  <link href="./resources/user/css/bootstrap.css"" rel="stylesheet" type = "text/css">

  <!-- fonts style -->
  <link href="https://fonts.googleapis.com/css?family=Baloo+Chettan|Poppins:400,600,700&display=swap" rel="stylesheet">
  
  <!-- Custom styles for this template -->
  <link href="./resources/user/css/style.css" rel="stylesheet" type = "text/css">
  
  <!-- responsive style -->
  <link href="./resources/user/css/responsive.css" rel="stylesheet" type = "text/css">
</head>

<body>
    <!-- header section starts -->
  <header class="header_section" style="background-color: white;">
    <div class="container">
      <nav class="navbar navbar-expand-lg custom_nav-container ">
        <a class="navbar-brand" href="index.html">
          <span>
            violette
          </span>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <div class="d-flex mx-auto flex-column flex-lg-row align-items-center">
            <ul class="navbar-nav  ">
              <li class="nav-item active">
                <a class="nav-link" href="/webbanhoa/trang-chu">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/webbanhoa/about"> About </a>
              </li>
             

              
            </ul>
          </div>
          <div class="quote_btn-container">
            <a class="mr-3"><span class="material-symbols-outlined" style="font-size:22px;">
              search
              </span></a>
            
            <a class="mr-3" href="<c:url value ="/gio-hang"/>">
              <span class="material-symbols-outlined">
                shopping_basket
                </span>
            </a>
   			<a class="mr-3" href="/webbanhoa/tai-khoan" >
              <small>${user.email}</small>
            </a>

            <a class="mr-3" href="/webbanhoa/dang-xuat" >
              <small>Log out</small>
            </a>
            
          </div>
        </div>
      </nav>
    </div>
  </header>
  <section style="height:50px; background-color: #144B3C; line-height:50px;">
    <p class="text-center text-white">4 days left! Order Thanksgiving bouquet by 22/11 to guarantee delivery. <a href="flowers.html" class="text-white" style="text-decoration:underline;">Shop now</a></p>
  </section>
  <!-- end header section -->
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <%-- <%@ page language="java" contentType="text/html; charset=UTF-8" 
   pageEncoding="UTF-8"%> 
<!-- Navigation -->
  <!-- Site wrapper -->
 
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
      <!-- Left navbar links -->
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
        </li>
      </ul>

      <!-- Right navbar links -->
      <ul class="navbar-nav ml-auto">

        <li class="nav-item dropdown user-menu">
          <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
            <img src="<c:url value="/resources/admin/dist/img/user2-160x160.jpg"/>" class="user-image img-circle elevation-2" alt="User Image">
            <span class="d-none d-md-inline">${user.email}</span>
          </a>
          <div class="dropdown-menu " style="width: 160px;">
            <a href="#" class="dropdown-item" data-toggle="modal" data-target="#modal-lg">Tài khoản</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" tabindex="-1" href="webbanhoa/dang-xuat">Đăng xuất</a>
          </div>

        </li>

        <!-- <li class="nav-item">
          <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
            <i class="fas fa-th-large"></i>
          </a>
        </li> -->
      </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4 position-fixed">
      <!-- Brand Logo -->
      <a href="/nhan-vien/tong-quan" class="brand-link">
      
        <img src="<c:url value="/resources/admin/dist/img/AdminLTELogo.png"/>" alt="AdminLTE Logo" class="user-image img-circle elevation-2"
          style="opacity: .8; width:38px; height:38px;margin-left:5%">
        <span class="brand-text font-weight-light" style="margin-left:5%;">Violette</span>
      </a>

      <!-- Sidebar -->
      <div class="sidebar ">

        <!-- Sidebar Menu -->
        <nav class="mt-2">
          <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

            <li class="nav-item">
              <a href="/nhan-vien/tong-quan" class="nav-link active">
                <i class="nav-icon fas fa-th"></i>
                <p>
                  Tổng quan

                </p>
              </a>
            </li>
            <li class="nav-item">
              <a href="/nhan-vien/tao-don-hang" class="nav-link">
                <i class="nav-icon fas fa-file-invoice"></i>
                <p>
                  Đơn hàng

                </p>
              </a>
            </li>
            <li class="nav-item">
              <a href="/nhan-vien/tao-phieu-nhap" class="nav-link ">
                <i class="nav-icon fas fa-clipboard-list"></i>
                <p>
                  Phiếu nhập

                </p>
              </a>
            </li>
          </ul>
        </nav>
        <!-- /.sidebar-menu -->
      </div>
      <!-- /.sidebar -->
    </aside>
    
    
    --%>