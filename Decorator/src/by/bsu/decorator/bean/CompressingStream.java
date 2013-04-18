package by.bsu.decorator.bean;

public class CompressingStream extends StreamDecorator {
	public CompressingStream() {
	}

	public CompressingStream(AbstractStream abstractStream) {
		super(abstractStream);
	}

	public String handleBufferFull() {
		bytes=compress(bytes);
		return "Compressing Stream. "+super.handleBufferFull();

	}

	private byte[] compress(byte[] bytes) {
		System.out.println("Compress");
		return bytes;

	}
}
