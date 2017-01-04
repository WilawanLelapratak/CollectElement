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
	private World world;
	private WorldRenderer worldRenderer;
	
	
	public GameScreen (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		world = new World(piKaChuGame);
		worldRenderer = new WorldRenderer(piKaChuGame, world);
	}
	
	@Override
    public void render (float delta) {
        world.update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
    }

	
}
