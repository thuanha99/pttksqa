
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ka ra co le</title>
    </head>
    <body>
        <div align="center">
        <h1>Chọn Khung Giờ</h1>

        <table style="width: none">
            <tr>
                <td>Giờ vào:</td>
                <td><input type="time" id="giovao" name="giovao"></td>
            </tr>
            <tr>
                <td>Giờ ra:</td>
                <td><input type="time" id="giora" name="giora"></td>
            </tr>
            <tr>
                <td>Ngày:</td>
                <td><input type="date" id="ngay" name="ngay"></td>
            </tr>
        </table>
        <br>
        <button class="sizebutton">Quay Lại</button>
        &nbsp
        <a id="btntieptuc" href="./gdChonPhong.jsp"><button class="sizebutton">Tiếp Tục</button></a><br><br>
        </div>
        </body>
</html>
