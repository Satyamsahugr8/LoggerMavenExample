package com.runner;

import com.config.LoggerConfiguration;
import org.apache.logging.log4j.Logger;

public class MyService {

	private static LoggerConfiguration loggerConfiguration = LoggerConfiguration.getInstance();
	private static Logger logger = loggerConfiguration.configurator(MyService.class.getName());

	public static void main(String[] args) {
		int a = 0;

		logger.info("inside main(): a:[{}]",a);
		logger.warn("warning");
		logger.error("this is error");
	}

}
