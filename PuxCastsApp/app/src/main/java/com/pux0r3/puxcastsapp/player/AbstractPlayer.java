package com.pux0r3.puxcastsapp.player;

/**
 * Created by pux19 on 6/5/2016.
 */
public abstract class AbstractPlayer implements Player{

	private Delegate _delegate;

	protected void setStatus(Status status) {
		_delegate.onStatusChanged(status);
	}

	@Override
	public void setDelegate(Delegate delegate) {
		_delegate = delegate;
	}
}
