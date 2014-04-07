package com.me.ngawwh;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game implements InputProcessor {
	private MainGamePage principal;
	private MapGamePage mapas;
	private Texture textureStylist;
	private Texture textureQuest;
	private Texture textureSelectQuest;
	private Texture textureMinigame;
	private Texture textureInfoChar;
	private Texture textureInventory;
	private Texture textureOptions;
	
	@Override
	public void create() {
		Gdx.input.setInputProcessor(this);
        Gdx.input.setCatchBackKey(true);
		principal = new MainGamePage(this);
		mapas = new MapGamePage(this);
		/*
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
		textureOptions = new Texture(Gdx.files.internal("data/backgroundstilyst.png"));
		textureOptions.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		*/
		setScreen(principal);
	}
	
	public void cambiarScreens(int i){
		switch(i){
		case 0: setScreen(principal); break;
		case 1: setScreen(mapas); break;
		}
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public boolean keyDown(int keycode) {
		if(this.getScreen().hashCode() != principal.hashCode()){
			if(keycode == Keys.BACK){
				setScreen(principal);
			}
		}else{
			Gdx.input.setCatchBackKey(false);
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}
