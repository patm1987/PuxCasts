package com.pux0r3.puxcastsapp;

/**
 * Created by pux19 on 6/4/2016.
 */
public class FakePlayer implements IPlayer {
	private boolean mIsPlaying = false;

	@Override
	public void play() {
		mIsPlaying = true;
	}

	public boolean isPlaying() {
		return mIsPlaying;
	}

	@Override
	public void pause() {

	}

	@Override
	public void nextTrack() {

	}

	@Override
	public void skipForwards() {

	}

	@Override
	public void skipBackwards() {

	}
}
