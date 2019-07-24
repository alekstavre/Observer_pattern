package observer_patt;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Weather {

	private static final Logger LOG = Logger.getLogger(Weather.class.getName());

	private WeatherType wtype;
	private List<WeatherObserver> observers;

	public Weather() {
		observers = new ArrayList<>();
		wtype = WeatherType.COLD;
	}

	void addObserver(WeatherObserver wobserv) {
		observers.add(wobserv);
	}

	void removeObserver(WeatherObserver wobserv) {
		observers.remove(wobserv);
	}

	void timePasses() {
		WeatherType[] enumVal = WeatherType.values();
		wtype = enumVal[(wtype.ordinal() + 1) % enumVal.length];
		LOG.info("weather changed to "+ wtype);
		notifyObservers();
	}

	void notifyObservers() {
		for (WeatherObserver observer : observers) {
			observer.update(wtype);
		}
	}

}
