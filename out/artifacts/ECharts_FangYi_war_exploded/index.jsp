<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/3
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>

<form action="queryServlet">
    请选择查询时间:<select name="date">
        <!-- 下拉列表 option标签 -->
        <option>---请选择---</option>
        <option value="2020-02-08">2020-02-08</option>
        <option value="2020-02-09" selected="selected">2020-02-09</option>
        <option value="2020-02-10">2020-02-10</option>
    </select>
    <input type="submit" value="查询">
</form>


</body>
</html>
