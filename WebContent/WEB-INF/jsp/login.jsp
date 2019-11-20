<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
    	<title>登录界面</title>
    	<link rel="stylesheet" href="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/css/animate.css">
    	<link href="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/css/index.css" rel="stylesheet">
    </head>
      <style type="text/css">
    	#panes {
	    	width:400px; 
	    	height:450px; 
	    	background-color:white; 
	    	text-align:left; 
	    	border-radius:5px; 
	    	box-shadow:-10px 20px 100px black; 
	    	position:absolute; 
	    	top:20%; 
	    	left:35%;
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
<form:form modelAttribute ="login" method="post" action="${pageContext.request.contextPath}/user/valid" >
<div id="panes">

        <div class="pane-header">
            <h2>登陆页面</h2>
        </div>
         <div class="ps">	
        	<form:errors path="*" />
        	</div>
        <div class="pane-content">
           <div class="userpwd">
               <img src="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/images/icon_people.png">
               <form:input path="userName" placeholder="请输入用户名/手机号" />
           </div>

           <div class="userpwd">
               <img src="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/images/icon_password.png">
               <form:input path="passWord" placeholder="请输入密码" type="password"/>
           </div>

            <div class="setting">
               <a href="#"><input type="checkbox"> 下次自动登录</a>
               <a href="#" class="pull-right">忘记密码?</a>
            </div>
            
            
            <input class="login-btn" type="submit" value="登&nbsp;录"/>

            <div class="reg">
                	还没账号?&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/user/register">立即注册</a>
            </div>
        </div>

        <div class="pane-footer">
             <span>社交账号登录:  </span>
             <img src="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/images/sina.png">
             <img src="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/images/weixin.png">
             <img src="https://www.17sucai.com/preview/1636013/2019-07-26/animate.css%E7%89%B9%E6%95%88%E5%BA%94%E7%94%A8/images/qq.png">
        </div>
    </div>
</form:form>
</body>
</html>