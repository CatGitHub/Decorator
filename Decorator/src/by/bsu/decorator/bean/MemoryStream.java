package by.bsu.decorator.bean;

public class MemoryStream extends AbstractStream {
	public MemoryStream() {

	}

	public String handleBufferFull() {
		size1=0;
		return "Memory Stream. ";

	}

}
