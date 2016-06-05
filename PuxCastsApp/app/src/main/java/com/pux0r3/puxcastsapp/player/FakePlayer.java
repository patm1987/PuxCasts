package com.pux0r3.puxcastsapp.player;

/**
 * Created by pux19 on 6/4/2016.
 */
public class FakePlayer extends AbstractPlayer {
	private boolean _isPlaying = false;

	public void setStatus(Status status) {
		super.setStatus(status);
	}

	@Override
	public void play() {
		_isPlaying = true;
	}

	public boolean isPlaying() {
		return _isPlaying;
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
