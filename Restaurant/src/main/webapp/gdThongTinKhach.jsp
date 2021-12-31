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
        <title>Karaoke Restaurant</title>
    </head>
    <body>
        <div align="center">
            <h1>Thông Tin Khách</h1>
            <form action="searchkh" method="post">
                <input type="hidden" id="giovao" name="giovao" value="${datPhong.giovao}"/>
                <input type="hidden" id="giora" name="giora" value="${datPhong.giora}"/>
                <input type="hidden" id="ngay" name="ngay" value="${datPhong.ngay}"/>  
                <input type="hidden" id="phongid" name="phongid" value="${datPhong.phongid}"/>                
                <c:forEach items="${datPhong.nhanviencaids}" var="nvcaid">                    
                    <input type="hidden" name="nhanviencaid" value="${nvcaid}" />
                </c:forEach>
                    <input type="text" name="timkiem" required autofocus>
                <button type="submit" class="sizebutton">Tìm Kiếm</button><br><br>                
            </form>
            <form action="luuphong" method="post">
                <input type="hidden" id="giovao" name="giovao" value="${datPhong.giovao}"/>
                <input type="hidden" id="giora" name="giora" value="${datPhong.giora}"/>
                <input type="hidden" id="ngay" name="ngay" value="${datPhong.ngay}"/>  
                <input type="hidden" id="phongid" name="phongid" value="${datPhong.phongid}"/>                
                <c:forEach items="${datPhong.nhanviencaids}" var="nvcaid">                    
                    <input type="hidden" name="nhanviencaid" value="${nvcaid}" />
                </c:forEach>

                <table style="width: 50%">
                    <tr>
                        <th>Id</th>
                        <th>Tên</th>
                        <th>SĐT</th>
                        <th>Ngày Sinh</th>
                        <th>Điểm Tích Lũy</th>
                        <th><a style="color: red;">(*)</a></th>
                    </tr>

                    <c:forEach items="${datPhong.khList}" var="x">
                        <tr>
                            <td align="right">${x.maKH}</td>
                            <td>${x.hoten}</td>
                            <td align="right">${x.sdt}</td>
                            <td align="right">${x.ngaySinh}</td>
                            <td align="right">${x.dtl}</td>
                            <td align="center">                                                         
                                <input type="radio" name="khachhangid" value="${x.maKH}" required>Chon
                            </td>
                        </tr> 
                    </c:forEach>
                </table>

                <br>
                <button type="submit" class="sizebutton">Nhận Khách</button><br>
                &nbsp
            </form>
            <a id="btnthem" href="./gdThemKhachMoi.jsp"><button class="sizebutton">Thêm Mới</button></a>
        </div>

    </body>
</html>
