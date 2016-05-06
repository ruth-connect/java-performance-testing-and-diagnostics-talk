package com.connect_group.performance_testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connect_group.performance_testing.service.HunkyDoryService;
import com.connect_group.performance_testing.service.LeakyCauldronService;
import com.connect_group.performance_testing.service.SlowLorisService;

@Controller
public class DemoController {
	
	@Autowired
	private HunkyDoryService hunkyDoryService;
	
	@Autowired
	private LeakyCauldronService leakyCauldronService;
	
	@Autowired
	private SlowLorisService slowLorisService;

	@RequestMapping({"/hunky-dory.html"})
	public String hunkyDory() {
		hunkyDoryService.beNice();
		return "hunkyDory";
	}
	
	@RequestMapping({"/leaky-cauldron.html"})
	public String leakyCauldron() {
		leakyCauldronService.leakMemory();
		return "leakyCauldron";
	}
	
	@RequestMapping({"/slow-loris.html"})
	public String slowLoris() {
		slowLorisService.goSlow();
		return "slowLoris";
	}
}
