package com.pilot.healthkeeper;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.pilot.healthkeeper.config.kafka.KafkaProcessor;

@Service
public class PolicyHandler {

	@StreamListener(KafkaProcessor.INPUT)
	public void onStringEventListener(@Payload String eventString) {
		
	}
}
