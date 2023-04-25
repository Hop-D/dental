package dental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Message {
	private int id;
	private User sender;
	private User receiver;
	private String message;
	private LocalDateTime sent;
    
    private static ArrayList<Message> messages = new ArrayList<Message>();

    public Message(User sender, User receiver, String message) {
    	this.id = Message.generateId();
    	this.sender = sender;
    	this.receiver = receiver;
    	this.message = message;
    	this.sent = LocalDateTime.now();
    }
    
	public int getId() {
		return id;
	}

	public static int generateId() {
		if(Message.getMessages().isEmpty()) {
			return 1;
		}
		return Message.getMessages().get(Message.getMessages().size()-1).getId()+1;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getSent() {
		return sent.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy"));
	}

	public void setSent(LocalDateTime sent) {
		this.sent = sent;
	}

	public static ArrayList<Message> getMessages() {
		return messages;
	}

	public static void addMessages(Message message) {
		Message.getMessages().add(message);
	}
    
	public static Message getMessageInfo(int id) throws MessageNotFoundException{
		for(Message mess: Message.getMessages()) {
			if(mess.getId() == id) {
				return mess;
			}
		}
		throw new MessageNotFoundException("Message does not exist.");
	}
	
	public void performSend() {
		try {
			((Dentist) User.getUser(this.receiver.getId())).receiveMessage(this);
			((Guest) User.getUser(this.sender.getId())).sendMessage(this);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
