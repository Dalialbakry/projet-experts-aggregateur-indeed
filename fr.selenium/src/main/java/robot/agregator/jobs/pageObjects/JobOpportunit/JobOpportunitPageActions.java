package robot.agregator.jobs.pageObjects.JobOpportunit;

import org.openqa.selenium.By;

import robot.agregator.jobs.loaders.MyDriver;

public class JobOpportunitPageActions {

	protected void SearchChoice() {

		MyDriver.driver.findElement(By.id("elementID")).sendKeys("testeur");
	}

	protected void clickSearchButton() {
		MyDriver.driver.findElements(By.className(JobOpportunit_IDs.Class_JO_SearchButton)).get(1).click();
	}

}
