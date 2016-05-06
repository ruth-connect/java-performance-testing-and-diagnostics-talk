package com.connect_group.performance_testing.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.connect_group.performance_testing.service.LeakyCauldronService;

@Service
public class LeakyCauldronServiceImpl implements LeakyCauldronService {
	
	private static final Logger log = Logger.getLogger(LeakyCauldronService.class);
	
	private List<String> leakyList = Collections.synchronizedList(new ArrayList<String>());

	@Override
	public void leakMemory() {
		for (int i = 0; i < 1000; i++) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("A Memory Charm is stealing your memory. ");
			stringBuilder.append(Double.toString(Math.random()));
			leakyList.add(stringBuilder.toString());
		}
		log.info("Size of leaky list: " + leakyList.size());
	}
}
