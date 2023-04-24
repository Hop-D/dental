
package dental;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Dentist extends User {
    
	private ArrayList<Appointment> approvedAppointments;
	private ArrayList<Appointment> declinedAppointments;
    
    // Constructor
    public Dentist(String name, String email, String password) {
        super(User.generateID(), name, email, password, User.DENTIST_TYPE);
        this.approvedAppointments = new ArrayList<Appointment>();
        this.declinedAppointments = new ArrayList<Appointment>();
    } 
    
    
    public ArrayList<Appointment> getApprovedAppointments() {
		return approvedAppointments;
	}


	public ArrayList<Appointment> getDeclinedAppointments() {
		return declinedAppointments;
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
    

	public void viewAllApproved(ArrayList<Appointment> appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookAppointment(User dentist, LocalDateTime requestDate, String note) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelRequest(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getContact() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected void setContact(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ArrayList<Appointment> getUserAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

}