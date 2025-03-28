
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Logo</a>
    <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#menu">
        ☰
    </button>
    <div class="collapse navbar-collapse" id="menu">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Employee</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Customer</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Service</a></li>
            <li class="nav-item"><a class="nav-link" href="http://localhost:8080/Gradle___com_example___CaseStudy_1_0_SNAPSHOT_war__exploded_/Contract">Contract</a></li>
        </ul>
    </div>
    <a class="text-end navbar-brand" href="#">Login</a>
</nav>
<div class="d-flex">
<aside class="border-end p-3" style="width: 200px; height: 700px;">
    <div class="mb-2"><a href="#" class="text-decoration-none">Villa</a></div>
    <div><a href="#" class="text-decoration-none">House</a></div>
    <div><a href="#" class="text-decoration-none">Room</a></div>
</aside>
<main class="flex-grow-1 p-3">
    <h1>Ứng Dụng Quản Lý Khu Nghỉ Dưỡng Furama</h1>
    <h2>Giới Thiệu:</h2>
<p>Hệ thống Quản Lý Khu Nghỉ Dưỡng Furama giúp quản lý dịch vụ, nhân viên, khách hàng và hợp đồng thuê tại resort Furama Đà Nẵng. Ứng dụng này sử dụng công nghệ JSP, Servlet, JDBC và MySQL để xây dựng một hệ thống quản lý chuyên nghiệp và hiệu quả.</p>
</main>
</div>

<footer class="text-center p-3 border-top bg-light">
    <div class="container">
        <div class="row">
            <div class="col">
                <h5 class="fw-bold">About Us</h5>
                <p>Some info about the company.</p>
            </div>
            <div class="col">
                <h5 class="fw-bold">Contact</h5>
                <p>Email: vinhmh123@email.com</p>
            </div>
            <div class="col">
                <h5 class="fw-bold">Follow Us</h5>
                <p>Facebook | Twitter | Instagram</p>
            </div>
        </div>
    </div>
</footer>
</body>
</html>
