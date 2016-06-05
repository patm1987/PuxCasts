package com.pux0r3.puxcastsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

public class PlayerActivity extends AppCompatActivity {
	@Inject IPlayer mPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_player);
		((PuxCastApp)getApplication()).getPlayerComponent().inject(this);
	}
}
