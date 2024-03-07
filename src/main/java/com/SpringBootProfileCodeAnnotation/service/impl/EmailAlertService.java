package com.SpringBootProfileCodeAnnotation.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.SpringBootProfileCodeAnnotation.service.AlertService;
@Component
@Profile("qa")
public class EmailAlertService implements AlertService {

	@Value("${my.app.code}")
	private String code;
	@Override
	public void send() {
		System.out.println("EMAIL ALERT-QA PROFILE=> "+code);
	}

}
