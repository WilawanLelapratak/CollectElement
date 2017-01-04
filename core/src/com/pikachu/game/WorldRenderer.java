package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private PiKaChuGame piKaChuGame;
	private Texture bgImg;
	private World world;
	private SpriteBatch batch;
	private BitmapFont font = new BitmapFont(Gdx.files.internal("endDetailArcade.fnt"));
	
	public WorldRenderer(PiKaChuGame piKaChuGame, World world) {
		this.piKaChuGame = piKaChuGame;
		batch = piKaChuGame.batch;
		this.world = world;
		this.world.worldRenderer = this;
		bgImg = new Texture("background.png");
		
	}
	
	public void render (float delta) {
		batch.begin();
        batch.draw(bgImg, 0, 0);
        font.draw(batch,  "SCORE : " + world.score, 10, 50);
        Vector2 pos = world.pikachu.getPosition();
        drawElement();
        drawPokemon();
        batch.end();
	}
	
	public void drawElement() {
		for (int i = 0; i < world.elements.length; i++) {
			batch.draw(world.elements[i].thunderImg, world.elements[i].position.x, world.elements[i].position.y);
		}
	}
	
	public void drawPokemon() {
		batch.draw(world.pikachu.piKaChuImg, world.pikachu.position.x, world.pikachu.position.y);
	}
}
