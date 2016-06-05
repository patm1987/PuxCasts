package com.pux0r3.puxcastsapp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pux19 on 6/4/2016.
 */
@Singleton
@Component(modules = {PlayerModule.class})
public interface PlayerComponent {
	void inject(PlayerActivity activity);
	void inject(PlayerButtons buttons);
}
