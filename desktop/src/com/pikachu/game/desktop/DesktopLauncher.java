package com.pikachu.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pikachu.game.PiKaChuGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = PiKaChuGame.WIDTH;
		config.height = PiKaChuGame.HEIGHT;
		new LwjglApplication(new PiKaChuGame(), config);
	}
}
