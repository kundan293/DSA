
       import java.util.ArrayList;
import java.util.Scanner;
       public class DDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<String> studentNames = new ArrayList<>();
            ArrayList<Integer> studentGrades = new ArrayList<>();
            ArrayList<Integer> studentAges = new ArrayList<>();

            boolean running = true;

            while (running) {
                System.out.println("===== Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student by Name");
                System.out.println("4. Remove Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // Add Student
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter student grade: ");
                        int grade = scanner.nextInt();

                        studentNames.add(name);
                        studentAges.add(age);
                        studentGrades.add(grade);

                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        // View All Students
                        if (studentNames.isEmpty()) {
                            System.out.println("No students to display.");
                        } else {
                            System.out.println("List of all students:");
                            for (int i = 0; i < studentNames.size(); i++) {
                                System.out.println("Student " + (i + 1) + ": " + studentNames.get(i) + ", Age: " + studentAges.get(i) + ", Grade: " + studentGrades.get(i));
                            }
                        }
                        break;

                    case 3:
                        // Search Student by Name
                        System.out.print("Enter student name to search: ");
                        String searchName = scanner.nextLine();
                        boolean found = false;

                        for (int i = 0; i < studentNames.size(); i++) {
                            if (studentNames.get(i).equalsIgnoreCase(searchName)) {
                                System.out.println("Student found: " + studentNames.get(i) + ", Age: " + studentAges.get(i) + ", Grade: " + studentGrades.get(i));
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found!");
                        }
                        break;

                    case 4:
                        // Remove Student
                        System.out.print("Enter student name to remove: ");
                        String removeName = scanner.nextLine();
                        boolean removed = false;

                        for (int i = 0; i < studentNames.size(); i++) {
                            if (studentNames.get(i).equalsIgnoreCase(removeName)) {
                                studentNames.remove(i);
                                studentAges.remove(i);
                                studentGrades.remove(i);
                                System.out.println("Student removed successfully!");
                                removed = true;
                                break;
                            }
                        }

                        if (!removed) {
                            System.out.println("Student not found to remove.");
                        }
                        break;

                    case 5:
                        // Exit
                        running = false;
                        System.out.println("Exiting the system...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            scanner.close();
        }
    }



