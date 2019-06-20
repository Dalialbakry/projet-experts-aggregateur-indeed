package robot.agregator.jobs.app;

import robot.agregator.jobs.listeJobs.Indeed_JobList;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.mailing.ContenuMail;
import robot.agregator.jobs.mailing.Mailing;
import robot.agregator.jobs.pageObjects.Indeed.IndeedPage;

// classe permettant de lancer le robot
public class App {

	public static void main(String[] args) {

		// action qui lance la connexion au browser
		IndeedPage.OpenWebSite();
		IndeedPage.IndeedSearch();
		pause(3);
		Indeed_JobList.recupererOffres();
		// action pour l'envoi de mail groupé avec les offres
		Mailing.sendMessage(ContenuMail.SUBJECT, ContenuMail.TEXT, ContenuMail.DESTINATAIRES, ContenuMail.COPYDEST);
		MyDriver.quitDriver();
		
		//pause(5);
		
		//ApecPage.App1();
		//ApecPage.ApecSearch();
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
