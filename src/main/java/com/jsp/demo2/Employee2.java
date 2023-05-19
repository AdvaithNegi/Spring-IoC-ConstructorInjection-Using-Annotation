package com.jsp.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee2 {

	int id;
	String name;
	String email;

	public Employee2(@Value(value = "103") int id, @Value(value = "Masoom") String name,
			@Value(value = "masoom@mail.com") String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println("ID is    : " + id);
		System.out.println("Name is  : " + name);
		System.out.println("Email is : " + email);
	}

}
