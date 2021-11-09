package com.Springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

	
		@RequestMapping("/home")
		public String  getrequest()
		{
			return "this is just for check";
		}
		
		@RequestMapping("/contact")
		public String  getcontact()
		{
			return "this is contact page";
		}

}
