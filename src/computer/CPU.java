package computer;

public class CPU {
	String memorySize;

	public CPU(String memorySize) {
		this.memorySize = memorySize;
	}

	public String getMemorySize() {
		return "CPU memory : " + memorySize;
	}
}
