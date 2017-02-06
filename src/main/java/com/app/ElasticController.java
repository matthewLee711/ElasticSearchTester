package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/elastic")
public class ElasticController {
	@RequestMapping("/search")
	public @ResponseBody void querySearch() {
		
	}
}
