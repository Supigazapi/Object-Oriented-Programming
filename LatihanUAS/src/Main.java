import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Sensor> sensor = new ArrayList<Sensor>();
	public Main() {
		while (true) {
			System.out.println("1. Register New Sensor");
			System.out.println("2. Collect Data from All Sensors");
			System.out.println("3. Delete Sensor");
			System.out.println("4. Exit");
			int choice = 0;
			boolean isValid = true;
			while (isValid) {
				try {
					System.out.print("Your Choice [1-4]: ");
					choice = sc.nextInt(); sc.nextLine();
					switch (choice) {
					case 1:
						registerNewSensor();
						break;
					case 2:
						collectData();
						break;
					case 3:
						deleteSensor();
						break;
					case 4:
						System.exit(0);
					}
				} catch (Exception e) {
					sc.nextLine();
				} 
				if(choice >= 1 && choice <= 4) {
					isValid = false;
				}
			}
		}
		
	}
	private void registerNewSensor() {
		String name, type;
		System.out.print("Sensor Name: ");
		name = sc.nextLine();
		boolean isValid = true;
		while (isValid) {
			isValid = false;
			try {
				System.out.print("Sensor Type [Temperature/Humidity/Air Quality]: ");
				type = sc.nextLine();

				if (type.equals("Temperature")) {
					sensor.add(new Temperature(name, type));
				} else if (type.equals("Humidity")) {
					int threshold = -1;
					while (threshold <= 0 || threshold >= 100) {
						try {
							System.out.print("Threshold [0-100]: ");
							threshold = sc.nextInt();
							sc.nextLine();
						} catch (Exception e) {
							sc.nextLine();
						}
					}
					Humidity newHumidity = new Humidity(name, type, threshold);
					sensor.add(newHumidity);
				} else if (type.equals("Air Quality")) {
					int threshold = -1;
					while (threshold <= 0 || threshold >= 300) {
						try {
							System.out.print("Threshold [0-300]: ");
							threshold = sc.nextInt();
							sc.nextLine();
						} catch (Exception e) {
							sc.nextLine();
						}
					}
					sensor.add(new AirQuality(name, type, threshold));
				} else isValid = true;
			} catch (Exception e) {
				sc.nextLine();
			} 
		}
	}
	private void collectData() {
		System.out.println("Collecting data...");
		for (Sensor sensor2 : sensor) {
			sensor2.useSensor();
		}
	}
	private void deleteSensor() {
		System.out.println("Daftar Sensor");
		System.out.println("---------------");
		int count = 1;
		for (Sensor sensor2 : sensor) {
			System.out.printf("%-4d | %-10s | %-10s \n", count++, sensor2.getName(), sensor2.getType());
		}
		String delete;
		System.out.print("Sensor Name to be Deleted: ");
		delete = sc.nextLine();
		
		int idx = 0;
		for (Sensor sensor2 : sensor) {
			if(!sensor2.getName().equals(delete)) {
				idx++;
			} else {
				break;
			}
		}
		sensor.remove(idx);
		
	}
	public static void main(String[] args) {
		new Main();
	}
}