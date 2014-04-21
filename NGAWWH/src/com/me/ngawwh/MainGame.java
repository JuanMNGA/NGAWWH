package com.me.ngawwh;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game implements InputProcessor {
	private StartGamePage inicio;
	private MainGamePage principal;
	private MapGamePage mapas;
	private CharGamePage informacion;
	private QuestGamePage quest;
	private MiniGamePage minig;
	private InvGamePage invent;
	private ConfGamePage config;
	private Texture textureStylist;
	private Texture textureSelectQuest;
	private OrthographicCamera camera;
	
	@Override
	public void create() {
		camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(this);
        Gdx.input.setCatchBackKey(true);
        inicio = new StartGamePage(this,camera);
		principal = new MainGamePage(this,camera);
		mapas = new MapGamePage(this,camera);
		informacion = new CharGamePage(this,camera);
		quest = new QuestGamePage(this,camera);
		minig = new MiniGamePage(this,camera);
		invent = new InvGamePage(this,camera);
		config = new ConfGamePage(this,camera);
		/*
		textureStylist = new Texture(Gdx.files.internal("data/backgroundstilyst.png"));
		textureStylist.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureSelectQuest = new Texture(Gdx.files.internal("data/backgroundquestinfo.png"));
		textureSelectQuest.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		*/
		setScreen(inicio);
	}
	
	public void cambiarScreens(int i){
		switch(i){
		case 0: setScreen(principal); break;
		case 1: setScreen(informacion); break;
		case 2: setScreen(mapas); break;
		case 3: setScreen(quest); break;
		case 4: setScreen(minig); break;
		case 5: setScreen(invent); break;
		case 6: setScreen(config); break;
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
		if(this.getScreen().hashCode() != principal.hashCode() && keycode == Keys.BACK){
				setScreen(principal);
		}else{
			setScreen(inicio);
			//Gdx.input.setCatchBackKey(false);
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
