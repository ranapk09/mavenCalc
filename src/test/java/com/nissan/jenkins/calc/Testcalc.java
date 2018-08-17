package com.nissan.jenkins.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcalc {

	@Test
	public void testadd() {
		Calc a= new Calc();
		assertEquals(10,a.add(3,7));
	}
	@Test
	public void testsub() {
		Calc a= new Calc();
		assertEquals(2,a.sub(3,1));
	}
	@Test
	public void testmul() {
		Calc a= new Calc();
		assertEquals(21,a.mul(3,7));
	}
	@Test
	public void testdiv() {
		Calc a= new Calc();
		assertEquals(2,a.div(20,7));
	}

}
