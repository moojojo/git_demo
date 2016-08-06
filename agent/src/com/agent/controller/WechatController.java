package com.agent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agent.common.JsonResponse;

@Controller
@RequestMapping("wechat")
public class WechatController {
	
	@RequestMapping(value = "selectMessage", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public JsonResponse selectXmlMessage(){
		System.out.println("123.................");
		return new JsonResponse().success("ok");
	}
}
