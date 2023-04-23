
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
        
        messages.add(new Message(1, "test", "test", "Dentist One"));
        messages.add(new Message(2, "test2", "test2", "Dentist Two"));
        
        appointments.add(new Appointment(1, "nyok", "nyok", "1234567890", "Sun Apr 23 15:52:57 PST 2023", "Sun Apr 23 15:52:57 PST 2023", "lol", "Dentist One", "Waiting"));
        appointments.add(new Appointment(2, "test", "test", "1234567890", "Sun Apr 23 15:52:57 PST 2023", "Sun Apr 23 15:52:57 PST 2023", "lol", "Dentist Two", "Waiting"));
        appointments.add(new Appointment(3, "nyok", "nyok", "1234567890", "Sun Apr 22 15:52:57 PST 2023", "Sun Apr 24 15:52:57 PST 2023", "lol", "Dentist One", "APPROVED"));
        appointments.add(new Appointment(4, "test", "test", "1234567890", "Sun Apr 22 15:52:57 PST 2023", "Sun Apr 24 15:52:57 PST 2023", "lol", "Dentist Two", "APPROVED"));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
        WelcomeClass welcome = new WelcomeClass();
        welcome.setVisible(true);
        welcome.pack();
        welcome.setLocationRelativeTo(null);

    }
    
}
