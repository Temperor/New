<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>搜索人示例</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">



  </head>
  
  <body style="background-image: url(img/bg.jpg);background-position: center;background-repeat: no-repeat;background-attachment: fixed;">
    
    <div align="center">
    	<div style="font-size:36;font-weight:bold;color:#ffbb44">按条件搜索示例<br/><p/></div>
    
     <form action="<%=basePath%>/TestWebServlet">  
        <table>  
            <tr>  
                <td>姓名</td>  
                <td><input type="text" name="username"></td>  
            </tr>
             <tr>  
                <td>年龄</td>  
                <td><input type="text" name="age"></td>  
            </tr>  
            <tr>  
                <td>性别</td>  
                <td>
               <SELECT name="sex" > 
				<OPTION value="M">男</OPTION> 
				<OPTION value="F">女</OPTION> 
				</SELECT>  </td>
            </tr>  
            <tr>  
                <td><input type="submit" value="搜索"></td>  
                <td><input type="reset" value="取消"></td>  
            </tr>  
        </table>  
    </form>
    </div>
  </body>
</html>
