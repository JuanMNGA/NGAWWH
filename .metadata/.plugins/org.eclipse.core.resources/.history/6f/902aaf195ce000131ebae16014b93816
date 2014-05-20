package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MiniGamePage implements Screen{
	private MainGame MG;
	private OrthographicCamera camera;
	private Texture textureMinigame;
	private SpriteBatch b;
	
	public MiniGamePage(MainGame mg, OrthographicCamera camera){
		this.camera = camera;
		camera.update();
		b = new SpriteBatch(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.setProjectionMatrix(camera.combined);
		textureMinigame = new Texture(Gdx.files.internal("data/backgroundminigame.png"));
		textureMinigame.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1); //Gdx es una clase con la que podemos acceder a variables que hacen referencia a todos los subsitemas, como son graficos, audio, ficheros, entrada y aplicaciones
		// gl es una variable de tipo GL, nos permite acceder a metodos de GL10, GL11 y GL20
		//En este caso glClearColor es un bucle (game loop) que establecera el fondo de la pantalla negro (0,0,0) con transparencia 1
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		b.begin();
		b.draw(textureMinigame,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
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
