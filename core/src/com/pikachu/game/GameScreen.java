package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	private PiKaChuGame piKaChuGame;
	private Texture piKaChuImg;
	private Texture bgImg;
	private Pikachu pikachu;
//	private int x;
//	private int y;
	private World world;
	private WorldRenderer worldRenderer;
	
	public GameScreen (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
//		piKaChuImg = new Texture("pikachu.png");
//		bgImg = new Texture("background.png");
//		pikachu = new Pikachu(100, 100);
		world = new World(piKaChuGame);
		worldRenderer = new WorldRenderer(piKaChuGame, world);
	}
	
	@Override
    public void render (float delta) {
//        SpriteBatch batch = piKaChuGame.batch;
        update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
//        batch.begin();
//        batch.draw(bgImg, 0, 0);
//        Vector2 pos = world.pikachu.getPosition();
//        batch.draw(piKaChuImg, pos.x, pos.y);
//        batch.end();
    }

	public void update (float delta) {
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            world.pikachu.move(Pikachu.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            world.pikachu.move(Pikachu.DIRECTION_RIGHT);
        }
	}
}
