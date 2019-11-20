<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
    	<title>注册界面</title>
    	<link rel="stylesheet" href="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/css/animate.css">
    	<link href="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/css/index.css" rel="stylesheet">
    </head>
    <style type="text/css">
    	#panes {
	    	width:400px; 
	    	height:620px; 
	    	background-color:white; 
	    	text-align:left; 
	    	border-radius:5px; 
	    	box-shadow:-10px 20px 100px black; 
	    	position:absolute; 
	    	top:5%; 
	    	left:35%;
	    	margin-bottom:5%;
	    	左边缘:-200px;
	    	上边缘:-200px;
    	}
    	.ps{
    		margin-left:5px;
    		font-size:10px;
    		color:red
    	}
    </style>
<body>
<form:form modelAttribute ="register" method="post" action="${pageContext.request.contextPath}/user/save" >
<div id="panes">

        <div class="pane-header">
            <h2>注册页面</h2>
        </div>
        <div class="ps">	
        	<form:errors path="*" />
        	</div>
        <div class="pane-content">
               <label>用户名： </label>
               <form:input path="userName" placeholder="请输入用户名/手机号" style="width:250px;height:30px;"/>
               <br><br>
         

              <label>密&nbsp;&nbsp;&nbsp;码： </label>
               <form:input path="passWord" placeholder="请输入密码" type="password" style="width:250px;height:30px;"/>
           <br><br>
				<label>爱&nbsp;&nbsp;&nbsp;好：</label>
				<form:checkboxes items="${hobbys}" path="hobby" />
			<br><br>
				<label>朋&nbsp;&nbsp;&nbsp;友：</label>
					<form:checkbox path ="friends" value="张三" />张三
					<form:checkbox path="friends" value="李四" />李四
					<form:checkbox path="friends" value="王五" />王五
					<form:checkbox path="friends" value="赵六" />赵六
			<br><br>
				<label>职&nbsp;&nbsp;&nbsp;业： </label>
				<form:select path="carrer" >
					<option/>请选择职业
					<form:options items="${carrers}" />
				</form:select> 
		<br><br>
				<label>户&nbsp;&nbsp;&nbsp;籍： </label>
				<form:select path="houseRegister">
					<option/>请选择户籍
					<form:options items="${ houseRegisters }" />
				</form:select> 
			<br><br>
				<label>个人描述：</label>
				<form:textarea path="remark" rows="5" />
			<br><br>
            <div class="setting">
               <input type="checkbox">同意<a href="#">注册协议</a>
            </div>

            <input class="login-btn" type="submit" value="注&nbsp;册"/>

            <div class="reg">
                	已有账号?&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/user/login">马上登录</a>
            </div>
        </div>
    </div>
</form:form>
</body>
</html>