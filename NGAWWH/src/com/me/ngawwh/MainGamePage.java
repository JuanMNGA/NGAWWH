package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGamePage implements Screen{
	private SpriteBatch b;
	private Texture texturePrincipal;
	private Texture buttonChar;
	private Texture buttonMap;
	private Texture buttonQuest;
	private Texture buttonMini;
	private Texture buttonConf;
	private Texture buttonInv;
	
	public MainGamePage(){
		b = new SpriteBatch();
		texturePrincipal = new Texture(Gdx.files.internal("data/backgroundmaingame.png"));
		texturePrincipal.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		buttonChar = new Texture(Gdx.files.internal("data/BotonPers.png"));
		buttonMap = new Texture(Gdx.files.internal("data/BotonMapa.png"));
		buttonQuest = new Texture(Gdx.files.internal("data/BotonQuest.png"));
		buttonMini = new Texture(Gdx.files.internal("data/BotonMiniG.png"));
		buttonConf = new Texture(Gdx.files.internal("data/BotonConfig.png"));
		buttonInv = new Texture(Gdx.files.internal("data/BotonMochila.png"));
	}
	
	public void dispose(){
		texturePrincipal.dispose();
	}

	@Override
	public void render(float delta) {
		b.begin();
		b.draw(texturePrincipal,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.draw(buttonChar,Gdx.graphics.getWidth()*(0.45375f),Gdx.graphics.getHeight()*(0.53f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		b.draw(buttonMap,Gdx.graphics.getWidth()*(0.64f),Gdx.graphics.getHeight()*(0.53f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		b.draw(buttonQuest,Gdx.graphics.getWidth()*(0.825f),Gdx.graphics.getHeight()*(0.53f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		b.draw(buttonMini,Gdx.graphics.getWidth()*(0.45375f),Gdx.graphics.getHeight()*(0.07f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		b.draw(buttonInv, Gdx.graphics.getWidth()*(0.64f), Gdx.graphics.getHeight()*(0.07f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		b.draw(buttonConf, Gdx.graphics.getWidth()*(0.825f),Gdx.graphics.getHeight()*(0.07f),(Gdx.graphics.getWidth()*(0.1625f)),(Gdx.graphics.getHeight()*(0.42f)));
		b.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

}