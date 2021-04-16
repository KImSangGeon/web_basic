package web_basic_jsp_12;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	
	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("zhwnqn12@gmail.com", "oqgfsxymjijidyih");
	}
	
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
	

}
