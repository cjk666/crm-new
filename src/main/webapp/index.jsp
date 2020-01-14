<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
		<script type="text/javascript" src="layui/layui.all.js"></script>
	</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
	  <div class="layui-header">
	    <div class="layui-logo">易唐经分管理系统</div>
	    <!-- 头部区域（可配合layui已有的水平导航） -->
	    <ul class="layui-nav layui-layout-left">
	      <li class="layui-nav-item"><a href="">控制台</a></li>
	      <li class="layui-nav-item"><a href="">商品管理</a></li>
	      <li class="layui-nav-item"><a href="">用户</a></li>
	      <li class="layui-nav-item">
	        <a href="javascript:;">其它系统</a>
	        <dl class="layui-nav-child">
	          <dd><a href="">邮件管理</a></dd>
	          <dd><a href="">消息管理</a></dd>
	          <dd><a href="">授权管理</a></dd>
	        </dl>
	      </li>
	    </ul>
	    <ul class="layui-nav layui-layout-right">
	      <li class="layui-nav-item">
	        <a href="javascript:;">
	          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
	          	贤心
	        </a>
	        <dl class="layui-nav-child">
	          <dd><a href="">基本资料</a></dd>
	          <dd><a href="">安全设置</a></dd>
	        </dl>
	      </li>
	      <li class="layui-nav-item"><a href="">退出</a></li>
	    </ul>
	  </div>
	  
	  <div class="layui-side layui-bg-black">
	    <div class="layui-side-scroll">
	      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
	      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
	        <li class="layui-nav-item layui-nav-itemed">
	          <a class="" href="javascript:;">合作机构</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript: tab('222') ;">机构管理</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">学生管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript:;">试听学生</a></dd>
	            <dd><a href="javascript:;">正式签约学生</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">班级管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript:;">试听班级</a></dd>
	            <dd><a href="javascript:;">正式班级</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">住宿管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript:;">房间管理</a></dd>
	            <dd><a href="javascript:;">房间费用</a></dd>
	            <dd><a href="javascript:;">学生住宿费用</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">教师管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript:;">老师资料</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">数据统计</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript:;">链接</a></dd>
	            <dd><a href="javascript:;">链接</a></dd>
	            <dd><a href="javascript:;">链接</a></dd>
	            <dd><a href="javascript:;">链接</a></dd>
	          </dl>
	        </li>
	      </ul>
	    </div>
	  </div>
	
	<!-- 主体内容 -->
	<div class="layui-body">
		<div class="layui-tab" lay-filter="demo" lay-allowclose="true">
			<ul class="layui-tab-title">
				<li class="layui-this">主界面</li>
			</ul>
			<!-- 
           <ul class="rightmenu" style="display: none;position: absolute;">
               <li data-type="closethis">关闭当前</li>
               <li data-type="closeall">关闭所有</li>
           </ul> -->
			<div class="layui-tab-content">
				<div class="layui-tab-item layui-show">
					<div style="font-size: 20px; text-align: center">欢迎使用易唐经分后台管理系统</div>
				</div>
			</div>
		</div>
	</div>

	</div>
  <!-- 底部固定区域 -->
	<div class="layui-footer"  style="text-align: center;">
	  © www.cjk.com - 易唐经分系统 
	</div>
	
	<script type="text/javascript" src="layui/layui.all.js"></script>
	<script>
	layui.use('element', function(){
		  var $ = layui.jquery
		  ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
		  
		  //触发事件
		 var active = {
              //在这里给active绑定几项事件，后面可通过active调用这些事件
              tabAdd: function(url,id,name) {
                  //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
                  //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
                  element.tabAdd('demo', {
                      title: name,
                      content: '<iframe data-frameid="'+id+'" scrolling="auto" frameborder="0" src="'+url+'" style="width:100%;height:90%;"></iframe>',
                      id: id //规定好的id
                  })
                  // CustomRightClick(id); //给tab绑定右击事件
                   //FrameWH();  //计算ifram层的大小
              },
              tabChange: function(id) {
                  //切换到指定Tab项
                  element.tabChange('demo', id); //根据传入的id传入到指定的tab项
              }, 
              tabDelete: function (id) {
              element.tabDelete("demo", id);//删除
              }
              , tabDeleteAll: function (ids) {//删除所有
                  $.each(ids, function (i,item) {
                      element.tabDelete("demo", item); //ids是一个数组，里面存放了多个id，调用tabDelete方法分别删除
                  })
              }
          };
		  
		  $('.site-demo-active').on('click', function(){
		    var othis = $(this), type = othis.data('type');
		    active[type] ? active[type].call(this, othis) : '';
		  });
		  
		  //Hash地址的定位
		  var layid = location.hash.replace(/^#test=/, '');
		  element.tabChange('test', layid);
		  
		  element.on('tab(test)', function(elem){
		    location.hash = 'test='+ $(this).attr('lay-id');
		  });
		  
		});
	</script>
</body>
</html>