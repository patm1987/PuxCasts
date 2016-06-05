package com.pux0r3.puxcastsapp;

import com.pux0r3.puxcastsapp.player.Player;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pux19 on 6/4/2016.
 */
@Module
public class PlayerModule {
	private Player mPlayer;

	public void setPlayer(Player player) {
		mPlayer = player;
	}

	@Provides @Singleton
	Player getPlayer() {
		return mPlayer;
	}
}
