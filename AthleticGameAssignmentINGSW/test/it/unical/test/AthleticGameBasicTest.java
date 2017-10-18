package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame game;

	@BeforeClass
	public static void initialize() {
		game = new AthleticGame("staffetta");
	}

	// test per testare il metodo addArrival(String participant, Instant
	// arrival). In questo test verificare che, aggiungendo un nuovo arrivo, la
	// taglia della mappa arrivals diventi pari ad 1
	@Test
	public void addArrivalTest() {
		game.addArrival("francesco", Instant.now());
		assertEquals(1, game.getArrivals().size());
	}

	// test per verificare che getParecipiantTime(String participant) lanci
	// un'eccezione in caso di partecipante non valido
	@Test(expected=IllegalArgumentException.class)
	public void getPartecipantTimeTest(){
		game.getParecipiantTime("pinario");
	}
}
