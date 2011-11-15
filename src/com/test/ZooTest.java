package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.pilecki1.Zoo;
import com.pilecki1.Zwierzeta;
import com.pilecki1.MyException;
import com.pilecki1.ZwierzetaRodzaj;



public class ZooTest {

	private static final ZwierzetaRodzaj ZwierzetaRodzaj = null;
	private Zoo z;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		z = new Zoo("Zoo w Gdañsku");
		z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.¯yrafa,"ssak", 10));
		z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.¯aba,"P³az", 4));
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testZoo() {
		fail("Not yet implemented");
	}

	@Test
	public void testWypiszZwierzeta() {
		 z.wypiszZwierzeta();
	}

	@Test
	public void testDodajZwierze() {
		z.wypiszZwierzeta();
		z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.¯yrafa,"ssak", 10));
	}

	@Test
	public void testUsunZwierze() {
		 Zwierzeta lew = z.ZnajdzpoNazwie(ZwierzetaRodzaj );
		z.wypiszZwierzeta();
		z.UsunZwierze(lew);
		z.wypiszZwierzeta();
	}

	@Test
	public void testIstniejeZwierze() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsunWszystkieZwierzeta() {
		z.UsunWszystkieZwierzeta();
		
	}

	@Test
	public void testDodajWszystkieZwierzeta() {
		fail("Not yet implemented");
	}

	@Test
	public void testZwrocZwierzeta() {
		fail("Not yet implemented");
	}

	@Test
	public void testZnajdzpoNazwie() {
		fail("Not yet implemented");
	}

	@Test
	public void testZmienZwierze() {
		fail("Not yet implemented");
	}

}
