package src.com.github.arnisfet.avajlauncher.aircrafts;

import src.com.github.arnisfet.avajlauncher.flyable;
import io.github.lunairi.avaj_launcher.Simulator.SimulationException;

public class AircraftFactory {
	public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) throws SimulationException {
		if ((longitude < 0) || (latitude < 0) || (height < 0)) {
			throw new SimulationException("Cannot have negative coordinates for the aircrafts");
		}
		if (height > 100) {
			height = 100;
		}
		Coordinates coordinates = new Coordinates(longitude, latitude, height);
		if (type.toLowerCase().equals("helicopter")) {
			System.out.println(type + " " + name + " have been created.");
			return new Helicopter(name, coordinates);
		}
		else if (type.toLowerCase().equals("helicopter")) {
			System.out.println(type + " " + name + " have been created.");
			return new Helicopter(name, coordinates);
		}
		else if (type.toLowerCase().equals("jetplane")) {
			System.out.println(type + " " + name + " have been created.");
			return new Jetplane(name, coordinates);
		}
		else if (type.toLowerCase().equals("baloon")) {
			System.out.println(type + " " + name + " have been created.");
			return new Baloon(name, coordinates);
		}
		return null;
	}

}