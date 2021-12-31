<%-- 
    Document   : gdChonPhong
    Created on : Dec 16, 2021, 10:13:38 PM
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
        <title>Karaoke Restaurant</title>
    </head>
    <body>
        <div align="center">
            <h1>Chọn Phòng</h1>
            <form action="timnv" method="post">
                <input type="hidden" id="giovao" name="giovao" value="${data.giovao}"/>
                <input type="hidden" id="giora" name="giora" value="${data.giora}"/>
                <input type="hidden" id="ngay" name="ngay" value="${data.ngay}"/>                
                <table style="width: 50%">
                <tr>
                    <th align="left">ID</th>
                    <th align="left">Tên</th>
                    <th align="left">Cỡ</th>
                    <th align="left">Hạng</th>
                    <th align="left">Giá</th>
                    <th><a style="color: red;">(*)</a></th>
                </tr>
                <c:forEach items="${data.phongList}" var="x">
                    <tr>                     
                        <td align="right">${x.id}</td>
                        <td align="right">${x.ten}</td>
                        <td>${x.co}</td>
                        <td>${x.hang}</td>
                        <td align="right">${x.gia}</td>
                        <td align="center">
                            <input type="radio" name="phongid" value="${x.id}" required>                           
                        </td>
                    </tr>
                </c:forEach>
            </table>
                <br>
                <input type="submit" name="phongid" value="Chọn">  
            </form>            
            <br>
            <a href="gdChonKhungGio.jsp"><button class="sizebutton">Quay Lại</button></a>
        </div>

        
    </body>
</html>
