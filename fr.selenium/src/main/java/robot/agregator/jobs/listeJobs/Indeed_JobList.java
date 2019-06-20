package robot.agregator.jobs.listeJobs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.loaders.MyDriver;

public class Indeed_JobList {
	
	public static ArrayList<Offre> listeOffres = new ArrayList<>();

	
	public static void recupererOffres() {

		for (int i = 0; i < 3; i++) {
			
			List<WebElement> jobs = MyDriver.driver.findElements(By.cssSelector(".jobtitle.turnstileLink"));
			List<WebElement> jobSummary = MyDriver.driver.findElements(By.cssSelector(".summary"));
			List<WebElement> jobLocation = MyDriver.driver.findElements(By.cssSelector(".location"));
			
			String link = jobs.get(i).getAttribute("href");
			String title = jobs.get(i).getAttribute("title");
			String summary = jobSummary.get(i).getText();
			String location = jobLocation.get(i).getText();
			
			if (title.contains("testeur")) {
			
				Offre offre = new Offre(title, link, summary, location);

				listeOffres.add(offre);
			}
		

		}
		for (Offre offre : listeOffres) {

			System.out.println(offre);
		}
	}
}
