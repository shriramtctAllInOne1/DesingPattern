package com.creational.abstractfactorypattern;

/**
 * @author P7111381
 *
 */
public class Pc implements Computer {

	private String ram;
	private String cpu;
	private String hdd;

	public Pc(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {

		return this.ram;
	}

	@Override
	public String getHDD() {

		return this.hdd;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}

	@Override
	public String toString() {
		return "Pc [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}

}
