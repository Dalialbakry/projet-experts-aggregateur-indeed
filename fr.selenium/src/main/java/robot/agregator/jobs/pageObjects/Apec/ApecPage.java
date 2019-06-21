package robot.agregator.jobs.pageObjects.Apec;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.sites.recherche.Apec_JobList;

public class ApecPage {

	private static final String APEC_PAGE = "";

	// open apec page
	public ApecPage() {
		super();
		System.out.println("Welcome to APEC website for job search");
	}

	public static void run() {
		OpenWebSite();
		performanceActions();
		Apec_JobList.recupererOffres();
		// performanceChecks();
		MyDriver.quitDriver();
	}

	private static void performanceActions() {
		ApecPageActions actions = new ApecPageActions();
		actions.setPoste();
		actions.setVille();
		// actions.clickSearch();
		// actions.filterSearch();
	}

	public static void performanceChecks() {
		ApecPageChecks check = new ApecPageChecks();
		// assertEquals();
		System.out.println("if wrong we don't see it");
	}

	public static void OpenWebSite() {
		new MyDriver();
		MyDriver.driver.get(JobsWebSites.APEC_HOME_PAGE);
	}

}
