<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
<script type="text/javascript" src="http://libs.useso.com/js/respond.js/1.4.2/respond.min.js"></script>
<script type="text/javascript" src="http://cdn.bootcss.com/css3pie/2.0beta1/PIE_IE678.js"></script>
<![endif]-->
<link type="text/css" rel="stylesheet" href="css/H-ui.css"/>
<link type="text/css" rel="stylesheet" href="css/H-ui.admin.css"/>
<link type="text/css" rel="stylesheet" href="font/font-awesome.min.css"/>
<!--[if IE 7]>
<link href="http://www.bootcss.com/p/font-awesome/assets/css/font-awesome-ie7.min.css" rel="stylesheet" type="text/css" />
<![endif]-->
<title>添加用户</title>
</head>
<body>
<div class="pd-20" style="background-color: #9dc7e7;width: 500px;height:600px;line-height:35px;margin-left: 550px;margin-top: 100px;border:3px #ccc solid;font-family: 楷体;color:white">
  <div class="Huiform">
    <form action="/user/add" method="post" enctype="multipart/form-data">
        <script type="text/javascript">
            //选择图片，马上预览
            function xmTanUploadImg(obj) {
                var file = obj.files[0];
                var reader = new FileReader();
                reader.onload = function(e) {
                    var img = document.getElementById("img1");
                    img.src = e.target.result;
                }
                reader.readAsDataURL(file);
            }
        </script>

        <table class="table table-bg">
        <tbody>
      <%--  <tr>
            <th width="100" class="text-r"> </th>
            <td><input type="hidden" id="id" name="id" datatype="*2-16"></td>
        </tr>--%>
      <tr>
      <tr>
          <th></th>
          <td><input type="image" id="img1" style="width: 60px; height: 50px;"></td>
      </tr>
          <th class="text-r">头像：</th>
          <%--<input type="file" class="" name="img">--%>
          <td> <INPUT class=text type=file name=img  accept=".jpg,.png" onchange="xmTanUploadImg(this)"></td>


      </tr>
          <tr>
            <th width="100" class="text-r"> 用户名：</th>
            <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="user-name" name="name" datatype="*2-16" nullmsg="用户名不能为空"></td>
          </tr>
     <tr>
            <th width="100" class="text-r"> 密码：</th>
            <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="user-password" name="password" datatype="*2-16" nullmsg="密码不能为空"></td>
          </tr>
          <tr>
              <th width="100" class="text-r"> 身份证号码：</th>
              <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="number" name="number" datatype="*2-16" nullmsg="身份证号码不能为空"></td>
          </tr>
          <%--<tr>--%>
              <%--<th width="100" class="text-r">性别：</th>--%>
              <%--<td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="sex" name="sex" datatype="*2-16" nullmsg="性别不能为空"></td>--%>
          <%--</tr>--%>
          <%--<tr>--%>
              <%--<th width="100" class="text-r"> 年龄：</th>--%>
              <%--<td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="age" name="age" datatype="*2-16" nullmsg="年龄不能为空"></td>--%>
          <%--</tr>--%>
          <tr>
              <th width="100" class="text-r"> 联系电话：</th>
              <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="phone" name="phone" datatype="*2-16" nullmsg="联系电话不能为空"></td>
          </tr>


        <tr>
            <th width="100" class="text-r"> 用户等级：</th>
            <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="grade" name="grade" datatype="*2-16" nullmsg="用户等级不能为空"></td>
        </tr>

          <tr>
            <th></th>
            <td><button class="btn btn-success radius" type="submit"><i class="icon-ok"></i> 确定</button></td>
          </tr>
        </tbody>
      </table>
    </form>
  </div>
</div>
<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.1.3/jquery.min.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(".Huiform").Validform(); 
</script>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F080836300300be57b7f34f4b3e97d911' type='text/javascript'%3E%3C/script%3E"));
</script>
</body>
</html>