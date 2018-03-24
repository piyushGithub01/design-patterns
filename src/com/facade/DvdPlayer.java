package com.facade;

public class DvdPlayer {

	public void on() {
		System.out.println("DVD player is ON");
	}

	public void play(String movie) {
		System.out.println("DVD Player playing movie " + movie);
	}

	public void stop() {
		System.out.println("DVD player STOP");
	}

	public void eject() {
		System.out.println("Eject DVD");
	}

	public void off() {
		System.out.println("DVD player OFF");
	}

}
