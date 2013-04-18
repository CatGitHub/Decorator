package by.bsu.decorator.factory;

import by.bsu.decorator.bean.AbstractStream;

public class Factory {
	private Factory() {
	}

	public static AbstractStream getStream(String className)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		AbstractStream instance;
		Class class1;
		class1 = Class.forName(className);
		Object obj = class1.newInstance();
		instance = (AbstractStream) obj;
		return instance;

	}
}
