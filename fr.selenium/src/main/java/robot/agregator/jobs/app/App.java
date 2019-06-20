package robot.agregator.jobs.app;

import robot.agregator.jobs.listeJobs.Apec_JobList;
import robot.agregator.jobs.listeJobs.Indeed_JobList;
import robot.agregator.jobs.listeJobs.JobOpportunit_JobList;
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
		IndeedPage.OpenWebSite(); // action qui lance la connexion au browser
		IndeedPage.IndeedSearch(); // action qui cherche les jobs par keywords
		pause(2);
		Indeed_JobList.recupererOffres(); // récupération offres
		MyDriver.quitDriver(); // fermeture de la fenetre

		/*
		pause(1);
		// APEC //
		JobOpportunitPage.OpenWebSite(); // action qui lance la connexion au browser
		JobOpportunitPage.run(); // action qui cherche les jobs par keywords
		pause(2);
		JobOpportunit_JobList.recupererOffres(); // récupération offres
		MyDriver.quitDriver(); // fermeture de la fenetre
		
	
		pause(1);
		// APEC //
		ApecPage.OpenWebSite(); // action qui lance la connexion au browser
		ApecPage.run(); // action qui cherche les jobs par keywords
		pause(2);
		Apec_JobList.recupererOffres(); // récupération offres
		MyDriver.quitDriver(); // fermeture de la fenetre
		*/
	
		// action pour l'envoi de mail groupé avec les offres
		Mailing.sendMessage(ContenuMail.SUBJECT, ContenuMail.TEXT, ContenuMail.DESTINATAIRES, ContenuMail.COPYDEST);
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
