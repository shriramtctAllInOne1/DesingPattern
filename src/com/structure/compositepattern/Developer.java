package com.structure.compositepattern;

public class Developer implements Employee {
	public String name;
	public String id;
	public String possition;

	public Developer(String name, String id, String possition) {
		super();
		this.name = name;
		this.id = id;
		this.possition = possition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPossition() {
		return possition;
	}

	public void setPossition(String possition) {
		this.possition = possition;
	}

	@Override
	public void showEmpoloyeeDetail() {
		System.out.println("Developer Id :"+id);
		System.out.println("Developer Name :"+name);
	}

}
