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
	private StartGamePage inicio;
	private MainGamePage principal;
	private MapGamePage mapas;
	private CharGamePage informacion;
	private QuestGamePage quest;
	private MiniGamePage minig;
	private InvGamePage invent;
	private ConfGamePage config;
	private StylistGamePage stylist;
	private QuestSelGamePage questsel;
	private OrthographicCamera camera;
	private boolean OnTouch;
	private boolean cargarObjetos = false;
	private SpriteBatch b;
	private BitmapFont fuente;
	
	@Override
	public void create() {
		OnTouch = false;
		b = new SpriteBatch();
		fuente = new BitmapFont(Gdx.files.internal("data/arial.fnt"), Gdx.files.internal("data/arial.png"), false);
		camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(this);
        Gdx.input.setCatchBackKey(true);
        inicio = new StartGamePage(this,camera);
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
		case 7: setScreen(stylist); break;
		case 8: setScreen(questsel); break;
		}
	}
	
	public boolean cargarDatos(){
		if(!cargarObjetos){
			principal = new MainGamePage(this,camera);
			mapas = new MapGamePage(this,camera);
			informacion = new CharGamePage(this,camera);
			quest = new QuestGamePage(this,camera);
			minig = new MiniGamePage(this,camera);
			invent = new InvGamePage(this,camera);
			config = new ConfGamePage(this,camera);
			stylist = new StylistGamePage(this,camera);
			questsel = new QuestSelGamePage(this,camera);
			cargarObjetos = true;
		}
		return cargarObjetos;
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
			if(this.getScreen().hashCode() != principal.hashCode() && this.getScreen().hashCode() != inicio.hashCode() && this.getScreen().hashCode() != stylist.hashCode() && keycode == Keys.BACK){
				if(this.getScreen().hashCode() == questsel.hashCode() && keycode == Keys.BACK){
					setScreen(quest);
				}else{
					setScreen(principal);
				}
			}else{
					setScreen(inicio);
				//Gdx.input.setCatchBackKey(false);
			}
		}else{
			if(this.getScreen().hashCode() != principal.hashCode() && this.getScreen().hashCode() != inicio.hashCode() && this.getScreen().hashCode() != stylist.hashCode() && keycode == Keys.BACKSPACE){
				if(this.getScreen().hashCode() == questsel.hashCode() && keycode == Keys.BACKSPACE){
					setScreen(quest);
				}else{
					setScreen(principal);
				}
			}else{
				setScreen(inicio);
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
		OnTouch = true;
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		if(OnTouch){
			OnTouch = false;
		Vector3 posicion = new Vector3(screenX, screenY, 0);
		camera.unproject(posicion);
		if(this.getScreen().hashCode() == principal.hashCode()){
			int puls = principal.botonPulsado(posicion.x,posicion.y);
			if(puls!=-1){
				this.cambiarScreens(puls);
			}
		}else{
			if(this.getScreen().hashCode() == quest.hashCode()){
				int puls = quest.botonPulsado(posicion.x,posicion.y);
				if(puls!=-1){
					this.cambiarScreens(puls);
				}
			}else{
				if(this.getScreen().hashCode() == inicio.hashCode()){
					int puls = inicio.botonPulsado(posicion.x,posicion.y);
					if(puls!=-1){
						if(puls==-2){
							Gdx.app.exit();
						}else{
							this.cambiarScreens(puls);
						}
					}
				}else{
					if(this.getScreen().hashCode() == questsel.hashCode()){
						int puls = questsel.botonPulsado(posicion.x,posicion.y);
						this.cambiarScreens(puls);
					}
				}
			}
		}
		}
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
