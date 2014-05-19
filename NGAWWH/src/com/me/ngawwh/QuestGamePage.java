package com.me.ngawwh;

import java.util.*;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class QuestGamePage implements Screen{
	
	private MainGame MG;
	private OrthographicCamera camera;
	private Texture textureQuest;
	private Texture textureQuest2;
	private Texture textButton;
	private SpriteBatch b;
	private BitmapFont fuente;
	private ArrayList<Quest> Misiones;
	private float xTextos;
	private float[] yTextos;
	
	public QuestGamePage(MainGame mg, OrthographicCamera camera){
		MG = mg;
		this.camera = camera;
		camera.update();
		b = new SpriteBatch(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.setProjectionMatrix(camera.combined);
		textureQuest = new Texture(Gdx.files.internal("data/backgroundquestmenu.png"));
		textureQuest.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textureQuest2 = new Texture(Gdx.files.internal("data/backgroundquestmenu2.png"));
		textureQuest2.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		textButton = new Texture(Gdx.files.internal("data/basicbutton.png"));
		textButton.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		Misiones = new ArrayList<Quest>();
		cargarMisiones();
		fuente = new BitmapFont(Gdx.files.internal("data/arial.fnt"), Gdx.files.internal("data/arial.png"), false);
		xTextos = Gdx.graphics.getWidth()*(0.15f);
		yTextos = new float[20];
		//Coordenadas Y de los nombres de las quests
		yTextos[0] = Gdx.graphics.getHeight()*(0.9f);
	}
	
	public int botonPulsado(float x, float y){
		return 8;
	}
	
	private void cargarMisiones(){
		for(int i=0;i<20;i++){
			Misiones.add(new Quest());
		}
		//Misiones de Raconda
		Misiones.get(0).set_Nombre("En un dia de verano.");
		Misiones.get(0).set_Contenido("Te levantas una mañana, con el cuerpo pesado, estás en la calle, sin dinero, y con algo de comida en un bolsillo.\nAlguien te ve, grita y sale corriendo. Sales de tu pequeño sueño, entre un mar de sangre y un cuerpo degollado a tu lado.\nEsa persona alertó a los guardas, debes escapar de la ciudad.");
		//Misiones de Silfides
		//Misiones de Krevacheg
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1); //Gdx es una clase con la que podemos acceder a variables que hacen referencia a todos los subsitemas, como son graficos, audio, ficheros, entrada y aplicaciones
		// gl es una variable de tipo GL, nos permite acceder a metodos de GL10, GL11 y GL20
		//En este caso glClearColor es un bucle (game loop) que establecera el fondo de la pantalla negro (0,0,0) con transparencia 1
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		fuente.setScale(0.7f);
		b.begin();
		b.draw(textureQuest,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		b.draw(textButton,Gdx.graphics.getWidth()*(0.06f),Gdx.graphics.getHeight()*(0.8f),Gdx.graphics.getWidth()*(0.9f),Gdx.graphics.getHeight()*(0.15f));
		fuente.draw(b,Misiones.get(0).get_Nombre(),xTextos,yTextos[0]);
		b.draw(textureQuest2,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
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
