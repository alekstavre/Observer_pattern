package observer_patt;

import java.util.logging.Logger;

public class Main_app {

	private static final Logger LOG = Logger.getLogger(Main_app.class.getName());

	public static void main(String[] args) {

		Weather weather = new Weather();
		weather.addObserver(new Duduks());
		weather.timePasses();

	}

}
