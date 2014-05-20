package com.me.ngawwh;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class LoadGamePage {
	private AssetManager manager = new AssetManager();
	private static LoadGamePage Loader = new LoadGamePage();
	private TextureParameter param = new TextureParameter();
	
	private LoadGamePage(){
		param.genMipMaps = true;
		param.minFilter = TextureFilter.Nearest;
		//Carga de Backgrounds
		manager.load("data/backgroundInicio.png",Texture.class,param);
		manager.load("data/backgroundmaingame.png",Texture.class,param);
		manager.load("data/backgroundstilyst.png",Texture.class,param);
		manager.load("data/backgroundquestmenu.png",Texture.class,param);
		manager.load("data/backgroundquestmenu2.png",Texture.class,param);
		manager.load("data/backgroundquestinfo.png",Texture.class,param);
		manager.load("data/backgroundminigame.png",Texture.class,param);
		manager.load("data/backgroundselectmap.png",Texture.class,param);
		//Carga de Botones
		manager.load("data/BotonesInicio.png",Texture.class,param);
		manager.load("data/basicbutton.png",Texture.class,param);
		manager.load("data/BotonPers.png",Texture.class,param);
		manager.load("data/BotonMapa.png",Texture.class,param);
		manager.load("data/BotonQuest.png",Texture.class,param);
		manager.load("data/BotonMiniG.png",Texture.class,param);
		manager.load("data/BotonConfig.png",Texture.class,param);
		manager.load("data/BotonMochila.png",Texture.class,param);
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
