package robot.agregator.jobs.pageObjects.Apec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import robot.agregator.jobs.loaders.MyDriver;
import robot.agregator.jobs.sites.recherche.Offre;

public class ApecPageActions {

	public void setPoste() {
		MyDriver.driver.findElement(By.id(ApecIDs.ID_SearchJob)).sendKeys("testeur logiciel");
	}

	public void setVille() {
		MyDriver.driver.findElements(By.cssSelector(ApecIDs.Search_Where_Class)).get(0).sendKeys("alpes maritimes");
		MyDriver.driver.findElement(By.cssSelector(ApecIDs.Search_Where_Class)).sendKeys(Keys.ENTER);
	}

	public void clickSearch() {
		MyDriver.driver.findElement(By.cssSelector(ApecIDs.Button_Search_Class)).click();
	}

	public List<Offre> recupererOffres() {
		ArrayList<Offre> listeApec = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

			Offre offre = new Offre();
			offre.setLink(getOfferLink(i));
			offre.setLocation(getOfferLocation(i));
			offre.setPublicationDate(getOfferPublicationDate(i));
			offre.setSummary(getOfferSummary(i));
			offre.setTitle(getOfferTitle(i));
			offre.setWebsite("APEC");

			List<WebElement> jobTitlesWE = MyDriver.driver
					.findElements(By.cssSelector(".col-md-9point5.col-xs-12.border-right-solid.ng-binding"));
			List<WebElement> jobLocationsWE = MyDriver.driver.findElements(By.cssSelector(".ng-scope"));
			List<WebElement> jobDatesWE = MyDriver.driver
					.findElements(By.cssSelector(".pull-left.offre-date"));

			String link = " ";
			String summary = " ";

			for (int j = 1; j < 12; j += 4) {
				List<WebElement> links = MyDriver.driver
						.findElements(By.cssSelector("ro.goToDetailsOffre(offre,$index)"));
				link = links.get(j).getText();
				summary = links.get(j + 2).getText();
			}

			String title = jobTitlesWE.get(i).getText().toLowerCase();
			System.out.println(title);

			String location = jobLocationsWE.get(i).getText();
			System.out.println(location);

			// récuperer la date sur le site
			String publicationDate = jobDatesWE.get(i).getText();

			// spliter le texte pour ne récuperer que le chiffre
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
				datpub = LocalDate.now().minusMonths(datepubli);
				break;
			}

			if (offre.getTitle().contains("testeur")) {
				listeApec.add(offre);
			}
		}

		System.out.println(listeApec);

		return listeApec;
	}

	private String getOfferTitle(int i) {
		return MyDriver.driver.findElements(By.cssSelector(".offre-title")).get(i).getText();
	}

	private String getOfferSummary(int i) {
		String summary = "";
		for (int j = 1; j < 12; j += 4) {
			List<WebElement> links = MyDriver.driver
					.findElements(By.cssSelector("ro.goToDetailsOffre(offre,$index)"));
			summary = links.get(j + 2).getText();
		}
		return summary;
	}

	private LocalDate getOfferPublicationDate(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getOfferLocation(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getOfferLink(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private LocalDate getDatePublication(String dateFormatPage) {
		LocalDate date;
		return null;
	}

	public void filterSearch() {
		MyDriver.driver.findElement(By.cssSelector(ApecIDs.DATE_SORT_BUTTON)).click();
	}
}
