package robot.agregator.jobs.loaders;

import robot.agregator.jobs.constants.JobsWebSites;

public class AppFlow {

	public AppFlow() {
	super();
	
	new MyDriver();
	MyDriver.driver.get(JobsWebSites.INDEED_HOME_PAGE);
	}
	
	protected static void run() {
		
		pause(2);
	}
	
	
	private static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
}
