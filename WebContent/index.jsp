<%@ page contentType="text/html; charset=utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  -->
<html>
<head>
<META http-equiv="Content- Type" content="text/html; charset=GBK" /> 
<script type="text/javascript" src="js.js"></script>
<title>User RSegisteration</title>
</head>
<body>
  <form method="post" action="register" enctype="multipart/form-data">
  <table>
  <tr>
     <td>  学生ID:<input type="text" name="userid"></td>         
  </tr>
  <tr>   
      <td>学生姓名：<input type ="text" name="username"></td>
  </tr>
   <tr>   
      <td>上传文件<input type="file" name="fileupload" value="文件"></td>
  </tr> 
  
  
  
  </table>  
   <input type="submit" name="submit">
  </form>
   
</body>
</html>