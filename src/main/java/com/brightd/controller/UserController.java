package com.brightd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brightd.model.User;
import com.brightd.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

    @Resource(name = "demoService")
    private DemoService demoService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		//int userId = Integer.parseInt(request.getParameter("id"));
        int userId = 1;
		//User user = this.userService.getUserById(userId);
        User user = new User();
        String str = demoService.sayHello("tom&jerry");
        user.setUserName(str);
        user.setAge(10);
        user.setId(1);
		model.addAttribute("user", user);
		return "showUser";
	}
}
