
package dental;

import java.util.ArrayList;

public class Dentist extends User implements DentistAppointmentManager{
    
	private ArrayList<Appointment> approvedAppointments;
	private ArrayList<Appointment> declinedAppointments;
	private ArrayList<Appointment> userAppointments;
	private ArrayList<Message> receivedMessages;
    
    // Constructor
    public Dentist(String name, String email, String password) {
        super(User.generateID(), name, email, password, User.DENTIST_TYPE);
        this.approvedAppointments = new ArrayList<Appointment>();
        this.declinedAppointments = new ArrayList<Appointment>();
        this.userAppointments = new ArrayList<Appointment>();
        this.receivedMessages = new ArrayList<Message>();
    } 
    
    
    public ArrayList<Appointment> getApprovedAppointments() {
		return approvedAppointments;
	}


	public ArrayList<Appointment> getDeclinedAppointments() {
		return declinedAppointments;
	}
	public ArrayList<Appointment> getUserAppointments() {
		return userAppointments;
	}


	public void approveAppointment(Appointment appointment) {
    	declinedAppointments.remove(appointment);
    	approvedAppointments.add(appointment);
    	for(Appointment app: Appointment.getAppointments()) {
    		if(app.getId() == appointment.getId()) {
    			app.setStatus(APPROVE_APP);
    		}
    	}
    }
    
    public void declineAppointment(Appointment appointment) {
    	approvedAppointments.remove(appointment);
    	declinedAppointments.add(appointment);
    	for(Appointment app: Appointment.getAppointments()) {
    		if(app.getId() == appointment.getId()) {
    			appointment.setStatus(DECLINE_APP);
    		}
    	}
    }	
    
    public void userAppointments(Appointment appointment) {
    	userAppointments.add(appointment);
    }
    
    
    
    public ArrayList<Message> getReceivedMessages() {
		return receivedMessages;
	}


	public void addReceivedMessages(Message receivedMessage) {
		this.receivedMessages.add(receivedMessage);
	}


	public void receiveMessage(Message message) {
    	this.receivedMessages.add(message);
    }

}