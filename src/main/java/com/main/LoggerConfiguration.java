package com.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LoggerConfiguration {
	
	public static Logger Configurator(String className) {
		
		Configurator.initialize(null, "C:\\Users\\satya\\eclipse-workspace\\LoggerJavaExample\\resources\\log4j2.xml");
		Logger LOGGER = LogManager.getLogger(className);
		return LOGGER;
		
	}

}