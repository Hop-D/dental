package dental;

import java.time.LocalDateTime;

public interface DentistAppointmentManager {
	void approveAppointment(Appointment appointment);
	void declineAppointment(Appointment appointment);

	static final String DECLINE_APP = "Declined";
	static final String APPROVE_APP = "Approved";
	static final String PENDING_APP = "Pending";
}
