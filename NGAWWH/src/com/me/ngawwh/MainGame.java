package com.me.ngawwh;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game {
	private MainGamePage principal;
	private Texture textureStylist;
	private Texture textureQuest;
	private Texture textureSelectQuest;
	private Texture textureMinigame;
	private Texture textureInfoChar;
	private Texture textureInventory;
	private Texture textureMap;
	private Texture textureOptions;
	
	private boolean estilista;
	private boolean inicio;
	private boolean mapa;
	private boolean info;
	private boolean minigame;
	private boolean quest;
	private boolean questselect;
	
	@Override
	public void create() {
		principal = new MainGamePage();
		textureStylist = new Texture(Gdx.files.internal("data/backgroundstilyst.png"));
		textureStylist.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureQuest = new Texture(Gdx.files.internal("data/backgroundquestmenu.png"));
		textureQuest.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureSelectQuest = new Texture(Gdx.files.internal("data/backgroundquestinfo.png"));
		textureSelectQuest.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureMinigame = new Texture(Gdx.files.internal("data/backgroundminigame.png"));
		textureMinigame.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureInfoChar = new Texture(Gdx.files.internal("data/backgroundquestmenu.png"));
		textureInfoChar.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureInventory = new Texture(Gdx.files.internal("data/backgroundquestmenu.png"));
		textureInventory.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureMap = new Texture(Gdx.files.internal("data/backgroundselectmap.png"));
		textureMap.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureOptions = new Texture(Gdx.files.internal("data/backgroundstilyst.png"));
		textureOptions.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		estilista = true;
		inicio = false;
		mapa = false;
		info = false;
		minigame = false;
		quest = false;
		questselect = false;
		setScreen(principal);
	}

	@Override
	public void dispose() {
		principal.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		estilista = false;
		inicio = true;
		if(inicio){
			principal.render(0);
		}
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
