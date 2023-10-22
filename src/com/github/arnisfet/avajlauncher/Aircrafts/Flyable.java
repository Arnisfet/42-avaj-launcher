package src.com.github.arnisfet.avajlauncher.aircrafts;
import src.com.github.arnisfet.avajlauncher.weatherTower;

public interface Flyable {
	void updateConditions();
	void registerTower(WeatherTower weatherTower);
}