package robot.agregator.jobs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import robot.agregator.jobs.loaders.MyDriver;


public class AllPages {

	public AllPages() {
		super();
	}
	// action qui permet d'attendre de voir si les ID sont disponibles
	protected void waitForThePageByElementID(String id) {
		WebDriverWait wait = new WebDriverWait(MyDriver.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}

}
