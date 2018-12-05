package com.creational.abstractfactorypattern;

public class PcFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public PcFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Pc(ram, hdd, cpu);
	}

}
