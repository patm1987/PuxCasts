package com.pux0r3.puxcastsapp;

import android.widget.Button;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.FragmentTestUtil;

/**
 * Created by pux19 on 6/4/2016.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class PlayerButtonsFragmentTest {
	@Test
	public void playButtonStartsPlaying () throws Exception {
		FakePlayer player = new FakePlayer();
		PlayerModule playerModule = new PlayerModule();
		playerModule.setPlayer(player);

		PlayerComponent playerComponent = DaggerPlayerComponent
				.builder()
				.playerModule(playerModule)
				.build();

		PlayerButtonsFragment playerButtonsFragment = new PlayerButtonsFragment();
		playerComponent.inject(playerButtonsFragment);

		FragmentTestUtil.startFragment(playerButtonsFragment);
		Button button = (Button)playerButtonsFragment.getView().findViewById(R.id.play_button);
		button.callOnClick();

		Assert.assertTrue(player.isPlaying());
	}
}