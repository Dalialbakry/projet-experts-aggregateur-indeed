package robot.agregator.jobs.mailing;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailing {
	
	// Classe qui permet la connexion au hote pour l'envoi du mail
	
	private static final String SMTP_HOST1 = "smtp.gmail.com";
	private static final String LOGIN_SMTP1 ="expertprojet2019@gmail.com";
	private static final String IMAP_ACCOUNT1 ="imap.gmail.com";
	private static final String PASSWORD_SMTP1 = "expert2019";
	
	public static void sendMessage(String subject, String text, String destinataire, String copyDest) {
		// creation de la session
		
		   Properties properties = new Properties();
		   properties.setProperty("mail.transport.protocol", "smtp");
		   properties.setProperty("mail.smtp.host", SMTP_HOST1);
		   properties.setProperty("mail.smtp.user", LOGIN_SMTP1);
		   properties.setProperty("mail.from", IMAP_ACCOUNT1);
		   Session session = Session.getInstance(properties);
		   
		   properties.setProperty("mail.smtp.starttls.enable", "true");
		   
		   
		// 2 -> Création du message
		    MimeMessage message = new MimeMessage(session);
		    try {
		        message.setText(text);
		        message.setSubject(subject);
		        message.addRecipients(Message.RecipientType.TO, destinataire);
		        message.addRecipients(Message.RecipientType.CC, copyDest);
		    } catch (MessagingException e) {
		        e.printStackTrace();
		    }
		    
		 // 3 -> Envoi du message
		    Transport transport = null;
		    try {
		        transport = session.getTransport("smtp");
		        transport.connect(LOGIN_SMTP1, PASSWORD_SMTP1);
		        transport.sendMessage(message, new Address[] { new InternetAddress(destinataire),
		                                                        new InternetAddress(copyDest) });
		    } catch (MessagingException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (transport != null) {
		                transport.close();
		            }
		        } catch (MessagingException e) {
		            e.printStackTrace();
		        }
		    }
	}

}
