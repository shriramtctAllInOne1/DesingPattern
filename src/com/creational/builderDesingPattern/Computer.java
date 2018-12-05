package com.creational.builderDesingPattern;

public class Computer {

	private String hdd;
	private String ram;
	private String cpu;
	private boolean isGraprahicEnable;
	private boolean isBluetoothEnable;

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public boolean isGraprahicEnable() {
		return isGraprahicEnable;
	}

	public void setGraprahicEnable(boolean isGraprahicEnable) {
		this.isGraprahicEnable = isGraprahicEnable;
	}

	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}

	public void setBluetoothEnable(boolean isBluetoothEnable) {
		this.isBluetoothEnable = isBluetoothEnable;
	}

	public Computer(ComputerBuilder computerBuilder) {
		this.cpu = computerBuilder.cpu;
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;
		this.isBluetoothEnable = computerBuilder.isBluetoothEnable;
		this.isGraprahicEnable = computerBuilder.isGraprahicEnable;
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", cpu=" + cpu + ", isGraprahicEnable=" + isGraprahicEnable
				+ ", isBluetoothEnable=" + isBluetoothEnable + "]";
	}

	public static void main(String[] args) {
		Computer com = new ComputerBuilder().setRam("2GB").setCpu("2MGZ").setHdd("256GB").build();
		Computer com1 = new ComputerBuilder().setRam("2GB").setCpu("2MGZ").setHdd("256GB").setBluetoothEnable(true).build();
        System.out.println(com);
        System.out.println(com1);
	}

	public static class ComputerBuilder {
		private String hdd;
		private String ram;
		private String cpu;
		private boolean isGraprahicEnable;
		private boolean isBluetoothEnable;

		public ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}

		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}

		public ComputerBuilder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		public ComputerBuilder setGraprahicEnable(boolean isGraprahicEnable) {
			this.isGraprahicEnable = isGraprahicEnable;
			return this;
		}

		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}

		public Computer build() {
			return new Computer(this);

		}

	}

}
