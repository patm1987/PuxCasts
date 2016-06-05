package com.pux0r3.puxcastsapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerButtons extends Fragment {
	@Inject IPlayer mPlayer;

	public PlayerButtons() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		((PuxCastApp)getActivity().getApplication()).getPlayerComponent().inject(this);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_player_buttons, container, false);
	}
}
