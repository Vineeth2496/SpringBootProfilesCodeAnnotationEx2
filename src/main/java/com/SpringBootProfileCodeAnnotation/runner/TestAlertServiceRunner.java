package com.SpringBootProfileCodeAnnotation.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootProfileCodeAnnotation.service.AlertService;
@Component
public class TestAlertServiceRunner implements CommandLineRunner {

	@Autowired
	private AlertService service;
	@Override
	public void run(String... args) throws Exception {
		service.send();
	}

}
