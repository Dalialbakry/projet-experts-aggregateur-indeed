package robot.agregator.jobs.sites.recherche;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.loaders.MyDriver;

public class Apec_JobList {
	
	public static ArrayList<Offre> listeApec = new ArrayList<>();

	public static void recupererOffres() {

		for (int i = 0; i < 3; i++) {
			List<WebElement> jobsTitle = MyDriver.driver.findElements(By.cssSelector(".col-md-9point5.col-xs-12.border-right-solid.ng-binding"));
			List<WebElement> jobLocation = MyDriver.driver.findElements(By.cssSelector(".ng-scope"));
			List<WebElement> jobDate = MyDriver.driver.findElements(By.cssSelector(".offre.datePublication.|.date:'shortDate'"));
			
			String link = " ";
			String summary =" ";
			
			for (int j = 1; j<12; j+=4) {
			List<WebElement> links = MyDriver.driver.findElements(By.cssSelector("ro.goToDetailsOffre(offre,$index)"));
			link = links.get(j).getText();
			summary = links.get(j+2).getText();
			}
			
			String title = jobsTitle.get(i).getText().toLowerCase();
			System.out.println(title);
			
			String location = jobLocation.get(i).getText();
			System.out.println(location);
			
			
			// récuperer la date sur le site 
			String publicationDate = jobDate.get(i).getText();
			
			//spliter le texte pour ne récuperer que le chiffre 
			String[] b = publicationDate.split(" ");
			String datepub = b[3];
			
			// transformer la date en long pour la soustraire à la date du jour
			long datepubli = Long.parseLong(datepub);
			LocalDate datpub = null;
			
			switch (b[4]) {
		    case "minutes":
			   datpub = LocalDate.now();
		    break;
	
		    case "heures":
			   datpub = LocalDate.now();
		    break;
		    
			case "jours":
				datpub = LocalDate.now().minusDays(datepubli);
			break;
				 
			case "mois":
				datepubli = datepubli*30;
				datpub = LocalDate.now().minusDays(datepubli);
			break;
		}
			
			
			if (title.contains("testeur")) {
					
				Offre offre = new Offre(title, link, summary, location, datpub);
				listeApec.add(offre);
			}
		}

		System.out.println(listeApec);
	}

}
