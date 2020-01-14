<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>老师信息</title>
</head>
<link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
<script type="text/javascript" src="layui/layui.all.js"></script>
<body>
 
<table class="layui-hide" id="test" lay-filter="test"></table>
 
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm layui-anim" lay-event="add" data-anim="layui-anim-scale">新增数据</button>
    <button class="layui-btn layui-btn-sm layui-anim" lay-event="deleteMore" data-anim="layui-anim-scale">批量删除</button>
    <button class="layui-btn layui-btn-sm layui-anim" lay-event="addMore" data-anim="layui-anim-scale">批量导入</button>
  </div>
</script>

	<script type="text/html" id="barDemo">
		<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>
 
<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,id: 'teacher'
    ,url:'teacher/queryByPage'
    ,method: 'post'
    ,toolbar: '#toolbarDemo'
    ,title: '用户数据表'
    ,totalRow: true
    ,cellMinWidth: 10
    ,height: 'full-5' 
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'teacherId', title:'ID',hide:true}
      ,{field:'teacherName', title:'姓名', width:80}
      ,{field:'teacherSex', title:'性别', width:60, templet: function(res){
        	if (res.teacherSex == 1) {
				return '男';
			} else if(res.teacherSex == 0){
				return '女';
			}
      }}
      ,{field:'teacherPhone', title:'联系电话'}
      ,{field:'teacherAddress', title:'联系地址'}
      ,{field:'teacherEduLevel', title:'学历', width:60}
      ,{field:'teacherSkill', title:'职称'}
      ,{field:'teacherSchoolName', title:'毕业院校'}
      ,{field:'teacherMajorName', title:'毕业专业'}
      ,{field:'teacherLeaveSchoolDate', title:'毕业日期'}
      ,{field:'teacherJob', title:'职位', width:60}
      ,{field:'teacherEntryDate', title:'入职时间'}
      ,{field:'teacherEndDate', title:'离职时间'}
      ,{field:'teacherStatue', title:'教师状态', width:100, templet: function(res){
	      	if (res.teacherStatue == 1) {
				return '在职';
			} else if(res.teacherStatue == 2){
				return '离职';
			}
  		}}
      ,{field:'teacherPic', title:'教师头像',hide:true}
      ,{field:'createTime', title:'创建时间', width:180}
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:120}
    ]]
    ,page: true
    ,limit: 20
  })
  
  //工具栏事件
  table.on('toolbar(test)', function(obj){
    var checkStatus = table.checkStatus('teacher');
    switch(obj.event){
      case 'add':
        var data = checkStatus.data;  
        layer.alert(data[0].teacherJob);
      break;
      case 'deleteMore':
        var data = checkStatus.data;
        layer.msg('选中了：'+ data.length + ' 个');
      break;
      case 'addMore':
        layer.msg(checkStatus.isAll ? '全选': '未全选')
      break;
    };
  });

//监听行单击事件（双击事件为：rowDouble）
  table.on('row(test)', function(obj){
    //标注选中样式
    obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
  });
  
  
  //操作栏事件
  layui.use('table', function(){
	  var table = layui.table;
	  //监听表格复选框选择
	  table.on('checkbox(test)', function(obj){
	    console.log(obj)
	  });
	  //监听工具条
	  table.on('tool(test)', function(obj){
	    var data = obj.data;
	    if(obj.event === 'del'){
	      layer.confirm('真的删除行么', function(index){
	        obj.del();
	        //layer.close(index);
	      });
	    } else if(obj.event === 'edit'){
	      layer.alert('编辑行：<br>'+ JSON.stringify(data))
	    }
	  });
	});

});
 
</script>
</body>
</html>