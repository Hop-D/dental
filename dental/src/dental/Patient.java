package dental;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Patient extends User {
    
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

    public void addUserAppointment(Appointment appointment) {
        this.userAppointments.add(appointment);
    }
    
    public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	// Methods
    public void bookAppointment(User dentist, LocalDateTime requestDate, String note) {
        Appointment appointment = new Appointment(this, dentist, requestDate, note);
        Appointment.addAppointment(appointment);
        this.userAppointments.add(appointment);
    }

	@Override
	public void approveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declineAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelRequest(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ArrayList<Appointment> getApprovedAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ArrayList<Appointment> getDeclinedAppointments() {
		// TODO Auto-generated method stub
		return null;
	}



	

	

}
