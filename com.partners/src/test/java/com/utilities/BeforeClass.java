package com.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class BeforeClass {
	@Before
	public static void setUp(Scenario scen) {
		System.out.println("Chrome driver initialized.");
		Driver.getChromeDriver();
		System.out.println("Chrome driver End");
}
}
