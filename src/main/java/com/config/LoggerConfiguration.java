package com.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LoggerConfiguration {

	private static LoggerConfiguration instance = new LoggerConfiguration();

	private LoggerConfiguration() {
	}

	public static LoggerConfiguration getInstance() {
		return instance;
	}
	
	public static Logger configurator(String className) {
		Configurator.initialize(null, "log4j2.xml");
		return LogManager.getLogger(className);
	}

}