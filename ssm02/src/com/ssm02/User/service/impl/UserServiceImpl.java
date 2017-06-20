package com.ssm02.User.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm02.User.mapper.UserMapper;
import com.ssm02.User.pojo.GoodsExam;
import com.ssm02.User.pojo.User;
import com.ssm02.User.pojo.UserGoodsVo;
import com.ssm02.User.service.UserException;
import com.ssm02.User.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserGoodsVo findGoods_User(GoodsExam goodsExam) {
		//具体的业务处理
		return userMapper.findGoods_User(goodsExam);
	}

	@Override
	public User login(User form) throws UserException{
		User user = userMapper.findUserByName(form.getUsername());
		if(user==null){
			throw new UserException("用户名不存在");
		}
		if(!form.getPassword().equals(user.getPassword())){
			throw new UserException("密码错误");
		}
		return user;
	}
}
