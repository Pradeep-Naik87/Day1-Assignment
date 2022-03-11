package computer;

public class Computer {
	private Monitor monitor;
	private KeyBoard keyboard;
	private Mouse mouse;
	private CPU cpu;

	public Computer(String quality, int keys, double size, String memorySize) {
		this.monitor = new Monitor(quality);
		this.keyboard = new KeyBoard(keys);
		this.mouse = new Mouse(size);
		this.cpu = new CPU(memorySize);
	}

	public String getComputer() {
		return "The Computer has " + monitor.getQuality() + keyboard.getKeys() + mouse.getSize() + cpu.memorySize;
	}

}
