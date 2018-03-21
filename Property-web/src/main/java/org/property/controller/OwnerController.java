package org.property.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.property.dao.YezhubiaoDao;
import org.property.pojo.Yezhubiao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/owner")
public class OwnerController {

	
	private YezhubiaoDao yezhubiaoDao;
	
	public void setYezhubiaoDao(YezhubiaoDao yezhubiaoDao) {
		this.yezhubiaoDao = yezhubiaoDao;
	}

	@RequestMapping("/index")
	public String index() {
		return "owner/ownerList";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Map<String, Object> list(){
		Map<String , Object> map = new HashMap<>();
		List<Yezhubiao> list = new ArrayList<>();
		int total = 
		map.put("rows", list);
		map.put("total", total);
		return map;
	}
}
