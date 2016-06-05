package com.pux0r3.puxcastsapp;

import android.net.Uri;

import com.pux0r3.puxcastsapp.player.SingleTrackMediaPlayer;

/**
 * Created by pux19 on 6/4/2016.
 */
public class PuxCastApp extends android.app.Application {
	private PlayerComponent mPlayerComponent;

	@Override
	public void onCreate() {
		super.onCreate();

		SingleTrackMediaPlayer mediaPlayer = new SingleTrackMediaPlayer(
				Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.i_am_a_computer),
				this);

		PlayerModule playerModule = new PlayerModule();
		playerModule.setPlayer(mediaPlayer);

		mPlayerComponent = DaggerPlayerComponent
				.builder()
				.playerModule(playerModule)
				.build();
	}

	public PlayerComponent getPlayerComponent() {
		return mPlayerComponent;
	}
}
