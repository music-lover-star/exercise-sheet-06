package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet06.homework.exercise2;

import de.hamstersimulator.objectsfirst.external.model.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class AmazingPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new AmazingPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public AmazingPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/AmazingPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Ignore this method.<br>
	 * Put your code in passTheMaze()!
	 */
	@Override
	protected void run() {
		passTheMaze();
	}

	void passTheMaze() {
		// solve the maze here
	}
}
