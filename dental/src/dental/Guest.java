package dental;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Guest extends User{
    
    // Constructor
    public Guest(String name, String email, String password) {
        super(User.generateID(), name, email, password, User.GUEST_TYPE);
    } 
    
    // Getters and setters
   
    
    // Methods
    public void sendMessageToDentist(Dentist dentist, String message) {
        // send message to the dentist
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

}
