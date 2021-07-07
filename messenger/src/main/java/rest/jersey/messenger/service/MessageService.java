package rest.jersey.messenger.service;

import java.util.ArrayList;
import java.util.List;

import rest.jersey.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1=new Message(1L,"Hello World","kacper");
		Message m2=new Message(2L,"Hello Jersey","kacper");
		List<Message>messeges=new ArrayList();
		messeges.add(m1);
		messeges.add(m2);
		return messeges;
				
	}
	
}
