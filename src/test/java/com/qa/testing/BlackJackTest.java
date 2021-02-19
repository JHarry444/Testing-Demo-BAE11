package com.qa.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackJackTest {

	private BlackJack jack = new BlackJack();

	@Test
	void testBothBust() {
		int expected = 0;
		int actual = jack.play(22, 23);
		assertEquals(expected, actual);
	}

	@Test
	void testPlayer1Bust() {
		int expected = 16;
		int actual = this.jack.play(25, 16);

		assertEquals(expected, actual);
	}

	@Test
	void testPlayer2Bust() {
		int expected = 16;
		int actual = this.jack.play(16, 25);

		assertEquals(expected, actual);
	}

	@Test
	void testPlayer1Wins() {
		int expected = 16;
		int actual = this.jack.play(16, 10);

		assertEquals(expected, actual);
	}

	@Test
	void testPlayer2Wins() {
		int expected = 16;
		int actual = this.jack.play(10, 16);

		assertEquals(expected, actual);
	}
}
