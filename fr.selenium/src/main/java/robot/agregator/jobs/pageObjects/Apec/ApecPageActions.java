package robot.agregator.jobs.pageObjects.Apec;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import robot.agregator.jobs.loaders.MyDriver;

public class ApecPageActions {

	public void setPoste() {
		MyDriver.driver.findElement(By.id(Apec_IDs.ID_SearchJob)).sendKeys("testeur logiciel");
	}

	public void setVille() {
		MyDriver.driver.findElements(By.cssSelector(Apec_IDs.Search_Where_Class)).get(0).sendKeys("alpes maritimes");
		MyDriver.driver.findElement(By.cssSelector(Apec_IDs.Search_Where_Class)).sendKeys(Keys.ENTER);
	}

	public void clickSearch() {
		MyDriver.driver.findElement(By.cssSelector(Apec_IDs.Button_Search_Class)).click();
	}
	
	/*
	public void filterSearch() {
		Select s9 = new Select(MyDriver.driver.findElement(By.cssSelector(".form-control.form-control-sm.ng-valid.ng-not-empty.ng-dirty.ng-valid-parse.ng-touched")));
		s9.selectByValue("DATE");
	}
	*/
}
