package com.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyService {
	
	private static Logger logger = LogManager.getLogger(MyService.class);
	
	public static void main(String[] args) {
		
		int a = 0;
		
		logger.info("inside main(): a:[{}]",a);
		logger.warn("warning");
		logger.error("this is error");
	}

}
