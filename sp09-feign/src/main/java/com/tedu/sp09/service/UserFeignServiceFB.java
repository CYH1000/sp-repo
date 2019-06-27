package com.tedu.sp09.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;
@Component
public class UserFeignServiceFB implements UserFeignService{

	@Override
	public JsonResult<User> getUser(Integer userId) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法获取用户信息");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法增加用户积分");
	}

}
