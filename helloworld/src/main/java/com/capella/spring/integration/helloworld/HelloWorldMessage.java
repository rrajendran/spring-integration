package com.capella.spring.integration.helloworld;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;


public class HelloWorldMessage {
	public String sayHello(String message) throws IOException{
		File f = new File("/tmp/" + System.currentTimeMillis() + ".txt");
		OutputStream output = new FileOutputStream(f);
		IOUtils.write(message.getBytes(), output );
		return (message);
	}
}
