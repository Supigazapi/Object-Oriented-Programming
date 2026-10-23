import java.util.Random;

public class Humidity extends Sensor{
	Random random = new Random();
	int threshold;
	
	public Humidity(String name, String type, Integer threshold) {
		super(name, type);
		this.threshold = threshold;
	}

	@Override
	public void useSensor() {
		sensorValue = random.nextInt(90) + 10;
		System.out.printf("%-10s -> %s%% (threshold 100)\n", name, sensorValue);
	}
}
