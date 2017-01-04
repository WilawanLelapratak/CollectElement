package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	public Pikachu pikachu;
	private PiKaChuGame piKaChuGame;
	public WorldRenderer worldRenderer;
	public Element [] elements;
	
	World (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		elements = new Element[4];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = new Element();
		}
		
		pikachu = new Pikachu(100, 100);
	}
	
	Pikachu getPikachu() {
		return pikachu;
	}
	
	public void update (float delta) {
        pikachu.update();
        for (int i = 0; i < elements.length; i++) {
        	elements[i].update();
        }
	}
}
