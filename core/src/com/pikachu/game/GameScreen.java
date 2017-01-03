package com.pikachu.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private PiKaChuGame piKaChuGame;
	private Texture piKaChuImg;
	
	public GameScreen (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		piKaChuImg = new Texture("pikachu.png");
	}
	
	@Override
    public void render(float delta) {
        SpriteBatch batch = piKaChuGame.batch;
        batch.begin();
        batch.draw(piKaChuImg, 100, 100);
        batch.end();
        
    }

}
