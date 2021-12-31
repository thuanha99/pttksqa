<%-- 
    Document   : gdChonNVPV
    Created on : Dec 16, 2021, 10:40:06 PM
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
            <h1>Chọn NVPV</h1>
            <form action="loadkh" method="get">
                <input type="hidden" id="giovao" name="giovao" value="${datPhong.giovao}"/>
                <input type="hidden" id="giora" name="giora" value="${datPhong.giora}"/>
                <input type="hidden" id="ngay" name="ngay" value="${datPhong.ngay}"/>  
                <input type="hidden" id="phongid" name="phongid" value="${datPhong.phongid}"/>

                <table style="width: 50%">
                    <tr>
                        <th>Nhan vien ca Id</th>
                        <th>Nhan vien id</th>
                        <th>Tên Nhân Viên</th>
                        <th>Số giờ trực còn lại trong ngày</th>
                        <th><a style="color: red;">(*)</a></th>
                    </tr>
                    <c:forEach items="${datPhong.nvList}" var="x">
                        <tr>
                            <td align="right">${x.nvcaid}</td>
                            <td align="right">${x.id}</td>
                            <td>${x.hoTen}</td>
                            <td align="right">${8- x.soGioDaDat}</td>
                            <td align="center">           
                                <input type="checkbox" name="nhanviencaid" value="${x.nvcaid}" >
                            </td>
                        </tr>
                    </c:forEach>

                </table>
                <%
                    String nhanviencaid[] = request.getParameterValues("nhanviencaid");
                    if (nhanviencaid != null) {
                %>
                
                <ul>
                    <%
                        for (int i = 0; i < nhanviencaid.length; i++) {
                    %>
                    <li><%=nhanviencaid[i]%></li>
                        <%
                            }
                        %>
                </ul>
                <%
                    }
                %>
                <br>
                <button type="submit" class="sizebutton">Tiếp tục</button>
            </form>
            <br>
            
        </div>
    </body>
</html>
