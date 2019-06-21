package robot.agregator.jobs.app;

import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.mailing.ContenuMail;
import robot.agregator.jobs.mailing.Mailing;
import robot.agregator.jobs.pageObjects.Apec.ApecPage;
import robot.agregator.jobs.pageObjects.Indeed.IndeedPage;
import robot.agregator.jobs.pageObjects.JobOpportunit.JobOpportunitPage;

// classe permettant de lancer le robot
public class App {

	public static void main(String[] args) {

		// INDEED //
		IndeedPage.run();

		pause(1);

		// APEC //
		ApecPage.run();

		pause(1);

		// JobOpportun IT //
		JobOpportunitPage.run();

		// action pour l'envoi de mail groupé avec les offres
		Mailing.sendMessage(ContenuMail.SUBJECT, ContenuMail.TEXT, ContenuMail.DESTINATAIRES, ContenuMail.COPYDEST);
		MyDriver.quitDriver();

	}

	public static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
