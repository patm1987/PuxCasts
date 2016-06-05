package com.pux0r3.puxcastsapp.player;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by pux19 on 6/5/2016.
 */
public class AbstractPlayerTest {

	@Test
	public void testEchosStatusUpdates() {
		FakePlayer player = new FakePlayer();
		Player.Delegate delegate = mock(Player.Delegate.class);
		player.setDelegate(delegate);
		for(Player.Status status: Player.Status.values()) {
			player.setStatus(status);
			verify(delegate).onStatusChanged(status);
		}
	}

	@Test
	public void testHandlesNullDelegate() {
		FakePlayer player = new FakePlayer();
		player.setStatus(Player.Status.Playing);
	}

	@Test
	public void testCanRetrieveStatus() {
		FakePlayer player = new FakePlayer();
		for(Player.Status status: Player.Status.values()) {
			player.setStatus(status);
			Assert.assertEquals(status, player.getStatus());
		}
	}
}