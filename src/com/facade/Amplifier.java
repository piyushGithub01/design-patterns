package com.facade;

public class Amplifier {

	public void on() {
		System.out.println("Amplifies is ON");
	}

	public void setDvd() {
		System.out.println("Amplifier set to DVD");
	}

	public void setSurroundSound() {
		System.out.println("Amplifier set to Surround Sound mode");
	}

	public void setVolume(int i) {
		System.out.println("Amplifier volume set to level " + i);
	}

	public void off() {
		System.out.println("Amplifier OFF");
	}

}
