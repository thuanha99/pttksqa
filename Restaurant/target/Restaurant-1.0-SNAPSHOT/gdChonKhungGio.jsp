
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Karaoke Restaurant</title>
    </head>
    <body>

        <div align="center">
            <h1>Chọn Khung Giờ</h1>
            <form  action="timphong" method="post">
                <table style="width: none">
                    <tr>
                        <td>Giờ vào:</td>
                        <td><input type="time" name="giovao" value="00:00:00" step ="1" required autofocus></td>
                        <td><a style="color: red;">(*)</a></td>
                    </tr>
                    <tr>
                        <td>Giờ ra:</td>
                        <td><input type="time" name="giora" value="00:00:00" step="1" required></td>
                        <td><a style="color: red;">(*)</a></td>
                    </tr>
                    <tr>
                        <td>Ngày:</td>
                        <td><input type="date" name="ngay" required></td>
                        <td><a style="color: red;">(*)</a></td>
                    </tr>
                </table>
                <br>
                <button type="submit" class="sizebutton">Tiếp Tục</button><br>
                &nbsp
            </form>
            <a href="gdChinhLT.jsp"><button class="sizebutton">Quay Lại</button></a>
        </div>
    </body>
</html>
