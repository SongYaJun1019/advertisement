package com.it.advertisement.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.advertisement.entity.User;
import com.it.advertisement.mapper.UserMapper;
/**
 * 简单demo
 * @author 94546
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
		
		@Autowired  
	    private UserMapper mapper;  
		
		@RequestMapping("/index")
		public String home(HttpServletRequest request){
//			 User user = new User();  
//		        user.setUserName("崔建雷");  
//		        user.setAge(27);  
//		        mapper.save(user);  
//		        System.out.println("插入用户信息"+user.getUserName());  
//		        String hello = user.getUserName();
//		        request.setAttribute("hello", hello);
		        return "home/index";
		}
}
