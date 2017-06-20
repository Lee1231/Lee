package com.ssm02.User.mapper;

import java.util.List;

import com.ssm02.User.pojo.GoodsExam;
import com.ssm02.User.pojo.User;
import com.ssm02.User.pojo.UserGoodsVo;

public interface UserMapper {
	List<User> findAll();
	UserGoodsVo findGoods_User(GoodsExam goodsExam);
	User findUserByName(String username);
}
