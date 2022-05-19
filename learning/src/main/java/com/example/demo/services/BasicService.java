package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.BasicDomain;

@Service
public class BasicService {

	public List<BasicDomain> list = new ArrayList<BasicDomain>();

	public String displayName() {
		return "Manoj Kumar Pentela";
	}

	public void addToList() {
		list.add(new BasicDomain(1, "Manoj"));
		list.add(new BasicDomain(2, "Kumar"));
		list.add(new BasicDomain(3, "Pentela"));
	}

	public List<BasicDomain> sendList() {
		addToList();
		return list;
	}
}
