package com.creational.abstractfactorypattern;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory cputerabstractfacoty) {
		return cputerabstractfacoty.createComputer();
	}
}
