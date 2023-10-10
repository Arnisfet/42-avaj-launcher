package src.com.github.arnisfet.avajlauncher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Simulator {
	
	private static BufferedReader buf_reader;
	private static int simulationCycles;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Error: Please, put the scenario.txt in the command line as an argument.");
			return ;
		}
	}
	
	public static void InitSimulation (File file) throws SimulationException {
		try {
			buf_reader = new BufferedReader(new FileReader(file));
			simulationCycles = Integer.parseInt(buf_reader.readLine());
			System.out.println(simulationCycles);
		} catch (NumberFormatException | IOException e) {
			throw new SimulationException(e);
		}
	}
	
	public static class SimulationException extends Exception {
		public SimulationException() { super(); }
		public SimulationException(String exception) { super(exception); }
		public SimulationException(Throwable exception) { super(exception); }
	}
}
