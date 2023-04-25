package dental;

import java.time.LocalDateTime;

public interface PatientAppointmentBooker {

	void bookAppointment(User dentist, LocalDateTime requestDate, String note, String contact);
	void cancelRequest(Appointment appointment);
	
}
