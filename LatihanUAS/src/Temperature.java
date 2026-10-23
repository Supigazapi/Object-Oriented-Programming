import java.util.Random;

public class Temperature extends Sensor{
	Random random = new Random();
	
	public Temperature(String name, String type) {
		super(name, type);
		
	}

	@Override
	public void useSensor() {
		sensorValue = random.nextInt(50) + 10;
		System.out.printf("%-10s -> %s°C\n", name, sensorValue);
	}

	

}
