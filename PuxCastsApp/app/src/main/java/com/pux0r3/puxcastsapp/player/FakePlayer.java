package com.pux0r3.puxcastsapp.player;

/**
 * Created by pux19 on 6/4/2016.
 */
public class FakePlayer implements Player {
	private boolean _isPlaying = false;
	private Delegate _delegate;

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

	@Override
	public void setDelegate(Delegate delegate) {
		_delegate = delegate;
	}
}
