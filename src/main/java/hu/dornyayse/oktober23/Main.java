package hu.dornyayse.oktober23;

import com.donekey.server.common.Server;

import hu.dornyayse.oktober23.respository.Db;
import hu.dornyayse.oktober23.respository.Event;


public class Main {
	public static void main(String args[]) {
		Server.as()
		.port(80)
		.handleRest(Api.class)
		.build();
		
		System.out.println(Db.load(Event.class, "event_id = 1").name);
		
	}
}
