package robot.agregator.jobs.listeJobs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.loaders.MyDriver;

public class Apec_JobList {
	
	public static ArrayList<Offre> listeApec = new ArrayList<>();

	public static void recupererOffres() {

		for (int i = 0; i < 3; i++) {
			List<WebElement> jobs = MyDriver.driver.findElements(By.cssSelector(".col-md-9point5.col-xs-12.border-right-solid"));
			List<WebElement> jobSummary = MyDriver.driver.findElements(By.cssSelector(".detail"));
			List<WebElement> jobLocation = MyDriver.driver.findElements(By.cssSelector(".ng-scope"));

			String link = jobs.get(i).getAttribute("href");
			String title = jobs.get(i).getAttribute("ng-binding").toLowerCase();
			String summary = jobSummary.get(i).getText();
			String location = jobLocation.get(i).getText();

			if (title.contains("testeur")) {
				
				Offre offre = new Offre(title, link, summary, location);

				listeApec.add(offre);
			}
		}

		System.out.println(listeApec);
	}

}
