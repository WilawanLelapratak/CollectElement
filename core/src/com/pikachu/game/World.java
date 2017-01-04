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
	
	Pikachu getPikachu () {
		return pikachu;
	}
	
	public void update (float delta) {
        pikachu.update();
        updateElements();
	}
	
	public void updateElements () {
		for (int i = 0; i < elements.length; i++) {
        	elements[i].update();
        	if (elements[i].outOfFrame) {
				elements[i] = new Element();
			}
        	if (elements[i].position.x > pikachu.position.x - elements[i].thunderImg.getWidth()) {
        		elements[i] = new Element();
        	}
        	if (elements[i].position.x < pikachu.position.x + pikachu.piKaChuImg.getWidth()) {
        		elements[i] = new Element();
        	}
//        	if (elements[i].position.y <  pikachu.position.y + pikachu.piKaChuImg.getHeight()) {
//        		elements[i] = new Element();
//        	}
//        	if (elements[i].position.y > pikachu.position.y - elements[i].thunderImg.getHeight()) {
//        		elements[i] = new Element();
//        	}
        }
	}
}
