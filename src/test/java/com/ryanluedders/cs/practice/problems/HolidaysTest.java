package com.ryanluedders.cs.practice.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ryanluedders.cs.practice.problems.Holidays.HolidayTree;

public class HolidaysTest {
	
	private static final List<String> LOCATIONS = Arrays.asList("OMA", "NYC", "LON");
	
	private static final int[][] HOLIDAYS_PER_WEEK = {
			/* OMA		NYC		LON */
			{0,			0,		0},
			{1,			0,		0},
			{0,			0,		2},
			{1,			1,		2},
			{2,			1,		1},
		};
	
	int[][] FLIGHT_TIMES = {
					/* OMA		NYC		LON */
		/* OMA */	{  0,		4,		9	},
		/* NYC */	{  4,		0,		6	},
		/* LON */	{  9,		6,		0	},
		};
	
	@Test
	public void testBuildTree_can_fly_anywhere() {
		final int maxFlightTime = 10;
		
		HolidayTree holidays = Holidays.buildTree(LOCATIONS, FLIGHT_TIMES, HOLIDAYS_PER_WEEK, maxFlightTime);
		
		System.out.println(holidays.toString());
		
		assertNotNull(holidays);
		assertEquals(364, holidays.size()); // 3^5 + 3^4 + 3^3 + 3^2 + 3^1 + 3^0
	}
	
	@Test
	public void testBuildTree_can_fly_within_7_hours() {
		final int maxFlightTime = 7;
		
		
		final int[][] holidaysPerWeek = {
				/* OMA		NYC		LON */
				{0,			0,		0},
				{0,			0,		1},
				{2,			0,		0},
			};
		
		HolidayTree holidays = Holidays.buildTree(LOCATIONS, FLIGHT_TIMES, holidaysPerWeek, maxFlightTime);
		
		System.out.println(holidays.toString());
		
		assertNotNull(holidays);
		assertEquals(34, holidays.size()); // 1 + 3 + 9 + 21 = 34
	}

}
