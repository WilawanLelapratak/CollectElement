package com.pikachu.game;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Pikachu {
	Random rand = new Random();
	public Vector2 position;
	public Texture piKaChuImg;
	private World world;
	public int pokemonType = 2;
	private int time = 0;
	public static final int DIRECTION_RIGHT = 2;
	public static final int DIRECTION_LEFT = 4;
	
	public Pikachu(int x, int y, World world) {
		this.world = world;
		genImg();
		position = new Vector2(x, y);
	}

	public Vector2 getPosition() {
		return position;
	}

	public void genPokemonType() {
		pokemonType = rand.nextInt(4);
	}
	
	public void genImg() {
		switch (pokemonType) {
			case 0 :
				piKaChuImg = new Texture("bakufun.png");
				break;
			case 1 :
				piKaChuImg = new Texture("cubone.png");
				break;
			case 2 :
				piKaChuImg = new Texture("pikachu.png");
				break;
			case 3 :
				piKaChuImg = new Texture("squirtle.png");
				break;
			default :
				break;
		}
	}
	
	public void update() {
		time++;
		if(time%1000 == 0 && time != 0) {
			genPokemonType();
			world.changingSound.play(1000000);
			genImg();
		}
		
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			position.x -= 5;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	position.x += 5;
        }
        checkFrame();
	}
	
	public void checkFrame() {
		if (position.x >= PiKaChuGame.WIDTH - piKaChuImg.getWidth()) {
			position.x = PiKaChuGame.WIDTH - piKaChuImg.getWidth();
		}
		if (position.x <= 0) {
			position.x = 0;
		}
	}
}
