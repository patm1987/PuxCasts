package com.pux0r3.puxcastsapp;

/**
 * Created by pux19 on 6/4/2016.
 */
public class PuxCastApp extends android.app.Application {
	private PlayerComponent mPlayerComponent;

	@Override
	public void onCreate() {
		super.onCreate();

		PlayerModule playerModule = new PlayerModule();
		playerModule.setPlayer(new FakePlayer());

		mPlayerComponent = DaggerPlayerComponent
				.builder()
				.playerModule(playerModule)
				.build();
	}

	public PlayerComponent getPlayerComponent() {
		return mPlayerComponent;
	}
}
