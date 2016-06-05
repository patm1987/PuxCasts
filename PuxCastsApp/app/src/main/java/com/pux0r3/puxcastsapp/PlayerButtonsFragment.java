package com.pux0r3.puxcastsapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pux0r3.puxcastsapp.player.Player;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerButtonsFragment extends Fragment {
	@Inject
	Player _player;

	public PlayerButtonsFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_player_buttons, container, false);

		Button playButton = (Button) view.findViewById(R.id.play_button);
		playButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_player.play();
			}
		});

		Button pauseButton = (Button) view.findViewById(R.id.pause_button);
		pauseButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_player.pause();
			}
		});

		Button skipBackButton = (Button) view.findViewById(R.id.skip_back_button);
		skipBackButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_player.skipBackwards();
			}
		});

		Button skipForwardButton = (Button) view.findViewById(R.id.skip_forward_button);
		skipForwardButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_player.skipForwards();
			}
		});

		Button nextButton = (Button) view.findViewById(R.id.next_track_buttons);
		nextButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				_player.nextTrack();
			}
		});

		return view;
	}
}
