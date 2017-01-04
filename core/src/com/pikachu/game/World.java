package com.pikachu.game;

public class World {
	public Pikachu pikachu;
	private PiKaChuGame piKaChuGame;
	
	World (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		
		pikachu = new Pikachu(100, 100);
	}
	
	Pikachu getPikachu() {
		return pikachu;
	}
}
