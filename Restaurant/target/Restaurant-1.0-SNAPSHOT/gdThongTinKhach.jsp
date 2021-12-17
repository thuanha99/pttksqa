<%-- 
    Document   : gdThongTinKhach
    Created on : Dec 16, 2021, 11:14:50 PM
    Author     : thuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            table, th, td {
                border: 0.5px solid black;
                border-spacing: 0px;
            }
        </style>
        <title>Ka ra co le</title>
    </head>
    <body>
        <div align="center">
            <h1>Thông Tin Khách</h1>
            <input type="search" id="timkiem" name="timkiem"
                   value="Nhập số điện thoại">

            <button class="sizebutton">Tìm Kiếm</button><br><br>
            <table style="width: 50%">
                <tr>
                    <th>Id</th>
                    <th>Tên</th>
                    <th>SĐT</th>
                    <th>Ngày Sinh</th>
                    <th>Điểm Tích Lũy</th>

                </tr>
                <c:forEach items ="${listKH}" var="x">
                    <tr>
                        <td align="right">${x.maKH}</td>
                        <td>${x.hoten}</td>
                        <td align="right">${x.sdt}</td>
                        <td align="right">${x.ngaySinh}</td>
                        <td align="right">${x.dtl}</td>
                    </tr> 
                </c:forEach>
            </table>
            <br>
            <button class="sizebutton">Nhận Khách</button>
            &nbsp

            <a id="btnthem" href="./gdThemKhachMoi.jsp"><button class="sizebutton">Thêm Mới</button></a>
        </div>
    </body>
</html>
