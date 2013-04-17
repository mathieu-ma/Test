package fr.mch.mdo.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/secure")
public class SecureController {
	
	@RequestMapping("/json")
	@ResponseBody
    public Map<String, String> json() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("initial", "mma");
        return result;
    }
}
