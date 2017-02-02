package org.pack1;

import org.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAOP {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getTriangle().getName());
	}

}
