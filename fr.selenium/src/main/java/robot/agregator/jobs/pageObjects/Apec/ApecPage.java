package robot.agregator.jobs.pageObjects.Apec;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.pageObjects.AllPages;
import robot.agregator.jobs.pageObjects.Indeed.Indeed_IDs;

public class ApecPage extends AllPages {

	private static final String APEC_PAGE = "";

	// open apec page
	public ApecPage() {
		super();
		System.out.println("Welcome to APEC website for job search");
	}

	public static void run() {

		performanceActions();
		//performanceChecks();
	}

	private static void performanceActions() {
		ApecPageActions actions = new ApecPageActions();
		actions.setPoste();
		actions.setVille();
		//actions.clickSearch();
		

	}

	public static void performanceChecks() {
		ApecPageChecks check = new ApecPageChecks();
		//assertEquals();
		System.out.println("if wrong we don't see it");


	}


	public static void OpenWebSite() {
		new MyDriver();
		MyDriver.driver.get(JobsWebSites.APEC_HOME_PAGE);
	}

}
