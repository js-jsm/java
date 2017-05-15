package javaStudy;

public class MyTv {
	
	boolean isPowerON;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void gotoPrevChannel(int nowChannel) {
		this.channel = nowChannel - 1;
	}
	
	
}
