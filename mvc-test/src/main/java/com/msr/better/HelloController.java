package com.msr.better;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-29 19:07:44
 */
@Controller
@RequestMapping("/demo")
public class HelloController {
	@RequestMapping("/handle01")
	public String handle01(String name, Map<String,Object> model) {
		System.out.println("handler....");
		Date date = new Date();
		model.put("date",date);
		return "success";
	}
}
