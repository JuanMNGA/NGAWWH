package com.me.ngawwh;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class MainGame extends Game implements InputProcessor {
	private OrthographicCamera camera;
	private Loader load;
	
	@Override
	public void create() {
		load  = new Loader();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(this);
        Gdx.input.setCatchBackKey(true);
		load.Assign_MG(this);
		setScreen(load);
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
			if(this.getScreen().hashCode() != load.principal.hashCode() && this.getScreen().hashCode() != load.inicio.hashCode() && this.getScreen().hashCode() != load.estilista.hashCode() && keycode == Keys.BACK){
				if(this.getScreen().hashCode() == load.questsel.hashCode() && keycode == Keys.BACK){
					setScreen(load.quest);
				}else{
					setScreen(load.principal);
				}
			}else{
					setScreen(load.inicio);
				//Gdx.input.setCatchBackKey(false);
			}
		}else{
			if(this.getScreen().hashCode() != load.principal.hashCode() && this.getScreen().hashCode() != load.inicio.hashCode() && this.getScreen().hashCode() != load.estilista.hashCode() && keycode == Keys.BACKSPACE){
				if(this.getScreen().hashCode() == load.questsel.hashCode() && keycode == Keys.BACKSPACE){
					setScreen(load.quest);
				}else{
					setScreen(load.principal);
				}
			}else{
					setScreen(load.inicio);
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
