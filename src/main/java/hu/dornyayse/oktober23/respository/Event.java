package hu.dornyayse.oktober23.respository;

import javax.persistence.Table;

@Table(name = "event")
public class Event {
	public int event_id;
	public String name;

}
