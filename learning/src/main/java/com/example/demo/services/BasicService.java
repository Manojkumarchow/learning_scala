package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

	public List<String> list;
	
	public String displayName() {
		return "Manoj Kumar Pentela";
	}
	
	public void addToList() {
		list.add("1");
		list.add("2");
		list.add("3");
	}
	
	public List<String> sendList() {
		return list;
	}
}
