package com.creational.factorydesignpattern;

public class ComputerFactory {

	public static Computer getComputer(String ram, String hdd, String cpu, String type) {
		Computer computer = null;
		if (type.equals("Pc")) {
			computer = new Pc(ram, hdd, cpu);
		}
		if (type.equals("Server")) {
			computer = new Server(ram,hdd,cpu);
		}
		return computer;
	}
}
