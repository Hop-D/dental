package dental;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    
    public Main() {
    	User.addUsers(new Patient("nyok", "nyok", "nyok"));
    	User.addUsers(new Patient("test", "test", "test"));
    	User.addUsers(new Guest("jem", "jem", "jem"));
    	User.addUsers(new Dentist("Dentist One", "d1", "pass"));
    	User.addUsers(new Dentist("Dentist Two", "d2@email.com", "pass"));
	    
	    Appointment.addAppointment(new Appointment(User.getUsers().get(0), User.getUsers().get(3), LocalDateTime.of(2023, 2, 12, 0, 0), "First Appointment"));
	    Appointment.addAppointment(new Appointment(User.getUsers().get(1), User.getUsers().get(3), LocalDateTime.of(2023, 5, 26, 0, 0), "Second Appointment"));
	    
     }

    public static void main(String[] args) {
        Main main = new Main();
        
    	
        WelcomeClass welcome = new WelcomeClass();
        welcome.setVisible(true);
        welcome.pack();
        welcome.setLocationRelativeTo(null);
    }  
}