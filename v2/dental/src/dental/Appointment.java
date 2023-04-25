package dental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Appointment {
    
	private int id;
    private User patient;
    private User dentist;
    private LocalDateTime setDate;
    private LocalDateTime requestDate;
    private String note;
    private String status;
    
    private static ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    
    
    public static ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	public static void addAppointment(Appointment appointments) {
		Appointment.appointments.add(appointments);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public User getDentist() {
		return dentist;
	}

	public void setDentist(Dentist dentist) {
		this.dentist = dentist;
	}

	public String getSetDate() {
		return setDate.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy"));
	}

	public void setSetDate(String sentDate) {
		this.setDate = LocalDateTime.now();
	}

	public String getRequestDate() {
		
		return requestDate.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy"));
	}

	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
    public Appointment(User patient, User dentist, LocalDateTime requestDate, String note) {
        if(appointments.isEmpty()) 
        	this.id = 1;
        else
        	this.id = appointments.get(appointments.size()-1).getId()+1;
        

        this.patient = patient;
        this.dentist = dentist;
        this.note = note;
        this.requestDate = requestDate;
        this.status = "Pending";
        this.setDate = LocalDateTime.now();
    }
    
    
    public void displayAppointments(ArrayList<Appointment> appointments) {
        for(int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i).id + " " + appointments.get(i).getDentist().getName() + " " + appointments.get(i).getPatient().getName() + " " + appointments.get(i).getRequestDate() + " " + appointments.get(i).getSetDate() + " " + appointments.get(i).getNote() + " " + appointments.get(i).getStatus());
        }
    }
    
    public static Appointment getApp(int id) throws AppointmentNotFoundException {

    	for(Appointment app: appointments) {
    		if(app.getId() == id) {
    			return app;
    		}
    	}
        throw new AppointmentNotFoundException("Appointment does not exist.");
    }


    
//    public void displayAppointmentConsole(int id, String name, String email, String contact, String sentDate, String requestDate, String note, String dentist, String status) {
//            System.out.println(this.id + " " + this.name + " " + this.email + " " + this.contact + " " + this.sentDate + " " + this.requestDate + " " + this.note + " " + this.dentist + " " + this.status);
//    }
    
    
    
}
