package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	public Pikachu pikachu;
	private PiKaChuGame piKaChuGame;
	public WorldRenderer worldRenderer;
	public Element element;
	
	World (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		element = new Element();
		pikachu = new Pikachu(100, 100);
	}
	
	Pikachu getPikachu() {
		return pikachu;
	}
	
	public void update (float delta) {
        pikachu.update();
        element.update();
	}
}
