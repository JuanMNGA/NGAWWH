package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class QuestSelGamePage implements Screen{
	
	private static QuestSelGamePage pagina = new QuestSelGamePage();
	
	private OrthographicCamera camera;
	private Texture textureQuestSel;
	private SpriteBatch b;
	private MainGame MG;
	
	private QuestSelGamePage(){}
	
	public static QuestSelGamePage get_Instance(){
		return pagina;
	}
	
	public void load(MainGame mg, OrthographicCamera camera){
		MG = mg;
		this.camera = camera;
		camera.update();
		b = new SpriteBatch(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.setProjectionMatrix(camera.combined);
		textureQuestSel = new Texture(Gdx.files.internal("data/backgroundquestinfo.png"));
		textureQuestSel.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	}
	
	public void contains(float x, float y){
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		b.begin();
		b.draw(textureQuestSel,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
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
