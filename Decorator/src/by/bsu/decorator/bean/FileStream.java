package by.bsu.decorator.bean;

public class FileStream extends AbstractStream {
	public FileStream() {

	}

	public String handleBufferFull() {
		size1=0;
		return "File Stream. ";

	}

}