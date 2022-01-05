<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/30
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript">
        /*页面加载函数*/
        $(function () {
            $("#select").click(function () {
                $.ajax({
                    url:"select/user.do",
                    type:"get",
                    success:function (data) {
                            $("#id").val(data.id);
                            $("#value").val(data.email)
                    }
                })
            })
        })
    </script>
</head>
<body>
姓名:<input type="text" id="id"><br>
生日:<input type="text" id="value"><br>
<input type="button" value="获取" id="select">
</body>

</html>
