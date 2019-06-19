package robot.agregator.jobs.mailing;

import java.util.ArrayList;

public class Email {

	public String subject;
	public String text;
	public ArrayList<String> destinataires;
	public String copyDest;
	
	
	public Email() {
		
		destinataires = new ArrayList<String>();
		destinataires.add("sabri.taleb@outlook.com");
		destinataires.add("titi");
		destinataires.add("toto");
	}
	
}
