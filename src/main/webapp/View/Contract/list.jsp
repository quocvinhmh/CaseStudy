<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách hợp đồng</title>
</head>
<body>
<h2>Danh sách hợp đồng</h2>
<form action="${pageContext.request.contextPath}/Contract" method="get">
    <input type="hidden" name="action" value="search">
    <!-- Nếu bạn muốn tìm theo contractID, hãy đặt name là contractID -->
    <input type="search" name="contractID" placeholder="Tìm kiếm theo ID">
    <button type="submit">Tìm kiếm</button>
</form>

<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Deposit</th>
        <th>Total Money</th>
        <th>Customer ID</th>
        <th>Task</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="contract" items="${contractList}">
        <tr>
            <td>${contract.id}</td>
            <td>${contract.startDate}</td>
            <td>${contract.endDate}</td>
            <td>${contract.deposit}</td>
            <td>${contract.totalMoney}</td>
            <td>${contract.customerId}</td>
            <td><button onclick="del(`${contract.id}`)">Delete</button><button>Edit</button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
</script>
</body>
</html>
