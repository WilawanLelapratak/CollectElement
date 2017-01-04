package com.pikachu.game;

import com.badlogic.gdx.graphics.Texture;

public class Cycle {
	public Texture [] elementImgs;
	public Texture [] showImgs;
	
	public Cycle (int pokemonType) {
		elementImgs = new Texture[] {new Texture("fire.png"), new Texture("ground.png"), new Texture("flash.png"), new Texture("water.png")};
		genImg(pokemonType);
	}
	
	public void genImg(int pokemonType) {
		int increaseHP;
		int decreaseHP;
		if (1 + pokemonType < elementImgs.length) {
			increaseHP = 1 + pokemonType;
		}
		else {
			increaseHP = -3 + pokemonType;
		}
		if (-1 + pokemonType >= 0) {
			decreaseHP = -1 + pokemonType;
		}
		else {
			decreaseHP = 3 + pokemonType;
		}
		showImgs = new Texture[] {elementImgs[pokemonType],elementImgs[increaseHP],elementImgs[decreaseHP]};
	}
}
