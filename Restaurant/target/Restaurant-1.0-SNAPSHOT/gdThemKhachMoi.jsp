<%-- 
    Document   : gdThemKhachMoi
    Created on : Dec 16, 2021, 11:54:57 PM
    Author     : thuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ka ra co le</title>
    </head>
    <body>
        <div align="center">
            <form action="addKH" method="post">
            <h1>Thêm Khách Mới</h1>

            <table style="width: none">
                <tr>
                    <td>Tên:</td>
                    <td><input type="text" id="ten" name="ten" value=""></td>
                </tr>
                <tr>
                    <td>Số điện thoại:</td>
                    <td><input type="text" id="sdt" name="sdt" value=""></td>
                </tr>
                <tr>
                    <td>Ngày Sinh:</td>
                    <td><input type="date" id="ns" name="ns"></td>
                </tr>
                <tr>
                    <td>Điểm tích lũy:</td>
                    <td><input type="number" id="dtl" name="dtl"></td>
                </tr>
            </table>
            <br>
            <button class="sizebutton">Quay Lại</button>
            &nbsp

            <button type="submit" class="sizebutton">Thêm</button>
            </form>
        </div>
        
    </body>
</html>
