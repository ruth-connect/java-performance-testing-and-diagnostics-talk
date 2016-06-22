package com.connect_group.performance_testing.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.connect_group.performance_testing.service.EasilyOverloadedService;

@Service
public class EasilyOverloadedServiceImpl implements EasilyOverloadedService {
	
	private static final int MAX_NUM_CONNECTIONS = 1;
	
	private int numConnections;

	public void attemptToDoStuff() throws IOException, InterruptedException {
		if (numConnections >= MAX_NUM_CONNECTIONS) {
			throw new IOException("Sorry! Too many concurrent connections!");
		} else {
			numConnections++;
			Thread.sleep(100);
			numConnections--;
		}
	}
}
