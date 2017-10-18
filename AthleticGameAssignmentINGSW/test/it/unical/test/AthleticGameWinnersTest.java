/**
 * 
 */
package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

/**
 * @author andre
 *
 */
public class AthleticGameWinnersTest {

	private static AthleticGame game;

	@BeforeClass
	public static void initialize() {
		game = new AthleticGame("staffetta");
	}

	@Before
	public void start(){
		game.start();
	}
	
	@After
	public void reset(){
		game.reset();
	}
	
	@Test
	public void getWinnerTest1(){
		game.addArrival("francesco", Instant.now().plusMillis(1000));
		game.addArrival("ciccio", Instant.now().plusMillis(2000));
		game.addArrival("pinario", Instant.now().plusMillis(3000));
		
		Assert.assertNotEquals(null, game.getWinner());
	}
	
	@Test 
	public void getWinnerTest2(){
		game.addArrival("francesco", Instant.now().plusMillis(1000));
		game.addArrival("ciccio", Instant.now().plusMillis(2000));
		game.addArrival("pinario", Instant.now().plusMillis(3000));
		
		Assert.assertNotEquals(game.getParecipiantTime("francesco"),game.getWinner());
	}
	
}
