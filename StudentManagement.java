import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<String> students = new ArrayList<>();
    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==== STUDENT MANAGEMENT SYSTEM ====");

        System.out.print("Enter username: ");
        String username = obj.nextLine();

        System.out.print("Enter password: ");
        String password = obj.nextLine();

        if (username.equals("Sabita") && password.equals("1234")) {

            System.out.println("Login Successful!");

            int choice;

            do {

                System.out.println("\n===== MENU =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = obj.nextInt();
                obj.nextLine();

                if (choice == 1) {

                    addStudent();

                } else if (choice == 2) {

                    viewStudents();

                } else if (choice == 3) {

                    searchStudent();

                } else if (choice == 4) {

                    deleteStudent();

                } else if (choice == 5) {

                    System.out.println("Thank you!");

                } else {

                    System.out.println("Invalid choice!");

                }

            } while (choice != 5);

        } else {

            System.out.println("Invalid username or password!");

        }
    }

    // Add Student
    static void addStudent() {

        System.out.print("Enter Student ID: ");
        String id = obj.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = obj.nextLine();

        // Check duplicate roll number
        if (students.contains(roll)) {

            System.out.println("Roll Number already exists!");

        } else {

            System.out.print("Enter Name: ");
            String name = obj.nextLine();

            System.out.print("Enter Department: ");
            String department = obj.nextLine();

            System.out.print("Enter Semester: ");
            String semester = obj.nextLine();

            System.out.print("Enter Email: ");
            String email = obj.nextLine();

            System.out.print("Enter Phone: ");
            String phone = obj.nextLine();

            System.out.print("Enter Address: ");
            String address = obj.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = obj.nextDouble();
            obj.nextLine();

            if (cgpa >= 0 && cgpa <= 10) {

                students.add(roll);

                System.out.println("Student Added Successfully!");

            } else {

                System.out.println("CGPA must be between 0 and 10!");

            }
        }
    }

    // View Students
    static void viewStudents() {

        if (students.size() == 0) {

            System.out.println("No students available!");

        } else {

            System.out.println("\n===== STUDENT LIST =====");

            for (String roll : students) {

                System.out.println("Roll Number: " + roll);

            }
        }
    }

    // Search Student
    static void searchStudent() {

        System.out.print("Enter Roll Number: ");
        String roll = obj.nextLine();

        if (students.contains(roll)) {

            System.out.println("Student Found!");

        } else {

            System.out.println("Student Not Found!");

        }
    }

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter Roll Number: ");
        String roll = obj.nextLine();

        if (students.remove(roll)) {

            System.out.println("Student Deleted Successfully!");

        } else {

            System.out.println("Student Not Found!");

        }
    }
}