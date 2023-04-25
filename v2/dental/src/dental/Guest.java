package dental;

import java.util.ArrayList;

public class Guest extends User{
	
	private ArrayList<Message> sentMessages;
    
    public Guest(String name, String email, String password) {
        super(User.generateID(), name, email, password, User.GUEST_TYPE);
        this.sentMessages = new ArrayList<Message>();
    }

	public ArrayList<Message> getSentMessages() {
		return sentMessages;
	}

	public void addSentMessages(Message sentMessage) {
		this.sentMessages.add(sentMessage);
	} 
	
	public void sendMessage(Message message) {
		this.sentMessages.add(message);
	}
    
    

	

}
