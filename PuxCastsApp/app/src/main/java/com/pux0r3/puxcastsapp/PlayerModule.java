package com.pux0r3.puxcastsapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pux19 on 6/4/2016.
 */
@Module
public class PlayerModule {
	private IPlayer mPlayer;

	public void setPlayer(IPlayer player) {
		mPlayer = player;
	}

	@Provides @Singleton
	IPlayer getPlayer() {
		return mPlayer;
	}
}
