<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="../static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="../static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="../lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="../static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="../static/h-ui.admin/css/style.css" />
  <LINK rel=stylesheet type=text/css href="../../css/style.css">
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>退单管理列表</title>
</head>
<body>

<nav class="breadcrumb"> <a href="/index.jsp">首页</a>  <span class="c-gray en">&gt;</span> 退单管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<form id="sform" name="sform" action="/tuihuo/search">
<div class="pd-20">
  <input type="hidden" id="pageNum" name="pageNum" value="${pageInfo.pageNum}">
  <div class="text-c">
    <input type="text" class="input-text" style="width:550px" placeholder="输入药品名称关键字" id="name" name="name" value="${name}"><button type="submit" class="btn btn-success" id="" name=""> 搜退单</button>

  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20">
   <%-- <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="icon-trash"></i> 批量删除</a>
    <a href="/medicine-add.jsp" onclick="user_add('550','','添加用户','/medicine-add.jsp')" class="btn btn-primary radius"><i class="icon-plus"></i> 添加用户</a></span>
    --%><span class="r">共有数据：<strong>${pageInfo.total}</strong> 条</span>
  </div>
  <table class="table table-border table-bordered table-hover table-bg table-sort">
    <thead>
      <tr class="text-c">
       <%-- <th width="25"><input type="checkbox" name="" value=""></th>--%>
        <th width="80">退单编号</th>
        <th width="80">订单编号</th>
        <th width="100">用户名</th>
        <th width="100">药品名称</th>
        <th width="100">退单原因</th>
        <th width="40">退单日期</th>
        <th width="40">药品数量</th>
        <th width="90">退还金额</th>

        <th width="100">操作</th>
      </tr>
    </thead>
    <tbody>

    <c:forEach var="tuihuo" items="${pageInfo.list}">
      <tr class="text-c">
        <%--<td><input type="checkbox" value="1" name=""></td>--%>
        <td>${tuihuo.returnId}</td>

        <td><u style="cursor:pointer" class="text-primary" onclick="user_show('10001','360','','张三','user-show.html')">${tuihuo.orderId}</u></td>
        <td>${tuihuo.userName}</td>
        <td>${tuihuo.MName}</td>
        <td>${tuihuo.returnReason}</td>
        <td><fmt:formatDate value="${tuihuo.returnDate}" pattern="yyyy-MM-dd hh:mm:ss"  /></td>

        <td>${tuihuo.orderQuantity}</td>
        <td>${tuihuo.money}</td>
          <%--<td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯编辑','','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>--%>
          <%--<td class="f-14 user-manage"><a style="text-decoration:none" onClick="user_stop(this,'10001')" href="javascript:;" title="停用"><i class="icon-hand-down"></i></a> <a title="编辑" href="javascript:;" onclick="user_edit('4','550','','编辑','user-add.html')" class="ml-5" style="text-decoration:none"><i class="icon-edit"></i></a> <a style="text-decoration:none" class="ml-5" onClick="user_password_edit('10001','370','228','修改密码','user-password-edit.html')" href="javascript:;" title="修改密码"><i class="icon-key"></i></a> <a title="删除" href="javascript:;" onclick="user_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="icon-trash"></i></a></td>--%>
        <td><%--<a style="text-decoration: none" class="ml-5" onClick=""
               href="update?id=${medicines.MId}" title="编辑">编辑

        </a>--%> <a style="text-decoration: none" class="ml-5"
                href="delete?id=${tuihuo.returnId}" title="删除">删除 </a></td>
      </tr>
    </c:forEach>
    </tbody>

  </table>
  <div id="pageNav" class="pageNav"></div>
</div>
</form>
<DIV class=pager>
  <UL>
    <LI class=current><A href="javascript:void(0)<%--?pageNum=${pageInfo.firstPage}--%>" onclick="dosubmit(pageNum=${pageInfo.firstPage})">首页</A></LI>
    <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.hasPreviousPage?pageInfo.prePage:pageInfo.pageNum})">上一页</A></LI>
    <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pageNum})">下一页</A></LI>
    <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.pages})">末页</A></LI></UL><SPAN
        class=total>${pageInfo.pageNum}/${pageInfo.pages}页</SPAN> </DIV></DIV>
<DIV id=footer class=wrap>
  <script>
    function dosubmit(pageNum) {
      var p=document.getElementById("pageNum");
      p.value=pageNum;
      var form=document.getElementById("sform");
      form.submit();
    }
  </script>
</DIV>
<!--_footer 作为公共模版分离出去-->
<%--<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>--%>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<%--<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
window.onload = (function(){
    // optional set
    pageNav.pre="&lt;上一页";
    pageNav.next="下一页&gt;";
    // p,当前页码,pn,总页面
    pageNav.fn = function(p,pn){$("#pageinfo").text("当前页:"+p+" 总页: "+pn);};
    //重写分页状态,跳到第三页,总页33页
    pageNav.go(1,13);
});
$('.table-sort').dataTable({
	"lengthMenu":false,//显示数量选择 
	"bFilter": false,//过滤功能
	"bPaginate": false,//翻页信息
	"bInfo": false,//数量信息
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
	]
});
</script>--%>
</body>
</html>
