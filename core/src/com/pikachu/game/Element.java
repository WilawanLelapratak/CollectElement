package com.pikachu.game;

import java.util.Random;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Element {
	SpriteBatch batch;
	Random rand = new Random();
	public Vector2 position;
	public Texture thunderImg;
	public boolean outOfFrame = false;
	private int speed = rand.nextInt(5) + 2;
	
	public Element () {
		thunderImg = new Texture("flash.png");
		float diameter = thunderImg.getWidth();
		float x = rand.nextInt(PiKaChuGame.WIDTH - (int)diameter) + (diameter/2);
		position = new Vector2(x, PiKaChuGame.HEIGHT);
	}
	
	public void update() {
		position.y -= speed;
		checkframe();
	}
	
	public void checkframe() {
		float diameter = thunderImg.getHeight();
		if (position.y < -diameter) {
			outOfFrame = true;
		}
	}
}
