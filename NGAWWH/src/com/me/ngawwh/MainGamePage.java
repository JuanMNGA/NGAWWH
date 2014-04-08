package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class MainGamePage implements Screen{
	private OrthographicCamera camera;
	private MainGame MG;
	private SpriteBatch b;
	private Texture texturePrincipal, buttonChar, buttonMap, buttonQuest, buttonMini, buttonConf, buttonInv;
	private Rectangle r_pers, r_map, r_quest, r_game, r_conf, r_inv;
	private float alt1, alt2, anch1, anch2, anch3;
	private Vector2 AspectRatio;
	
	public MainGamePage(MainGame mg, OrthographicCamera camera){
		this.camera = camera;
		camera.update();
		anch1 = Gdx.graphics.getWidth()*(0.45375f);
		anch2 = Gdx.graphics.getWidth()*(0.64f);
		anch3 = Gdx.graphics.getWidth()*(0.825f);
		alt1 = Gdx.graphics.getHeight()*(0.53f);
		alt2 = Gdx.graphics.getHeight()*(0.07f);
		AspectRatio = new Vector2(Gdx.graphics.getWidth()*(0.1625f),(Gdx.graphics.getHeight()*(0.42f)));
		MG = mg;
		b = new SpriteBatch(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.setProjectionMatrix(camera.combined);
		texturePrincipal = new Texture(Gdx.files.internal("data/backgroundmaingame.png"));
		texturePrincipal.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		buttonChar = new Texture(Gdx.files.internal("data/BotonPers.png"));
		buttonMap = new Texture(Gdx.files.internal("data/BotonMapa.png"));
		buttonQuest = new Texture(Gdx.files.internal("data/BotonQuest.png"));
		buttonMini = new Texture(Gdx.files.internal("data/BotonMiniG.png"));
		buttonConf = new Texture(Gdx.files.internal("data/BotonConfig.png"));
		buttonInv = new Texture(Gdx.files.internal("data/BotonMochila.png"));
		r_pers = new Rectangle(anch1,alt1,AspectRatio.x,AspectRatio.y);
		r_map = new Rectangle(anch2,alt1,AspectRatio.x,AspectRatio.y);
		r_quest = new Rectangle(anch3,alt1,AspectRatio.x,AspectRatio.y);
		r_game = new Rectangle(anch1,alt2,AspectRatio.x,AspectRatio.y);
		r_inv = new Rectangle(anch2,alt2,AspectRatio.x,AspectRatio.y);
		r_conf = new Rectangle(anch3,alt2,AspectRatio.x,AspectRatio.y);
	}
	
	public void dispose(){
	}

	@Override
	public void render(float delta) {
		if(Gdx.input.isTouched()){
			Vector3 posicion = new Vector3(Gdx.input.getX(),Gdx.input.getY(),0);
			camera.unproject(posicion);
			if(r_pers.contains(posicion.x, posicion.y)){
				MG.cambiarScreens(1);
			}
			if(r_map.contains(posicion.x, posicion.y)){
				MG.cambiarScreens(2);
			}
			if(r_quest.contains(posicion.x, posicion.y)){
				MG.cambiarScreens(3);
			}
			if(r_game.contains(posicion.x, posicion.y)){
				MG.cambiarScreens(4);
			}
			if(r_inv.contains(posicion.x, posicion.y)){
				MG.cambiarScreens(5);
			}
			if(r_conf.contains(posicion.x, posicion.y)){
				MG.cambiarScreens(6);
			}
		}
		Gdx.gl.glClearColor(0, 0, 0, 1); //Gdx es una clase con la que podemos acceder a variables que hacen referencia a todos los subsitemas, como son graficos, audio, ficheros, entrada y aplicaciones
		// gl es una variable de tipo GL, nos permite acceder a metodos de GL10, GL11 y GL20
		//En este caso glClearColor es un bucle (game loop) que establecera el fondo de la pantalla negro (0,0,0) con transparencia 1
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		b.begin();
		b.draw(texturePrincipal,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.draw(buttonChar,anch1,alt1,AspectRatio.x,AspectRatio.y);
		b.draw(buttonMap,anch2,alt1,AspectRatio.x,AspectRatio.y);
		b.draw(buttonQuest,anch3,alt1,AspectRatio.x,AspectRatio.y);
		b.draw(buttonMini,anch1,alt2,AspectRatio.x,AspectRatio.y);
		b.draw(buttonInv, anch2, alt2,AspectRatio.x,AspectRatio.y);
		b.draw(buttonConf, anch3,alt2,AspectRatio.x,AspectRatio.y);
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
