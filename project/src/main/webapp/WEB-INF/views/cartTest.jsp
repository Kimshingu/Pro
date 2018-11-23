<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>
  <div class="bs-example">
    <h3>장바구니 테스트</h3>
    <!-- <form class="" action="" method="post">
      <table class="table table-hover">
        <tr>
          <th>Name</th>
          <td>
            <input type="text" name="ename" placeholder="직원명을 입력하세요">
          </td>
        </tr>
        <tr>
          <th>Job</th>
          <td>
            <input type="text" name="job">
          </td>
        </tr>
        <tr>
          <th>Salary</th>
          <td>
            <input type="number" name="salMin" min="0">
            ~
            <input type="number" name="salMax" min="0">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <button type="submit">Search</button>
          </td>
        </tr>
      </table>
    </form> -->
    <hr>
    <%-- <p>${conditions }</p> --%>
    <table class="table table-hover">
      <thead>
        <tr>
          <th>productId</th>
          <th>cartSize</th>
          <th>cartColor</th>
          <th>cartCount</th>
        </tr>
      </thead>
      <tbody>
      
      <c:forEach var="p" items="${products}">
        <tr>
          <td>${p.productId}</td>
          <td>${p.cartSize}</td>
          <td>${p.cartColor}</td>
          <td>${p.cartCount}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>
