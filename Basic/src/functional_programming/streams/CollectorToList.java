import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Event{
	private String name;
	private Integer status;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Event(String name, Integer status) {
		this.name = name;
		this.status = status;
	}
	
	public String toString() {
		return "Event(" + name + ", " + status + ")";
	}
}


public class CollectorToList {
	
	public static List<Event> createEvents() {
		return Arrays.asList(new Event("E1", null), new Event("E2", 2));
	}

	public static void main(String[] args) {
		System.out.println("Stream Collector to List");
		var events = createEvents();
		
		events = events.stream().filter(e -> {
//			if(e.getStatus() != null)
//				return e.getStatus().equals(2);
//			return false;
			
			return e.getStatus() != null && e.getStatus().equals(1);
		}).collect(Collectors.toList());
		System.out.println(events);
	}

}
