package dental;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    
    public Main() {
    	User.addUsers(new Patient("nyok", "nyok", "nyok"));
    	User.addUsers(new Patient("test", "test", "test"));
    	User.addUsers(new Guest("jem", "jem", "jem"));
    	User.addUsers(new Guest("Guest Guest", "guest", "guest"));
    	User.addUsers(new Dentist("Dentist One", "d1", "pass"));
    	User.addUsers(new Dentist("Dentist Two", "d2@email.com", "pass"));
	    
	    Appointment.addAppointment(new Appointment(User.getUsers().get(0), User.getUsers().get(3), LocalDateTime.of(2023, 2, 12, 0, 0), "First Appointment"));
	    Appointment.addAppointment(new Appointment(User.getUsers().get(1), User.getUsers().get(3), LocalDateTime.of(2023, 5, 26, 0, 0), "Second Appointment"));
	    
	    try {
	    	Message one = new Message(User.getUser(3), User.getUser(4), "Hello, how are you!");
	    	one.performSend();
			Message.addMessages(one);
			Message two = new Message(User.getUser(3), User.getUser(5), "Hello, how are you!");
			two.performSend();
			Message.addMessages(two);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
        Main main = new Main();
        
        WelcomeClass welcome = new WelcomeClass();
        welcome.setVisible(true);
        welcome.pack();
        welcome.setLocationRelativeTo(null);
    }  
}