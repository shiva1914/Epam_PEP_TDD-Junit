package com.epam.tddjunitremove;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2Characters {
	/*
	 *   "ABCD" => "BCD"
	 *   "AACD" => "CD"
	 *   "BACD" => "BCD"
	 *   "BBAA" => "BBAA"
	 *   "AABAA" => "BAA"

	 */
	
	RemoveFirst2Char removeFirst2;
	
	@BeforeEach
	void setBefore() {
		removeFirst2 = new RemoveFirst2Char();
	}
	@Test
	void test1() {
		String res = removeFirst2.remove("ABCD");
		assertEquals("BCD",res);
	}
	@Test
	void test2() {
		String res = removeFirst2.remove("AACD");
		assertEquals("CD",res);
	}
	@Test
	void test3() {
		String res = removeFirst2.remove("BACD");
		assertEquals("BCD",res);
	}
	@Test
	void test4() {
		String res = removeFirst2.remove("BBAA");
		assertEquals("BBAA",res);
	}
	@Test
	void test5() {
		String res = removeFirst2.remove("AABAA");
		assertEquals("BAA",res);
	}
	
}
