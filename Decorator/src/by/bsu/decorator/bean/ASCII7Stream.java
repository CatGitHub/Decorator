package by.bsu.decorator.bean;

public class ASCII7Stream extends StreamDecorator{
	public ASCII7Stream() {
	}
	
	public ASCII7Stream(AbstractStream abstractStream) {
		super(abstractStream);
	}
	public String handleBufferFull() {
		bytes=convertToASCII7(bytes);
		return "ASCII7Stream Stream. "+super.handleBufferFull();
	}
	
	private byte[] convertToASCII7(byte[] bytes) {
		System.out.println("ConvertToASCII7");
		return bytes;
		
	}
}
