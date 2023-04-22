package dental;

import java.util.ArrayList;

public class Appointment {
    
    int id;
    String name;
    String email;
    String contact;
    String sentDate;
    String requestDate;
    String note;
    String dentist;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDentist() {
        return dentist;
    }

    public void setDentist(String dentist) {
        this.dentist = dentist;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Appointment() {
        
    }
    
    public Appointment(int id, String name, String email, String contact, String sentDate, String requestDate, String note, String dentist, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.sentDate = sentDate;
        this.requestDate = requestDate;
        this.note = note;
        this.dentist = dentist;
        this.status = status;
    }
    
    public int setNewID(ArrayList<Appointment> appointments) {
        int current = 0;
        for(int i = 0; i < appointments.size(); i++) {
            current = appointments.get(i).id;
        }
        return current + 1;
    }
    
    public void displayAppointments(ArrayList<Appointment> appointments) {
        for(int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i).id + " " + appointments.get(i).name + " " + appointments.get(i).email + " " + appointments.get(i).contact + " " + appointments.get(i).sentDate + " " + appointments.get(i).requestDate + " " + appointments.get(i).note + " " + appointments.get(i).dentist + " " + appointments.get(i).status);
        }
    }
    
    public void displayAppointmentConsole(int id, String name, String email, String contact, String sentDate, String requestDate, String note, String dentist, String status) {
            System.out.println(this.id + " " + this.name + " " + this.email + " " + this.contact + " " + this.sentDate + " " + this.requestDate + " " + this.note + " " + this.dentist + " " + this.status);
    }
    
    
    
}
