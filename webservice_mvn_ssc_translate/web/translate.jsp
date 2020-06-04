<%--
  Created by IntelliJ IDEA.
  User: lcdiao
  Date: 2020/6/4
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的翻译</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
 <script>
     $(function () {
         $("#translate").click(function () {
             //获取要翻译的信息
            var source = $("#source").val();
             //异步发送请求，执行翻译
             $.ajax({
                 url:"translate",
                 data:"source="+source,
                 success:function (data) {
                     //将返回的翻译结果赋值给target
                     $("#target").val(data);
                 }
             })
         })
     })
 </script>
</head>
<body>
    <div style="width: 300px;height:100px;color: blue;float: left">
        <textarea rows="10" cols="30" id="source">

        </textarea>
    </div>
    <div style="float: left;padding: 50px;">
        <input type="button" value="翻译" id="translate">
    </div>
    <div style="width: 300px;height:100px;color: blue;float: left">
        <textarea rows="10" cols="30" id="target">

        </textarea>
    </div>
</body>
</html>
