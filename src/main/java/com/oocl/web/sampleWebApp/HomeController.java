package com.oocl.web.sampleWebApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
    
    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String badRequest() {
        return "Hello World";
    }
    
    @RequestMapping("/users")
    public ResponseEntity<Map> returnJson() {
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("user", "name");
    	
    	//List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        return ResponseEntity.ok(map);
    }
    
    @RequestMapping("/ids")
    public @ResponseBody Map<String, String> verifyJson(@RequestBody Map<String, String> map){
    	map.put("id", "001");
    	return map;
    }
}