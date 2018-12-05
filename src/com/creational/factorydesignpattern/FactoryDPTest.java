package com.creational.factorydesignpattern;

public class FactoryDPTest {

	public static void main(String [] args){
		
		Pc pc = (Pc) ComputerFactory.getComputer("2GB", "560GB", "1.5GMZ", "Pc");
		Server server=(Server) ComputerFactory.getComputer("3GB", "1060GB", "5GMZ", "Server");
		System.out.println("Pc Computer : "+pc);
		System.out.println("Server Computer : "+server);
	}
}
