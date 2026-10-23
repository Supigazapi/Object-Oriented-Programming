import java.util.ArrayList;
import java.util.Scanner;

class Data {
    String name;
    String pass;
    String phone;

    public Data(String name, String pass, String phone) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
    }
}

public class menu {
	
	static Scanner sc = new Scanner(System.in);
    static ArrayList<Data> userList = new ArrayList<>();
	
	public menu() {
		
	}

	public static void main(String[] args) {
		int choice;
		
		do {
            try {
				System.out.println("1. Input Data");
				System.out.println("2. Show Data");
				System.out.println("3. Delete Data");
				System.out.println("4. Exit");
				System.out.print("Your choice: ");
				choice = sc.nextInt(); sc.nextLine();

				switch (choice) {
				    case 1:
                    inputData();
				        break;
				    case 2:
                    showData();
				        break;
				    case 3:
                    deleteData();
				        break;
				    case 4:
				        break;
				    default:
				        System.out.println("Invalid choice!");
				}
			} catch (Exception e) {
				System.out.println("Please enter a number (1-4)!");
				sc.nextLine();
				choice = 0;
			}
        } while (choice != 4);
   	}
	
	static void inputData() {
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Pass : ");
        String pass = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();

        userList.add(new Data(name, pass, phone));
        System.out.println("New data is added!");
    }
	
	static void showData() {
	    if (userList.isEmpty()) {
	        System.out.println("\n| No data exists! |");
	    } else {
	        System.out.println("\n--------------------------------------------------");
	        System.out.printf("%-4s | %-15s | %-15s | %-15s\n", "No", "Name", "Pass", "Phone");
	        System.out.println("--------------------------------------------------");
	        for (int i = 0; i < userList.size(); i++) {
	        	Data data = userList.get(i);
	            System.out.printf("%-4d | %-15s | %-15s | %-15s\n", i + 1, data.name, data.pass, data.phone);
	        }
	        System.out.println("--------------------------------------------------");
	    }
	}

    static void deleteData() {
        if (userList.isEmpty()) {
            System.out.println("No data to delete!");
            return;
        }

        showData();
        System.out.print("Input data number to be deleted: ");
        int idx = sc.nextInt(); sc.nextLine();

        if (idx > 0 && idx <= userList.size()) {
            userList.remove(idx - 1);
            System.out.println("Data is removed!");
        } else {
            System.out.println("Invalid number!");
        }
    }

}
