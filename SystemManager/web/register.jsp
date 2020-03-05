<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/17
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>

    <script>
        /**
         * 1、给超链接绑定单击事件
         * 2、重新设置图片的src属性
         * */

        window.onload = function () {
            var img = document.getElementById("checkCode");
            img.onclick = function (ev) {
                //加时间戳，可以实现永远不重复
                var date = new Date().getTime();


                img.src = "/checkCodeServlet?"+date;
            }
        }

    </script>


</head>
<body>
    <img id="checkCode" src="/checkCodeServlet">
    <a id="change" href="">看不清？换一张</a>
</body>
</html>
