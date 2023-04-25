package dental;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Patient extends User implements PatientAppointmentBooker {
    
    String contact;
    ArrayList<Appointment> userAppointments;
    // Constructor
    public Patient(String name, String email, String password) {
        super(User.generateID(), name, email, password, User.PATIENT_TYPE);
        this.userAppointments = new ArrayList<>();
    } 
    
    // Getters and setters
    public ArrayList<Appointment> getUserAppointments() {
        return userAppointments;
    }

    public void userAppointment(Appointment appointment) {
        this.userAppointments.add(appointment);
    }
    
    public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


    public void bookAppointment(User dentist, LocalDateTime requestDate, String note, String contact) {
        Appointment appointment = new Appointment(this, dentist, requestDate, note);
		Appointment.addAppointment(appointment);
		this.setContact(contact);
		this.userAppointments.add(appointment);
    }

	@Override
	public void cancelRequest(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}


	

}
