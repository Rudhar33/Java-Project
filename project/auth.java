import java.util.Scanner;

public class auth {
    // Demo data for Student ID and Name validation
    private static String[] studentIDs = {"001", "002", "003"};
    private static String[] studentNames = {"Alice", "Bob", "Charlie"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Authentication
        System.out.print("Enter your student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        boolean isAuthenticated = authenticateStudent(studentID, name);
        if (!isAuthenticated) {
            System.out.println("Invalid student ID or name. Access denied.");
            return;
        }

        System.out.println("Welcome, student under Student ID " + studentID + ". You are authorized to enter the system.");

        // Menu
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nPlease enter choice:\n" +
                    "1. Insert the record\n" +
                    "2. Select the record (For viewing the existing record)\n" +
                    "3. Update the record\n" +
                    "4. Delete the record\n" +
                    "5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertRecord();
                    break;
                case 2:
                    selectRecord();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static boolean authenticateStudent(String studentID, String name) {
        for (int i = 0; i < studentIDs.length; i++) {
            if (studentID.equals(studentIDs[i]) && name.equals(studentNames[i])) {
                return true;
            }
        }
        return false;
    }

    private static void insertRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the record to be inserted: ");
        String record = scanner.nextLine();
        // Validation for the record can be added here

        System.out.println("Record inserted successfully.");
    }

    private static void selectRecord() {
        System.out.println("Existing record selected.");
    }

    private static void updateRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the record ID to be updated: ");
        String recordID = scanner.nextLine();
        // Validation for the record ID can be added here

        System.out.print("Enter the new record value: ");
        String newRecord = scanner.nextLine();
        // Validation for the new record can be added here

        System.out.println("Record updated successfully.");
    }

    private static void deleteRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the record ID to be deleted: ");
        String recordID = scanner.nextLine();
        // Validation for the record ID can be added here

        System.out.println("Record deleted successfully.");
    }
}
