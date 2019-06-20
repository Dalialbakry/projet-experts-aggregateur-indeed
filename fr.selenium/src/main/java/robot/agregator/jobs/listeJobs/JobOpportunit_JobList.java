package robot.agregator.jobs.listeJobs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.loaders.MyDriver;

public class JobOpportunit_JobList {

	public static ArrayList<Offre> listeJobOppIt = new ArrayList<>();
	
	public static void recupererOffres() {

		for (int i = 0; i < 3; i++) {
			List<WebElement> jobs = MyDriver.driver.findElements(By.cssSelector(".table-status-open"));
			List<WebElement> jobTitle = MyDriver.driver.findElements(By.cssSelector(".job-title"));
			List<WebElement> jobSummary = MyDriver.driver.findElements(By.cssSelector(".job-title"));
			List<WebElement> jobLocation = MyDriver.driver.findElements(By.cssSelector(".job-city"));
			
			
			String link = jobs.get(i).getAttribute("href");
			String title = jobTitle.get(i).getText().toLowerCase();
			String summary = jobTitle.get(i).getText().toLowerCase();
			String location = jobLocation.get(i).getText();

			if (title.contains("testeur")) {
			
				Offre offre = new Offre(title, link, summary, location);

				listeJobOppIt.add(offre);
			}
		

		}
		for (Offre offre : listeJobOppIt) {

			System.out.println(offre);
		}
	}

}
