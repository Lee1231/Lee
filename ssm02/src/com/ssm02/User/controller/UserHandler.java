package com.ssm02.User.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.ssm02.User.pojo.GoodsExam;
import com.ssm02.User.pojo.User;
import com.ssm02.User.pojo.UserGoodsVo;
import com.ssm02.User.service.UserService;

@Controller
@RequestMapping("user")

public class UserHandler{
	@Autowired
	private UserService userService;
	@RequestMapping("logOut.action")
	public String logOut(HttpSession session){
		session.invalidate();
		return "forward:/login.jsp";
	}
	@RequestMapping("login.action")
	public String login(User user,HttpSession session,Model model){
		User form;
		try {
			form = userService.login(user);
			session.setAttribute("form", form);
			return "redirect:loadIndex.action";
		} catch (Exception e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "forward:/login.jsp";
		}
		
	}
	@RequestMapping("loadIndex.action")
	public String loadIndex(){
		//读取主页需要的数据
		return "index";
	}
	@RequestMapping("findGoods_User.action")
	public String findGoods_User(GoodsExam goodsExam,Model model,HttpServletResponse resp) throws Exception{
		UserGoodsVo userGoodsVo = userService.findGoods_User(goodsExam);
		model.addAttribute("userGoodsVo", userGoodsVo);
		//return redirect：路径   --> 重定向
		return "goods/goodsList";
	}
	
	//
//	public ModelAndView test(){
//		ModelAndView mav = new ModelAndView("aaa");
//		mav.setViewName("aaa");
		 //mav.addObject(key,value):把key-value存到model,model会自动的把
			//里面的值存到request中
//		mav.addObject(key,value);
//	}
	
	@ResponseBody
	@RequestMapping(value="findUser",method=RequestMethod.POST)
	public User findUser(@RequestParam int id) throws IOException{
		System.out.println("--------------");
		User user = new User();
		user.setId(id);
		user.setUsername("jay");
		user.setEmail("sdfdsf@sdfds");
		return user;
	}
	
	
}





