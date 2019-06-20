package robot.agregator.jobs.pageObjects.JobOpportunit;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.pageObjects.Apec.ApecPageChecks;

public class JobOpportunitPage {
	
	public static void run() {

		performanceActions();
		//performanceChecks();
	}

	private static void performanceActions() {
		JobOpportunitPageActions actions = new JobOpportunitPageActions();
		actions.SearchChoice();
		actions.clickSearchButton();
		//actions.clickSearch();
	}

	public static void performanceChecks() {
		ApecPageChecks check = new ApecPageChecks();
		//assertEquals();
		System.out.println("if wrong we don't see it");
	}

	public static void OpenWebSite() {
		new MyDriver();
		MyDriver.driver.get(JobsWebSites.JOBOPPORTUNIT_HOME_PAGE);
	}


}
