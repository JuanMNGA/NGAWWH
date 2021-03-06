package com.me.ngawwh;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Neo Genesis, a World Without Heroes";
		cfg.useGL20 = true;
		cfg.width = 800;
		cfg.height = 400;
		
		new LwjglApplication(new MainGame(), cfg);
	}
}
