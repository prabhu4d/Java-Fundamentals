package Collections_Generics.ListDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Attendee{
	private Integer id;
	private Integer eventId;
	
	

	public Attendee(Integer id, Integer eventId) {
		super();
		this.id = id;
		this.eventId = eventId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	
}

class SingleEvent{
	private Integer id;
	private List<Integer> attendeeIds;
	
	public SingleEvent(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	public List<Integer> getAttendeeIds(){
		return attendeeIds;
	}
	
//	public void setAttendeeIds(Integer attendeeId) {
//		if(attendeeIds == null)
//			attendeeIds = new ArrayList<>();
//		attendeeIds.add(attendeeId);
//	}
	
	public void setAttendeeIds(List<Integer> ids) {
		attendeeIds = ids;
	}
}

public class AddElements {
	public static void main(String[] args) {
		List<SingleEvent> events  = Arrays.asList(new SingleEvent(1), new SingleEvent(2), new SingleEvent(3), new SingleEvent(4));
		List<Attendee> attendees = Arrays.asList(new Attendee(1, 1), 
				new Attendee(2, 1), 
				new Attendee(3, 2),
				new Attendee(4, 2), 
				new Attendee(5, 3), 
				new Attendee(6, 3));
		
		attendees.forEach(attendee -> {
			System.out.println(attendee.getId() + " " + attendee.getEventId());
		});
		
		events.forEach(event -> {
			event.setAttendeeIds(attendees.stream().filter(attendee -> attendee.getEventId().equals(event.getId())).map(attendee -> attendee.getId()).collect(Collectors.toList()));
		});
		
//		attendees.stream().filter(attendee -> {
//			System.out.println(attendee.getEventId());
//			return true;
//		});
		
		events.forEach(e ->{
			System.out.println(e.getAttendeeIds());
		});
	}
}
