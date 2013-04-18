package by.bsu.decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import by.bsu.decorator.bean.ASCII7Stream;
import by.bsu.decorator.bean.AbstractStream;
import by.bsu.decorator.bean.CompressingStream;
import by.bsu.decorator.bean.FileStream;
import by.bsu.decorator.factory.Factory;

public class TestDecorator {

	@Test
	public void testCompressing() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {

		// CompressingStream stream = new CompressingStream(new FileStream());
		// String str = stream.handleBufferFull();
		// byte[] b = new byte[5];
		// stream.putByte(b);
		// System.out.println(str);
		// assertEquals("Compressing Stream. File Stream. ", str);

		AbstractStream abstractStream = Factory
				.getStream("by.bsu.decorator.bean.FileStream");
		CompressingStream stream = (CompressingStream) Factory
				.getStream("by.bsu.decorator.bean.CompressingStream");
		stream.setAbstractStream(abstractStream);
		String str = stream.handleBufferFull();

		byte[] b = new byte[10];
		for (int i = 0; i < 10; i++)
			b[i] = (byte) i;
		stream.putByte(b);
		System.out.println(str);
		assertEquals("Compressing Stream. File Stream. ", str);
	}

	@Test
	public void testASCII7() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {

		AbstractStream abstractStream2 = Factory
				.getStream("by.bsu.decorator.bean.NetworkStream");
		ASCII7Stream stream2 = (ASCII7Stream) Factory
				.getStream("by.bsu.decorator.bean.ASCII7Stream");
		stream2.setAbstractStream(abstractStream2);
		String str2 = stream2.handleBufferFull();
		byte[] b = new byte[10];
		for (int i = 0; i < 10; i++)
			b[i] = (byte) i;
		stream2.putByte(b);

		System.out.println(str2);
		assertEquals("ASCII7Stream Stream. Network Stream. ", str2);

	}

}
