package robot.agregator.jobs.listeJobs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.loaders.MyDriver;

public class JobOpportunit_JobList {

	public static void recupererOffres() {

		ArrayList<String> listeEmplois = new ArrayList<String>();

		for (int i = 0; i < 3; i++) {
			List<WebElement> jobs = MyDriver.driver.findElements(By.cssSelector("Class_JO_JobTitle"));
			List<WebElement> jobSummary = MyDriver.driver.findElements(By.cssSelector("job-advantages"));
			List<WebElement> jobLocation = MyDriver.driver.findElements(By.cssSelector("Class_JO_City"));
			String link = jobs.get(i).getAttribute("href");
			String title = jobs.get(i).getAttribute("job-title");
			String summary = jobSummary.get(i).getText();
			String location = jobLocation.get(i).getText();

			listeEmplois.add(link);
			listeEmplois.add(title);
			listeEmplois.add(summary);
			listeEmplois.add(location);
		}

		System.out.println(listeEmplois);
	}

}
