package com.capella.spring.integration.helloworld;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.MessagingException;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageHandler;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.message.GenericMessage;

public class HelloworldApp {
	private static final Logger LOGGER = Logger.getLogger(HelloworldApp.class);
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/capella/spring/integration/helloworld/applicationContext.xml",HelloworldApp.class);
		MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
		PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);
		inputChannel.send(new GenericMessage<String>("Ramesh"));
		LOGGER.debug(outputChannel.receive(0).getPayload());
	}
}

