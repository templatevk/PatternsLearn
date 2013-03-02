package composite;

import java.util.*;

public class MessageComposite implements Composite<MessageComposite> {
	private Set<MessageComposite> messages;
	private String message;
	
	public MessageComposite(String message) {
		this.message = message;
		messages = new HashSet<>();
	}
	
	@Override
	public void add(MessageComposite item) {
		messages.add(item);
	}
	
	@Override
	public void remove(MessageComposite item) {
		messages.remove(item);
	}
	
	@Override
	public Iterator<MessageComposite> iterator() {
		return messages.iterator();
	}
	
	public void print() {
		System.out.println(message);
		for (MessageComposite comp : messages) {
			comp.print();
		}
	}
}