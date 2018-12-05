// The reusable framework for control systems.
package ch11.E13;

import java.util.*;

public class Controller {

	private List<Event> eventList = new LinkedList<Event>();

	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		if (eventList.size() > 0) {
			Iterator<Event> it = new LinkedList<Event>(eventList).iterator();
			while (it.hasNext()) {
				Event e = it.next();
				if (e.ready()) {
					System.out.println(e);
					e.action();
					it.remove();
				}
			}
		}
	}
} /// :~
