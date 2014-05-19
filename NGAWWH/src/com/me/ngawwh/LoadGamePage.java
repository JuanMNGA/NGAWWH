package com.me.ngawwh;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class LoadGamePage {
	private AssetManager manager = new AssetManager();
	private static LoadGamePage Loader = new LoadGamePage();
	
	private LoadGamePage(){
		//Carga de Backgrounds
		manager.load("data/backgroundInicio.png",Texture.class);
		manager.load("data/backgroundmaingame.png",Texture.class);
		manager.load("data/backgroundstilyst.png",Texture.class);
		manager.load("data/backgroundquestmenu.png",Texture.class);
		manager.load("data/backgroundquestmenu2.png",Texture.class);
		manager.load("data/backgroundquestinfo.png",Texture.class);
		manager.load("data/backgroundminigame.png",Texture.class);
		manager.load("data/backgroundselectmap.png",Texture.class);
		//Carga de Botones
		manager.load("data/BotonesInicio.png",Texture.class);
		manager.load("data/basicbutton.png",Texture.class);
		manager.load("data/BotonPers.png",Texture.class);
		manager.load("data/BotonMapa.png",Texture.class);
		manager.load("data/BotonQuest.png",Texture.class);
		manager.load("data/BotonMiniG.png",Texture.class);
		manager.load("data/BotonConfig.png",Texture.class);
		manager.load("data/BotonMochila.png",Texture.class);
		//Carga de Fuentes
		manager.load("data/arial.fnt",BitmapFont.class);
	}
	
	public static LoadGamePage get_Instance(){
		return Loader;
	}
	
	public boolean update(){
		return manager.update();
	}
	
	public float progress(){
		return manager.getProgress();
	}
	
	public AssetManager get(){
		return manager;
	}
}
