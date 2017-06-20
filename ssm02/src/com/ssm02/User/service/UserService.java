package com.ssm02.User.service;

import com.ssm02.User.pojo.GoodsExam;
import com.ssm02.User.pojo.User;
import com.ssm02.User.pojo.UserGoodsVo;

public interface UserService {
	UserGoodsVo findGoods_User(GoodsExam goodsExam) throws Exception;
	User login(User user) throws Exception;
}
