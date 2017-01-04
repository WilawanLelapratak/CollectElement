package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;

public class Pikachu {
	private Vector2 position;
	public static final int DIRECTION_RIGHT = 2;
	public static final int DIRECTION_LEFT = 4;
	
	public Pikachu(int x, int y) {
		position = new Vector2(x, y);
	}

	public Vector2 getPosition() {
		return position;
	}

	public void update() {
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			position.x -= 5;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	position.x += 5;
        }
	}
}
