package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	public Pikachu pikachu;
	private PiKaChuGame piKaChuGame;
	public WorldRenderer worldRenderer;
	public Element [] elements;
	private int score = 0;
	
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
        	if (elements[i].position.x > pikachu.position.x - ((2*elements[i].thunderImg.getWidth())/3)
        			&& elements[i].position.x < pikachu.position.x + ((2*pikachu.piKaChuImg.getWidth())/3)
        			&& elements[i].position.y <  pikachu.position.y + ((2*pikachu.piKaChuImg.getHeight())/3)
        			&& elements[i].position.y > pikachu.position.y - ((2*elements[i].thunderImg.getHeight())/3)) {
        		elements[i] = new Element();
        		score++;
        		System.out.println(score);
        	}
        }
	}
}
