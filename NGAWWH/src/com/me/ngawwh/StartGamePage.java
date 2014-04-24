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
	
	public StartGamePage(MainGame mg, OrthographicCamera camera){
		MG = mg;
		this.camera = camera;
		camera.update();
		b = new SpriteBatch(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.setProjectionMatrix(camera.combined);
		textureStartGame = new Texture(Gdx.files.internal("data/backgroundInicio.png"));
		textureStartGame.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		textureNew = new Texture(Gdx.files.internal("data/BotonesInicio.png"));
		textureNew.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		textureCont = new Texture(Gdx.files.internal("data/BotonesInicio.png"));
		textureCont.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		textureExit = new Texture(Gdx.files.internal("data/BotonesInicio.png"));
		textureExit.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		pos1x = Gdx.graphics.getWidth()*(0.1125f);
		pos2x = Gdx.graphics.getWidth()*(0.375f);
		pos3x = Gdx.graphics.getWidth()*(0.6375f);
		pos1y = pos2y = pos3y = Gdx.graphics.getHeight()*(0.125f);
		tamx = Gdx.graphics.getWidth()*(0.25f);
		tamy = Gdx.graphics.getHeight()*(0.25f);
		r_New = new Rectangle(pos1x,pos1y,tamx,tamy);
		r_Cont = new Rectangle(pos2x,pos2y,tamx,tamy);
		r_Exit = new Rectangle(pos3x,pos3y,tamx,tamy);
		fuente = new BitmapFont(Gdx.files.internal("data/arial.fnt"), Gdx.files.internal("data/arial.png"), false);
	}
	
	public int botonPulsado(float x, float y){
		if(r_New.contains(x,y)){
			return 7;
		}
		if(r_Cont.contains(x,y)){
			return 0;
		}
		if(r_Exit.contains(x,y)){
			return -2;
		}else{
			return -1;
		}
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1); //Gdx es una clase con la que podemos acceder a variables que hacen referencia a todos los subsitemas, como son graficos, audio, ficheros, entrada y aplicaciones
		// gl es una variable de tipo GL, nos permite acceder a metodos de GL10, GL11 y GL20
		//En este caso glClearColor es un bucle (game loop) que establecera el fondo de la pantalla negro (0,0,0) con transparencia 1
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
