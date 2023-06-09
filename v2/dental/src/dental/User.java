
package dental;

import java.util.ArrayList;

public abstract class User {
    
    private int id;
    private String name;
    private String email;
    private String password;
    private String type;
    private String contact;
    
    private static ArrayList<User> users = new ArrayList<User>();
    
    public static final String DENTIST_TYPE = "Dentist";
    public static final String PATIENT_TYPE = "Patient";
    public static final String GUEST_TYPE = "Guest";
    
    
    public static ArrayList<User> getUsers() {
		return users;
	}

	public static void addUsers(User user) {
		User.users.add(user);
	}
	
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
    
    public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public User(int id, String name, String email, String password, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    
    public void displayUserConsole(int id, String name, String email, String password, String type) {
            System.out.println(this.id + " " + this.name + " " + this.email + " " + this.password + " " + this.type);
    }
    
    public static User getUser(int id) throws UserNotFoundException {

    	for(User u: users) {
    		if(u.getId() == id) {
    			return u;
    		}
    	}
        throw new UserNotFoundException("Dentist does not exist.");
    }
    
    protected static int generateID() {
    	if(users.isEmpty()) {
    		return 1;
    	}
    	return users.get(users.size()-1).getId()+1;
    } 
    
    public static int countUserType(String userType) {
    	int i= 0;
    	for(User u: users) {
    		if(u.getType().equals(userType)) {
    			i++;
    		}
    	}
    	return i;
    }

	

//	protected ArrayList<Appointment> getUserAppointments() throws MethodAccessDeniedException {
//		throw new MethodAccessDeniedException();
//	}
//
//	protected void approveAppointment(Appointment temp) throws MethodAccessDeniedException {
//		throw new MethodAccessDeniedException();
//	}
//
//	protected void declineAppointment(Appointment temp) throws MethodAccessDeniedException {
//		throw new MethodAccessDeniedException();
//	}
//
//	protected ArrayList<Appointment> getApprovedAppointments() throws MethodAccessDeniedException {
//		throw new MethodAccessDeniedException();
//	}
//
//	protected ArrayList<Appointment> getDeclinedAppointments() throws MethodAccessDeniedException {
//		throw new MethodAccessDeniedException();
//	}
    
}
