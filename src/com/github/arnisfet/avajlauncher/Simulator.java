package src.com.github.arnisfet.avajlauncher;

public class Simulator {
	
	private static BufferedReader buf_reader;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Error: Please, put the scenario.txt in the command line as an argument.");
			return ;
		}
	}
	public static InitSimulation (File file) {
		buf_reader = new BufferedReader(new FileReader(file));
	}
	
	}
}