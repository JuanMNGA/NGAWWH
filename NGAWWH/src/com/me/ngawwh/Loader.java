package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Loader implements Screen{
	private static Loader carga = new Loader();
	private SpriteBatch b;
	private BitmapFont fuente;
	private MainGame mg;
	
	private Loader(){
		b = new SpriteBatch();
		fuente = new BitmapFont(Gdx.files.internal("data/arial.fnt"), Gdx.files.internal("data/arial.png"), false);
	}
	
	public static Loader get_Instance(){
		return carga;
	}
	
	public void Assign_MG(MainGame MG){
		mg = MG;
	}

	@Override
	public void render(float delta) {
		if(LoadGamePage.get_Instance().get().update()){
			StartGamePage.get_Instance().load(mg, mg.Camara());
			StylistGamePage.get_Instance().load(mg,mg.Camara());
			MainGamePage.get_Instance().load(mg,mg.Camara());
			CharGamePage.get_Instance().load(mg,mg.Camara());
			MapGamePage.get_Instance().load(mg,mg.Camara());
			MiniGamePage.get_Instance().load(mg,mg.Camara());
			QuestGamePage.get_Instance().load(mg,mg.Camara());
			QuestSelGamePage.get_Instance().load(mg,mg.Camara());
			InvGamePage.get_Instance().load(mg,mg.Camara());
			ConfGamePage.get_Instance().load(mg,mg.Camara());
			//Añadir el resto de loaders
			mg.setScreen(StartGamePage.get_Instance());
		}else{
			Gdx.gl.glClearColor(0, 0, 0, 1);
			Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
			b.begin();
			fuente.draw(b,"Cargando..."+String.valueOf(LoadGamePage.get_Instance().progress()*100)+"%",20,40);
			b.end();
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
