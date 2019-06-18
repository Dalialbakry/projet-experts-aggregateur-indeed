package robot.agregator.jobs.app;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.mailing.Mailing;

// classe permettant de lancer le robot
public class App {

	public static void App1() {
		new MyDriver();
		MyDriver.driver.get(JobsWebSites.INDEED_HOME_PAGE);
	}
	
	public static void main(String[] args) {
		
		// action qui lance la connexion au browser
		App1();
		// action pour l'envoi du mail
		Mailing.sendMessage("Bonjour", "coucou", "sabri.taleb@outlook.com", "expertprojet2019@gmail.com");
		// action pour fermer la page
		MyDriver.quitDriver();
	}

	
	private static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
