package robot.agregator.jobs.pageObjects.Apec;


import static org.testng.Assert.assertEquals;

import robot.agregator.jobs.pageObjects.AllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.pageObjects.Indeed.Indeed_IDs;


public class ApecPage extends AllPages {

	private static final String APEC_PAGE = "";

	// open apec page
	public ApecPage() {
		super();
		System.out.println("Welcome to APEC website for job search");
	}

	public void run() {

		performanceActions();
		performanceChecks();
	}

	private void performanceActions() {
		ApecPageActions actions = new ApecPageActions();
		actions.setPoste();
		actions.setVille();
		actions.clickSearch();

	}

	public void performanceChecks() {
		ApecPageChecks check = new ApecPageChecks();
		assertEquals();
		System.out.println("if wrong we don't see it");



	public static void App1() {
		new MyDriver();
		MyDriver.driver.get(JobsWebSites.APEC_HOME_PAGE);
	}
	
	
	
	public static void ApecSearch() {
		MyDriver.driver.findElement(By.id(Indeed_IDs.ID_SearchJob)).sendKeys("testeur logiciel");
		MyDriver.driver.findElement(By.id(Indeed_IDs.ID_SearchWhere)).sendKeys((Keys.chord(Keys.CONTROL, "a")));
		MyDriver.driver.findElement(By.id(Indeed_IDs.ID_SearchWhere)).sendKeys("Alpes Maritimes");
		MyDriver.driver.findElement(By.id(Indeed_IDs.ID_SearchWhere)).sendKeys(Keys.ENTER);
		//MyDriver.driver.findElement(By.className("icl-WhatWhere-buttonWrapper")).click();

	}

}
