package com.capella.spring.integration.helloworld;

import java.io.File;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component("fileHandler")
public class FileHandler {
	
	@ServiceActivator
	public File handle(File bytes){
		return bytes;
	}
}
