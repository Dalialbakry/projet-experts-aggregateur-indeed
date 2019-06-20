package robot.agregator.jobs.mailing;

import robot.agregator.jobs.listeJobs.Apec_JobList;
import robot.agregator.jobs.listeJobs.Indeed_JobList;
import robot.agregator.jobs.listeJobs.Offre;

public class ContenuMail {

	public static final String SUBJECT = "Dernières offres d'emploi";
	public static final String TEXT = "Bonjour,\n Voici les dernières offres d'emploi : \n INDEED \n" +Indeed_JobList.listeIndeed+ "\n APEC \n"+Apec_JobList.listeApec+"\n Cordialement,\n l'équipe des experts";
	public static final String DESTINATAIRES = "dalia@logilune.com,sabri.taleb@outlook.com,nawrassmn@gmail.com,allogo9@yahoo.fr";
	public static final String COPYDEST = "expertprojet2019@gmail.com";
	

}
