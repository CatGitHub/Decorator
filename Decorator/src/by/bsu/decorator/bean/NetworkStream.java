package by.bsu.decorator.bean;

public class NetworkStream extends AbstractStream {

	public NetworkStream() {

	}

	public String handleBufferFull() {
		size1=0;
		return "Network Stream. ";

	}

}