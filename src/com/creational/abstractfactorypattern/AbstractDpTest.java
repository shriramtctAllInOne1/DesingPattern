package com.creational.abstractfactorypattern;

public class AbstractDpTest {

	public static void main(String [] args){
	   Pc pc = (Pc) ComputerFactory.getComputer(new PcFactory("2GB", "560GB", "1.5GMZ"));
	   Server server = (Server) ComputerFactory.getComputer(new ServerFactory("3GB", "1060GB", "5GMZ"));
	   System.out.println(pc);
	   System.out.println(server);
	}
	
}
