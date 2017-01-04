package com.pikachu.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private PiKaChuGame piKaChuGame;
	private Texture piKaChuImg;
	private Texture bgImg;
	private World world;
	SpriteBatch batch;
	
	public WorldRenderer(PiKaChuGame piKaChuGame, World world) {
		this.piKaChuGame = piKaChuGame;
		batch = piKaChuGame.batch;
		
		this.world = world;
		this.world.worldRenderer = this;
//		thunderImg = new Texture("flash.png");
		bgImg = new Texture("background.png");
		piKaChuImg = new Texture("pikachu.png");
		
	}
	
	public void render (float delta) {
		batch.begin();
        batch.draw(bgImg, 0, 0);
        Vector2 pos = world.pikachu.getPosition();
        batch.draw(piKaChuImg, pos.x, pos.y);
        drawElement();
        batch.end();
	}
	
	public void drawElement() {
		batch.draw(world.element.thunderImg, world.element.position.x, world.element.position.y);
	}

}
