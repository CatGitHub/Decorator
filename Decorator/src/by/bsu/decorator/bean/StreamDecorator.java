package by.bsu.decorator.bean;

public abstract class StreamDecorator extends AbstractStream {

private AbstractStream abstractStream;

	public StreamDecorator() {

	}

	public StreamDecorator(AbstractStream abstractStream) {
		this.abstractStream = abstractStream;
	}

	public String handleBufferFull()
	{
		return abstractStream.handleBufferFull();
	}

	public AbstractStream getAbstractStream() {
		return abstractStream;
	}

	public void setAbstractStream(AbstractStream abstractStream) {
		this.abstractStream = abstractStream;
	}

}