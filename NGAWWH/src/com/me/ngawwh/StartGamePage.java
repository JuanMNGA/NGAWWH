package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class StartGamePage implements Screen{
	
	private OrthographicCamera camera;
	private Texture textureStartGame;
	private Texture textureNew;
	private Texture textureCont;
	private Texture textureExit;
	private SpriteBatch b;
	private MainGame MG;
	private float pos1x, pos1y, pos2x, pos2y, pos3x, pos3y, tamx, tamy;
	private Rectangle r_New, r_Cont, r_Exit;
	private BitmapFont fuente;
	private Loader load;
	
	public StartGamePage(){}
	
	public void load(MainGame mg, OrthographicCamera camera, Loader load){
		MG = mg;
		this.load = load;
		this.camera = camera;
		camera.update();
		b = load.b;
		b.setProjectionMatrix(camera.combined);
		textureStartGame = load.manager.get("data/backgroundInicio.png",Texture.class);
		textureNew = load.manager.get("data/BotonesInicio.png",Texture.class);
		textureCont = load.manager.get("data/BotonesInicio.png",Texture.class);
		textureExit = load.manager.get("data/BotonesInicio.png",Texture.class);
		pos1x = Gdx.graphics.getWidth()*(0.1125f);
		pos2x = Gdx.graphics.getWidth()*(0.375f);
		pos3x = Gdx.graphics.getWidth()*(0.6375f);
		pos1y = pos2y = pos3y = Gdx.graphics.getHeight()*(0.125f);
		tamx = Gdx.graphics.getWidth()*(0.25f);
		tamy = Gdx.graphics.getHeight()*(0.25f);
		r_New = new Rectangle(pos1x,pos1y,tamx,tamy);
		r_Cont = new Rectangle(pos2x,pos2y,tamx,tamy);
		r_Exit = new Rectangle(pos3x,pos3y,tamx,tamy);
		fuente = load.manager.get("data/arial.fnt",BitmapFont.class);
		if(!load.estilista.isLoad())
			load.estilista.load(MG,MG.Camara(),load);
		if(!load.principal.isLoad())
			load.principal.load(MG,MG.Camara(),load);
	}
	
	public void contains(float x, float y){
		if(r_New.contains(x,y)){
			MG.setScreen(load.estilista);
		}
		if(r_Cont.contains(x,y)){
			MG.setScreen(load.principal);
		}
		if(r_Exit.contains(x,y)){
			Gdx.app.exit();
		}
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		b.begin();
		b.draw(textureStartGame,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.draw(textureNew, pos1x, pos1y, tamx, tamy);
		b.draw(textureCont, pos2x, pos2y, tamx, tamy);
		b.draw(textureExit, pos3x, pos3y, tamx, tamy);
		fuente.setColor(Color.WHITE);
		fuente.draw(b,"Nuevo",pos1x+(Gdx.graphics.getWidth()*(0.07f)),pos1y+(Gdx.graphics.getHeight()*(0.16f)));
		fuente.draw(b,"Continuar",pos2x+(Gdx.graphics.getWidth()*(0.04f)),pos2y+(Gdx.graphics.getHeight()*(0.16f)));
		fuente.draw(b,"Salir",pos3x+(Gdx.graphics.getWidth()*(0.08f)),pos3y+(Gdx.graphics.getHeight()*(0.16f)));
		b.end();
		if(Gdx.input.justTouched()){
			Vector3 posicion = new Vector3(Gdx.input.getX(),Gdx.input.getY(),0);
			camera.unproject(posicion);
			contains(posicion.x,posicion.y);
		}
		
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

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
