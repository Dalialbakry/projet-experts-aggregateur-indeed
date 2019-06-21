package robot.agregator.jobs.pageObjects.JobOpportunit;

import robot.agregator.jobs.app.App;
import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.listeJobs.JobOpportunit_JobList;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.pageObjects.AllPages;
import robot.agregator.jobs.pageObjects.Apec.ApecPageChecks;

public class JobOpportunitPage extends AllPages{
	
	public static void run() {
		OpenWebSite();
		performanceActions();
		App.pause(2);
		JobOpportunit_JobList.recupererOffres();
		//performanceChecks();
		MyDriver.quitDriver();
		
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
