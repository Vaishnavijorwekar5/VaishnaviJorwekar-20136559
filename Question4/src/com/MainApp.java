package com;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee p = (Employee)contex.getBean("per");
		
		
		
		ArrayList<String> em = p.getProgramming();
		System.out.println("languages are....");
		for(String s: em) {
			System.out.println(" "+s);	
		}
		
		
		
		




	}

}