package com.cd;

import java.time.LocalTime;

public class CD implements Comparable<CD> {
	int id;
	String name, author;
	LocalTime playingTime;
	
	public CD(int id, String name, String author, LocalTime playingTime) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.playingTime = playingTime;
	}

	@Override
	public int compareTo(CD otherCD) {
		if(playingTime.isAfter(otherCD.playingTime)) {
			return 1;
		} else if(playingTime.isBefore(otherCD.playingTime)) {
			return -1;
		} else if(this.equals(otherCD)) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", name=" + name + ", author=" + author + ", playingTime=" + playingTime + "]";
	}
}