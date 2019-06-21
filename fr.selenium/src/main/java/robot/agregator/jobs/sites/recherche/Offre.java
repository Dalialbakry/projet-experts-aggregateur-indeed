package robot.agregator.jobs.sites.recherche;

import java.time.LocalDate;

public class Offre {

	public Offre() {
		
	}
	
	public Offre(String title, String link, String summary, String location, LocalDate d) {
		setTitle(title);
		setLink(link);
		setSummary(summary);
		setLocation(location);
		setPublicationDate(d);
		}
	
	private String title;
	private String link;
	private String summary;
	private String location;
	private LocalDate publicationDate;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		String s = publicationDate+"\n"+title+"\n"+link+"\n"+summary+"\n"+location+"\n";
		return s;
		
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate d) {
		this.publicationDate = d;
	}
}
