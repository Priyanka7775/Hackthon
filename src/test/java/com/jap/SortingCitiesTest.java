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
		sortingCities= null;
    }

	@Test
	public void givenConvertUpperCases(){
		String [] actual=sortingCities.converUpperCases(city);
		String [] expected={"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
		assertEquals(expected,actual);
	}

	
	@Test
	public void givenFindCityDistance(){
		String[] actual=sortingCities.findCityDistance(distance,city);
		String[] city={"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
		int [] distance={138,52,118,136,85,276,103,87,214,101};
		assertEquals("The city which is 52kms from Zurish is Lucerne",actual);
	}
	@Test
	public void givenGreaterThan(){
		String[] actual=sortingCities.greaterThan(city,distance);
		String[] city={"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
		int [] distance={138,52,118,136,85,276,103,87,214,101};
		assertEquals("The city which is greater than or equal to 270km from Zurish is Geneva",actual);
	}
	
	
}