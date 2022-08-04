package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingCitiesTest {

    @Before
    public void setUp()  {
		sortingCities= new SortingCities();
    }

    @After
    public void tearDown()  {
		sortingCities=null;
    }

	@Test
	public void givenConvertUpperCases(){
		String actual=s.converUpperCases(Lucerne);
		assertEquals(LUCERNE,actual);
	}

	@Test
	public void givenPrintCityAndDistance(){
		String actual=s.printCityAndDistance(Lucerne,52);
		assertEquals(Lucerne:52,actual);
	}
	@Test
	public void givenFindCityDistance(){
		String actual=s.findCityDistance(Lucerne,52);
		assertEquals(Lucerne:52,actual);
	}
	@Test
	public void givenGreaterThan(){
		String actual=s.greaterThan(Geneva,276);
		assertEquals(Geneva:276,actual);
	}
	
	} 
}