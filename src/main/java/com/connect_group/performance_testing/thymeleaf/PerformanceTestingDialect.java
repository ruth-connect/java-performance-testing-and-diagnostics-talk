package com.connect_group.performance_testing.thymeleaf;

import org.thymeleaf.dialect.AbstractDialect;

public class PerformanceTestingDialect extends AbstractDialect {

	@Override
	public String getPrefix() {
		return "demo";
	}
	
	@Override
	public boolean isLenient() {
		return false;
	}
}
