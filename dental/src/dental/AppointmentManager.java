package dental;

import java.time.LocalDateTime;

public interface AppointmentManager {
	void approveAppointment(Appointment appointment);
	void declineAppointment(Appointment appointment);
	void bookAppointment(User dentist, LocalDateTime requestDate, String note);
	void cancelRequest(Appointment appointment);

	static final String CANCEL_APP = "Canceled";
	static final String DECLINE_APP = "Declined";
	static final String APPROVE_APP = "Approved";
}
