package com.core.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.core.game.PacmanLevel;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("PacmanDemo");
		config.setWindowedMode(250,300);
		PacmanGame myGame = new PacmanGame();
		Lwjgl3Application launcher = new Lwjgl3Application(myGame, config);
	}
}
