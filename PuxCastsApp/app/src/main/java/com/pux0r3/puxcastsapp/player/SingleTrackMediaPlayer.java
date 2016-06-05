package com.pux0r3.puxcastsapp.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;

/**
 * Created by pux19 on 6/5/2016.
 */
public class SingleTrackMediaPlayer implements Player {

	public enum Status {
		Preparing,
		Playing,
		Paused,
		Stopped,
		Completed
	}

	private MediaPlayer _mediaPlayer;
	private Status _status = Status.Preparing;

	public SingleTrackMediaPlayer(final Uri mediaPath, final Context context) {

		MediaPlayer mediaPlayer = MediaPlayer.create(context, mediaPath);
		mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
			@Override
			public void onPrepared(MediaPlayer mp) {
				_mediaPlayer = mp;

				_mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
					@Override
					public void onCompletion(MediaPlayer mp) {
						_status = Status.Completed;
					}
				});

				_mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
					@Override
					public boolean onInfo(MediaPlayer mp, int what, int extra) {
						return false;
					}
				});
			}
		});
		mediaPlayer.prepareAsync();
	}

	@Override
	public void play() {
		if (_mediaPlayer != null) {
			_mediaPlayer.start();
			_status = Status.Playing;
		}
	}

	@Override
	public void pause() {
		if (_mediaPlayer != null && _status == Status.Playing) {
			_mediaPlayer.pause();
			_status = Status.Paused;
		}
	}

	@Override
	public void nextTrack() {
		if (_mediaPlayer != null) {
			if (_mediaPlayer.isPlaying()) {
				_mediaPlayer.stop();
			}
			_mediaPlayer.seekTo(0);
			_status = Status.Stopped;
		}
	}

	@Override
	public void skipForwards() {
		if (_mediaPlayer != null) {
			_mediaPlayer.seekTo(_mediaPlayer.getCurrentPosition() + 10000);
		}
	}

	@Override
	public void skipBackwards() {
		if (_mediaPlayer != null) {
			_mediaPlayer.seekTo(_mediaPlayer.getCurrentPosition() - 10000);
		}
	}
}
