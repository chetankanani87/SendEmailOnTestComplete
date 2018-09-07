package sendEmailOnTestComplete;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("abc@gmail.com", "xyz"));
		email.setSSLOnConnect(true);
		email.setFrom("abc@gmail.com");
		email.setSubject("Selenium Test Report");
		email.setMsg("This is a test mail from selenium");
		email.addTo("abc@gmail.com");
		email.send();
	}
}
