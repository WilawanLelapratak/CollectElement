package com.pikachu.game;

import java.util.Random;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Element {
	SpriteBatch batch;
	public Vector2 position;
	public Texture thunderImg;
	private static final int SPEED = 5;
	
	public Element () {
		thunderImg = new Texture("flash.png");
		float diameter = thunderImg.getWidth();
		Random rand = new Random();
		float x = rand.nextInt(PiKaChuGame.WIDTH - (int)diameter) + (diameter/2);
		position = new Vector2(x, PiKaChuGame.HEIGHT);
	}
	
//	public void draw() {
//		batch.draw(thunderImg, position.x, position.y);
//	}
	
	public void update() {
		position.y -= SPEED;
	}
}
