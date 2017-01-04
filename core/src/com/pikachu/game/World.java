package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	public Pikachu pikachu;
	private PiKaChuGame piKaChuGame;
	public WorldRenderer worldRenderer;
	public Element [] elements;
	public int score;
	public static final int MAXHP = 100;
	public int hp;
	
	World (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		gameset();
	}
	
	Pikachu getPikachu () {
		return pikachu;
	}
	
	public void update (float delta) {
		if (hp > 0) {
        	pikachu.update();
        	updateElements();
		}
		else {
			restart();
		}
	}
	
	public void restart () {
		if (Gdx.input.isKeyPressed(Keys.SPACE)) {
			gameset();
		}
	}
	
	public void gameset() {
		hp = MAXHP;
		score = 0;
		elements = new Element[4];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = new Element();
		}
		
		pikachu = new Pikachu(((piKaChuGame.WIDTH/2) - 35), 100);
	}
	
	public void updateElements () {
		for (int i = 0; i < elements.length; i++) {
        	elements[i].update();
        	if (elements[i].outOfFrame) {
				elements[i] = new Element();
			}
        	if (elements[i].position.x > pikachu.position.x - ((2*elements[i].elementImg.getWidth())/3)
        			&& elements[i].position.x < pikachu.position.x + ((2*pikachu.piKaChuImg.getWidth())/3)
        			&& elements[i].position.y <  pikachu.position.y + ((2*pikachu.piKaChuImg.getHeight())/3)
        			&& elements[i].position.y > pikachu.position.y - ((2*elements[i].elementImg.getHeight())/3)) {
        		if (elements[i].elementType == pikachu.pokemonType) {
        			score++;
        		}
        		else if ((elements[i].elementType - pikachu.pokemonType) == 1) {
        			score += 2;
        		}
        		else if ((elements[i].elementType - pikachu.pokemonType) == -1) {
        			score--;
        			hp -= MAXHP/5;
        		}
        		elements[i] = new Element();
        	}
        }
	}
}
