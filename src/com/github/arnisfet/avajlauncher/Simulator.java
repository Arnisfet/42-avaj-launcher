package src.com.github.arnisfet.avajlauncher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Simulator {
	/* Private vars */
	private static BufferedReader buf_reader;
	private static int simulationCycles;
	private static WeatherTower weatherTower;
	/* Main class */
	/***	Parsing arguments from the command line (only one arg is possible) ****/
	/****	Parsing of the file (first string - number of cycles in the simulation algorithm) ****/
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Error: Please, put the scenario.txt in the command line as an argument.");
			return ;
		}
		try {
			InitSimulation(new File(args[0]));
			CreateAircrafts();
		} catch (SimulationException e) {
			System.out.println(e.getMessage());
			return ;
			}
	}
	public static void CreateAircrafts() throws SimulationException {
		try {
			String current_line;
			String air_info [];
			weatherTower = new WeatherTower();
			while ((current_line = buf_reader.readLine()) != null) {
				air_info = current_line.split("\\s+");
				for (int i = 0; i != air_info.length; i++) {
					System.out.println(air_info[i]);
				}
			}
			buf_reader.close();
			} catch (IOException e){
				throw new SimulationException(e);
			}
}
	/* Start of the simulation */
	public static void InitSimulation (File file) throws SimulationException {
		try {
			buf_reader = new BufferedReader(new FileReader(file));
			simulationCycles = Integer.parseInt(buf_reader.readLine());
			System.out.println(simulationCycles);
		} catch (NumberFormatException | IOException e) {
			throw new SimulationException(e);
		}
	}
	/* Custom exception class */
	public static class SimulationException extends Exception {
		public SimulationException() { super(); }
		public SimulationException(String exception) { super(exception); }
		public SimulationException(Throwable exception) { super(exception); }
	}
}
