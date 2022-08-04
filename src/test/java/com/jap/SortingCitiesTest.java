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

	} 
}