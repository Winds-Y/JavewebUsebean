<%@ page import="henu.bean.Rectangle" %><%--
  Created by IntelliJ IDEA.
  User: Yangtse
  Date: 2017/11/27
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="bookInfo" class="henu.bean.BookBean" scope="request"/>
    <jsp:setProperty name="bookInfo" property="bookName"/>
    <jsp:setProperty name="bookInfo" property="bookPrice"/>
    <jsp:setProperty name="bookInfo" property="bookAuthor"/>
    <jsp:setProperty name="bookInfo" property="bookPublisher"/>
    <jsp:setProperty name="bookInfo" property="bookModifyNumber"/>
    书名：<jsp:getProperty name="bookInfo" property="bookName"/><br>
    价格：<jsp:getProperty name="bookInfo" property="bookPrice"/><br>
    作者：<jsp:getProperty name="bookInfo" property="bookAuthor"/><br>
    出版社：<jsp:getProperty name="bookInfo" property="bookPublisher"/><br>
    修改数量：<jsp:getProperty name="bookInfo" property="bookModifyNumber"/><br>
</body>
</html>
