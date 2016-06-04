package com.pux0r3.puxcastsapp;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerButtons extends Fragment {
	private IPlayer _player;

	public PlayerButtons() {
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
		return inflater.inflate(R.layout.fragment_player_buttons, container, false);
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);

		try {
			IAttachmentDelegate attachmentDelegate = (IAttachmentDelegate)context;
			_player = attachmentDelegate.getPlayer();
		} catch (ClassCastException e) {
			throw new RuntimeException("PlayerButtons's parent must implement IAttachmentDelegate");
		}
	}

	public interface IAttachmentDelegate {
		IPlayer getPlayer();
	}
}
