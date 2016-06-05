package com.pux0r3.puxcastsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class PlayerActivity extends AppCompatActivity {
	@Inject IPlayer mPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player);
		PlayerComponent playerComponent = ((PuxCastApp)getApplication()).getPlayerComponent();
		playerComponent.inject(this);
		playerComponent.inject((PlayerButtonsFragment) getFragmentManager().findFragmentById(R.id.buttons_fragment));
	}
}
