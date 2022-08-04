package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingCitiesTest {
	String[] city;
	int[] distance;
	SortingCities new;

    @Before
    public void setUp()  {
		sortingCities= new SortingCities();
		city=new String[]{"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
		distance=new int[]{138,52,118,136,85,276,103,87,214,101};
    }

    @After
	 public void tearDown()  {
		SortingCities= null;
    }

	@Test
	public void givenConvertUpperCases(){
		String [] actual=s.converUpperCases(city);
		String [] expected={"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
		assertEquals(expected,actual);
	}

	
	@Test
	public void givenFindCityDistance(){
		String[] actual=s.findCityDistance(distance,city);

		assertEquals("The city which is 52kms from Zurish is Lucerne",actual);
	}
	@Test
	public void givenGreaterThan(){
		String[] actual=s.greaterThan(city,distance);
		assertEquals("The city which is greater than or equal to 270km from Zurish is Geneva",actual);
	}
	
	
}