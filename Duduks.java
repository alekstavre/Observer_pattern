package observer_patt;

import java.util.logging.Logger;

public class Duduks implements WeatherObserver {

	private static final Logger LOG = Logger.getLogger(Duduks.class.getName());

	public Duduks() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(WeatherType wtype) {
		switch (wtype) {
		case COLD:
			LOG.info("duduks feel cold");
			break;
		case WINDY:
			LOG.info("duduks feel breezy");
			break;
		case RAINY:
			LOG.info("duduks feel blue");
			break;
		case SUNNY:
			LOG.info("duduks feel hot");
			break;
		default:
			break;
		}

	}

}
