package com.connect_group.performance_testing.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.connect_group.performance_testing.service.SlowLorisService;

@Service
public class SlowLorisServiceImpl implements SlowLorisService {
	
	private static final Logger log = Logger.getLogger(SlowLorisServiceImpl.class);

	@Override
	public void goSlow() {
		for (int i = 0; i < 2000; i++) {
			log.info("I'm busy doing nothing");
			log.info("Busy the whole day through");
			log.info("Trying to find lots of things not to do");
		}
	}
}
