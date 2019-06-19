package robot.agregator.jobs.app;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.constants.JobsWebSites;
import robot.agregator.jobs.listeJobs.Indeed_JobList;
import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.mailing.ContenuMail;
import robot.agregator.jobs.mailing.Mailing;
import robot.agregator.jobs.pageObjects.Apec.ApecPage;
import robot.agregator.jobs.pageObjects.Indeed.IndeedPage;
import robot.agregator.jobs.pageObjects.Indeed.Indeed_IDs;

// classe permettant de lancer le robot
public class App {


	
	public static void main(String[] args) {

		// action qui lance la connexion au browser
		IndeedPage.App1();
		IndeedPage.IndeedSearch();
		pause(3);
		Indeed_JobList.recupererOffres();
		// action pour l'envoi de mail groupé
		//Mailing.sendMessage(ContenuMail.SUBJECT, ContenuMail.TEXT, ContenuMail.DESTINATAIRES, ContenuMail.COPYDEST);
		
		// action pour l'envoi du mail simple
		// Mailing.sendMessage("Bonjour", "coucou", "sabri.taleb@outlook.com","expertprojet2019@gmail.com");
		
		// action pour fermer la page
		MyDriver.quitDriver();
		pause(5);
		ApecPage.App1();
		ApecPage.ApecSearch();
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
