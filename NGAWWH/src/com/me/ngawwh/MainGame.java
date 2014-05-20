package com.me.ngawwh;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class MainGame extends Game implements InputProcessor {
	private OrthographicCamera camera;
	
	@Override
	public void create() {
		camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(this);
        Gdx.input.setCatchBackKey(true);
		Loader.get_Instance().Assign_MG(this);
		setScreen(Loader.get_Instance());
	}
	
	public OrthographicCamera Camara(){
		return camera;
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
		if(Gdx.app.getType() == ApplicationType.Android){
			if(this.getScreen().hashCode() != MainGamePage.get_Instance().hashCode() && this.getScreen().hashCode() != StartGamePage.get_Instance().hashCode() && this.getScreen().hashCode() != StylistGamePage.get_Instance().hashCode() && keycode == Keys.BACK){
				if(this.getScreen().hashCode() == QuestSelGamePage.get_Instance().hashCode() && keycode == Keys.BACK){
					setScreen(QuestGamePage.get_Instance());
				}else{
					setScreen(MainGamePage.get_Instance());
				}
			}else{
					setScreen(StartGamePage.get_Instance());
				//Gdx.input.setCatchBackKey(false);
			}
		}else{
			if(this.getScreen().hashCode() != MainGamePage.get_Instance().hashCode() && this.getScreen().hashCode() != StartGamePage.get_Instance().hashCode() && this.getScreen().hashCode() != StylistGamePage.get_Instance().hashCode() && keycode == Keys.BACKSPACE){
				if(this.getScreen().hashCode() == QuestSelGamePage.get_Instance().hashCode() && keycode == Keys.BACKSPACE){
					setScreen(QuestGamePage.get_Instance());
				}else{
					setScreen(MainGamePage.get_Instance());
				}
			}else{
				setScreen(StartGamePage.get_Instance());
				//Gdx.input.setCatchBackKey(false);
			}
		}
		return true;
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
	public boolean touchDown(int screenX, int screenY, int pointer, int button){
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
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
