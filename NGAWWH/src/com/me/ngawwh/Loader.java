package com.me.ngawwh;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.TextureLoader.TextureParameter;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Loader implements Screen{
	public SpriteBatch b;
	private BitmapFont fuente;
	private MainGame mg;
	public MainGamePage principal = new MainGamePage();
	public StartGamePage inicio = new StartGamePage();
	public CharGamePage personaje = new CharGamePage();
	public ConfGamePage config = new ConfGamePage();
	public InvGamePage inventario = new InvGamePage();
	public MapGamePage mapa = new MapGamePage();
	public MiniGamePage minig = new MiniGamePage();
	public QuestGamePage quest = new QuestGamePage();
	public QuestSelGamePage questsel = new QuestSelGamePage();
	public StylistGamePage estilista = new StylistGamePage();
	public AssetManager manager = new AssetManager();
	private TextureParameter param = new TextureParameter();
	
	public Loader(){
		b = new SpriteBatch(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		param.genMipMaps = true;
		param.minFilter = TextureFilter.Nearest;
		//Carga de Backgrounds
		manager.load("data/backgroundInicio.png",Texture.class,param);
		manager.load("data/backgroundmaingame.png",Texture.class,param);
		manager.load("data/backgroundstilyst.png",Texture.class,param);
		manager.load("data/backgroundquestmenu.png",Texture.class,param);
		manager.load("data/backgroundquestmenu2.png",Texture.class,param);
		manager.load("data/backgroundquestinfo.png",Texture.class,param);
		manager.load("data/backgroundminigame.png",Texture.class,param);
		manager.load("data/backgroundselectmap.png",Texture.class,param);
		//Carga de Botones
		manager.load("data/BotonesInicio.png",Texture.class,param);
		manager.load("data/basicbutton.png",Texture.class,param);
		manager.load("data/BotonPers.png",Texture.class,param);
		manager.load("data/BotonMapa.png",Texture.class,param);
		manager.load("data/BotonQuest.png",Texture.class,param);
		manager.load("data/BotonMiniG.png",Texture.class,param);
		manager.load("data/BotonConfig.png",Texture.class,param);
		manager.load("data/BotonMochila.png",Texture.class,param);
		//Carga de Fuentes
		manager.load("data/arial.fnt",BitmapFont.class);
		fuente = new BitmapFont(Gdx.files.internal("data/arial.fnt"),Gdx.files.internal("data/arial.png"),false);
	}
	
	public void Assign_MG(MainGame MG){
		mg = MG;
	}

	@Override
	public void render(float delta) {
		if(manager.update()){
			inicio.load(mg, mg.Camara(),this);
			/*StylistGamePage.get_Instance().load(mg,mg.Camara());
			MainGamePage.get_Instance().load(mg,mg.Camara());
			CharGamePage.get_Instance().load(mg,mg.Camara());
			MapGamePage.get_Instance().load(mg,mg.Camara());
			MiniGamePage.get_Instance().load(mg,mg.Camara());
			QuestGamePage.get_Instance().load(mg,mg.Camara());
			QuestSelGamePage.get_Instance().load(mg,mg.Camara());
			InvGamePage.get_Instance().load(mg,mg.Camara());
			ConfGamePage.get_Instance().load(mg,mg.Camara());*/
			//Añadir el resto de loaders
			mg.setScreen(inicio);
		}else{
			Gdx.gl.glClearColor(0, 0, 0, 1);
			Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
			b.begin();
			fuente.draw(b,"Cargando...",20,40);
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
	}

}
