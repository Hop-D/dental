package dental;

import java.util.ArrayList;

public class Main {
	
	static ArrayList <User> users = new ArrayList<>();
    static ArrayList <Dentist> dentists = new ArrayList<>();
    static ArrayList <Message> messages = new ArrayList<>();
    static ArrayList <Appointment> appointments = new ArrayList<>();
    
    public Main() {
        
        users.add(new User(1, "nyok", "nyok", "nyok", "Patient"));
        users.add(new User(2, "test", "test", "test", "Patient"));
        users.add(new User(3, "jem", "jem", "jem", "Guest"));

        users.add(new Dentist(4, "Dentist One", "d1@email.com", "pass", "Dentist"));
        dentists.add(new Dentist(1, "Dentist One", "d1@email.com", "pass", "Dentist"));
        users.add(new Dentist(5, "Dentist Two", "d2@email.com", "pass", "Dentist"));
        dentists.add(new Dentist(2, "Dentist Two", "d2@email.com", "pass", "Dentist"));
        
        messages.add(new Message(1, "test", "test", "test"));
        messages.add(new Message(2, "test2", "test2", "test2"));
        
        appointments.add(new Appointment(1, "nyok", "nyok", "1234567890", "lol", "lol", "lol", "Dentist One", "Waiting"));
        appointments.add(new Appointment(2, "test", "test", "1234567890", "lol", "lol", "lol", "Dentist Two", "Waiting"));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
        WelcomeClass welcome = new WelcomeClass();
        welcome.setVisible(true);
        welcome.pack();
        welcome.setLocationRelativeTo(null);

	}

}
