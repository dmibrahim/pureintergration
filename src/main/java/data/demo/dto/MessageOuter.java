package data.demo.dto;

public class MessageOuter {
	public Message message;
	public String status;
	public MessageOuter(String status) {
		super();
		this.status = status;
		message = new Message();
	}
	
	

}
