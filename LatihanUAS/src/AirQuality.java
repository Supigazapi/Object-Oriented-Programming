import java.util.Random;

public class AirQuality extends Sensor{
	int threshold;
	Random random = new Random();
	
	public AirQuality(String name, String type, Integer threshold) {
		super(name, type);
		this.threshold = threshold;
	}

	@Override
	public void useSensor() {
		sensorValue = random.nextInt(500);
		if(sensorValue > 300) {
			System.out.printf("%-10s -> %s AQI (threshold 300, Anomali)\n", name, sensorValue);
		} else System.out.printf("%-10s -> %s AQI (threshold 300)\n", name, sensorValue);
	}
}
