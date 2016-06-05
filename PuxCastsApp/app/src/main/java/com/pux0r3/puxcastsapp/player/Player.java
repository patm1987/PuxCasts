package com.pux0r3.puxcastsapp.player;

/**
 * Created by pux19 on 6/4/2016.
 */
public interface Player {
	enum Status {
		Preparing,
		Playing,
		Paused,
		Stopped,
		Completed
	}

	interface Delegate{
		void onStatusChanged(Status status);
	}

	void play();
	void pause();
	void nextTrack();
	void skipForwards();
	void skipBackwards();

	void setDelegate(Delegate delegate);
}

