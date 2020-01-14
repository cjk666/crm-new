package com.entor.controller;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.entor.entity.Result;
import com.entor.entity.Teacher;
import com.entor.service.ITeacherService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cjk
 * @since 2019-12-17
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private ITeacherService service;
	
	@RequestMapping("/queryByPage")
	public Map<String, Object> queryByPage(@RequestParam(value="limit",required=false,defaultValue="20") String rows,
			@RequestParam(value="page",required=false,defaultValue="1") String page,Teacher teacher){
		//创建查询条件对象
		QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
		if(!StringUtils.isEmpty(teacher.getTeacherName())) {
			queryWrapper.like("name", teacher.getTeacherName());
		}
		//根据条件获取总记录数
		int total = service.count(queryWrapper);
		
		int currentPage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		//拼接分页sql
		queryWrapper.last("limit "+(currentPage-1)*pageSize+","+pageSize);
		List<Teacher> list = service.list(queryWrapper);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("count", total);
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", list);
		return map;
	}
	
	@RequestMapping("/add")
	public Result add(Teacher teacher) {
		boolean flag = service.save(teacher);
		if (flag) {
			return new Result(0,"数据添加成功");
		}
		return new Result(1,"数据添加失败");
	}
	
	@RequestMapping("/update")
	public Result update(Teacher teacher) {
		if (service.updateById(teacher)) {
			return new Result(0,"修改成功");
		}
		return new Result(1,"修改失败");
	}
	
	@RequestMapping("/deleteMore")
	public Result deleteMore(String ids) {
		boolean flag = service.removeByIds(Arrays.asList(ids.split(",")));
		if (flag) {
			return new Result(0,"删除成功");
		}
		return new Result(1,"删除失败");
	}
	
	@RequestMapping("/queryAll")
	public List<Teacher> queryAll(){
		return service.list();
	}
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		//如果客户端传递yyyy-MM-dd格式的字符串，就当做java.util.Date类型处理
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}

