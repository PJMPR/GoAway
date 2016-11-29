package domain;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.model.Hotel;

public class goAway {

	@Test
	public void testMultiplication() {
		Destination hundred = Destination.Italy(100);
		hundred.times(2);
		assertEquals(200, hundred.amount);
	}
}
