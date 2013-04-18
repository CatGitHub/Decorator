package by.bsu.decorator.bean;

public abstract class AbstractStream {
	private final int SIZE_BUFFER = 100;
	protected byte[] bytes = new byte[SIZE_BUFFER];
	protected int size1;

	public int putByte(byte[] bytes) {

		int size2 = bytes.length;
		int diff = SIZE_BUFFER - size1;
		int j = 0;

		if (diff > size2) {
			for (int i = size1; i < size1 + size2; i++, j++) {
				this.bytes[i] = bytes[j];

			}
			size1 += size2;
		} else {
			for (int i = size1; i < SIZE_BUFFER; i++, j++) {
				this.bytes[i] = bytes[j];

			}
			handleBufferFull();

			size1 = size2 - j;

			for (int i = 0; i < size2 - j; i++, j++) {
				this.bytes[i] = bytes[j];

			}
		}

		return 1;
	}

	public abstract String handleBufferFull();
}
