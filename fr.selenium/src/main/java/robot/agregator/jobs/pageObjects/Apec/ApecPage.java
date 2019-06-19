package robot.agregator.jobs.pageObjects.Apec;

import static org.testng.Assert.assertEquals;

import robot.agregator.jobs.pageObjects.AllPages;

public class ApecPage extends AllPages {

	private static final String APEC_PAGE = "";

	// open apec page
	public ApecPage() {
		super();
		System.out.println("Welcome to APEC website for job search");
	}

	public void run() {

		performanceActions();
		performanceChecks();
	}

	private void performanceActions() {
		ApecPageActions actions = new ApecPageActions();
		actions.setPoste();
		actions.setVille();
		actions.clickSearch();

	}

	public void performanceChecks() {
		ApecPageChecks check = new ApecPageChecks();
		assertEquals();
		System.out.println("if wrong we don't see it");
	}

}
