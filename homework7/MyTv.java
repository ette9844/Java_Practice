package homework7;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	// getter
	boolean getIsPowerOn() {
		return isPowerOn;
	}

	int getChannel() {
		return channel;
	}

	int getVolume() {
		return volume;
	}

	// setter
	void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.prevChannel = this.channel;
			this.channel = channel;
		}
		else
			System.out.println("Valid channel: " + MIN_CHANNEL + "~" + MAX_CHANNEL);
	}

	void setVolume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME)
			this.volume = volume;
		else
			System.out.println("Valid volume: " + MIN_VOLUME + "~" + MAX_VOLUME);
	}
	
	// 현재 체널을 이전 채널로 변경 (+이전 채널은 현재 채널로)
	void gotoPrevChannel() {
		int tmp = this.prevChannel;
		this.prevChannel = this.channel;
		this.channel = tmp;
	}
}