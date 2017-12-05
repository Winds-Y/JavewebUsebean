<%--
  Created by IntelliJ IDEA.
  User: Yangtse
  Date: 2017/11/27
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>FirstJavaBean</title>
</head>
<body>
    <form action="book.servlet" method="post">
        书名：<input type="text" name="bookName" title="bookName"/><br>
        价格：<input name="bookPrice" type="text" title="bookPrice"/><br>
        作者：<input name="bookAuthor" type="text" title="bookAuthor"/><br>
        出版社：<input name="bookPublisher" type="text" title="bookPublisher"/><br>
        修改数量：<input name="bookModifyNumber" type="text" title="bookModifyNumber"/><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
