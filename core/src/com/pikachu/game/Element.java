package com.pikachu.game;

import java.util.Random;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Element {
	SpriteBatch batch;
	Random rand = new Random();
	public Vector2 position;
	public int elementType;
	public Texture elementImg;
	public boolean outOfFrame = false;
	private int speed = rand.nextInt(5) + 2;
	
	public Element () {
		genElementType();
		genImg();
		float diameter = elementImg.getWidth();
		float x = rand.nextInt(PiKaChuGame.WIDTH - (int)diameter) + (diameter/2);
		position = new Vector2(x, PiKaChuGame.HEIGHT);
	}
	
	public void update() {
		position.y -= speed;
		checkframe();
	}
	
	public void genElementType() {
		elementType = rand.nextInt(4);
	}
	
	public void genImg() {
		switch (elementType) {
			case 0 :
				elementImg = new Texture("fire.png");
				break;
			case 1 :
				elementImg = new Texture("ground.png");
				break;
			case 2 :
				elementImg = new Texture("flash.png");
				break;
			case 3 :
				elementImg = new Texture("water.png");
				break;
			default :
				break;
		}
	}
	
	public void checkframe() {
		float diameter = elementImg.getHeight();
		if (position.y < -diameter) {
			outOfFrame = true;
		}
	}
}
