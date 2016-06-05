package com.pux0r3.puxcastsapp.player;

/**
 * Created by pux19 on 6/5/2016.
 */
public abstract class AbstractPlayer implements Player{

	private Delegate _delegate;
	private Status _status;

	protected void setStatus(Status status) {
		_status = status;
		if (_delegate != null) {
			_delegate.onStatusChanged(status);
		}
	}

	public Status getStatus() {
		return _status;
	}

	@Override
	public void setDelegate(Delegate delegate) {
		_delegate = delegate;
	}
}
