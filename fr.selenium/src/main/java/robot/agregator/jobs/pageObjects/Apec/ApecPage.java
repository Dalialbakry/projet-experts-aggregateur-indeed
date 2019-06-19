package robot.agregator.jobs.pageObjects.Apec;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.pageObjects.Indeed.Indeed_IDs;

public class ApecPage {
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
