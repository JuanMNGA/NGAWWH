package com.me.ngawwh;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MainGame implements ApplicationListener {
	private SpriteBatch batch;
	private Texture texturePrincipal;
	private Texture textureStylist;
	private Texture textureQuest;
	private Texture textureSelectQuest;
	private Texture textureMinigame;
	private Texture textureInfoChar;
	private Texture textureInventory;
	private Texture textureMap;
	private Texture textureOptions;
	private Texture buttonChar;
	private Texture buttonMap;
	private Texture buttonQuest;
	private boolean estilista;
	private boolean inicio;
	private boolean mapa;
	private boolean info;
	private boolean minigame;
	private boolean quest;
	private boolean questselect;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		texturePrincipal = new Texture(Gdx.files.internal("data/backgroundmaingame.png"));
		texturePrincipal.setFilter(TextureFilter.Linear, TextureFilter.Linear);
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
		buttonChar = new Texture(Gdx.files.internal("data/BotonPers.png"));
		buttonMap = new Texture(Gdx.files.internal("data/BotonMapa.png"));
		buttonQuest = new Texture(Gdx.files.internal("data/BotonQuest.png"));
		estilista = true;
		inicio = false;
		mapa = false;
		info = false;
		minigame = false;
		quest = false;
		questselect = false;
	}

	@Override
	public void dispose() {
		batch.dispose();
		texturePrincipal.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		estilista = false;
		inicio = true;
		batch.begin();
		if(estilista==true){
			batch.draw(textureStylist,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		}else{
		if(inicio==true){
			batch.draw(texturePrincipal,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
			batch.draw(buttonChar,Gdx.graphics.getWidth()*(0.45375f),Gdx.graphics.getHeight()*(0.53f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
			batch.draw(buttonMap,Gdx.graphics.getWidth()*(0.64f),Gdx.graphics.getHeight()*(0.53f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
			batch.draw(buttonQuest,Gdx.graphics.getWidth()*(0.825f),Gdx.graphics.getHeight()*(0.53f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		}
		if(mapa==true){
			batch.draw(textureMap,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		}
		if(info==true){
			batch.draw(textureInfoChar,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		}
		if(minigame==true){
			batch.draw(textureMinigame,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		}
		if(quest==true){
			batch.draw(textureQuest,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		}
		if(questselect==true){
			batch.draw(textureSelectQuest,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		}
		}
		batch.end();
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
