package com.pikachu.game;

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
	
	public void move (int dir) {
		switch(dir) {
		case DIRECTION_RIGHT :
			position.x += 5;
			break;
		case DIRECTION_LEFT :
			position.x -= 5;
		}
	}
}
