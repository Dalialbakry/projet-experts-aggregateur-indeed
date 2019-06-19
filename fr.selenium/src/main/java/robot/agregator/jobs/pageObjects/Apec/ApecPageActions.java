package robot.agregator.jobs.pageObjects.Apec;

import org.openqa.selenium.By;

import robot.agregator.jobs.loaders.MyDriver;

public class ApecPageActions {

	public void setPoste() {
		MyDriver.driver.findElement(By.id(Apec_IDs.ID_SearchJob)).click();
	}

	public void setVille() {
		MyDriver.driver.findElements(By.className(Apec_IDs.Search_Where_Class)).get(0).click();
	}

	public void clickSearch() {
		MyDriver.driver.findElement(By.className(Apec_IDs.Button_Search_Class)).click();
	}

	public void returnedJobList() {
		// TODO Auto-generated method stub

	}
}
