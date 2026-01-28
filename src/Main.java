
import java.util.Scanner;
import model.Resume;
import service.Screeningservice;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Screeningservice service = new Screeningservice();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== SMART RESUME SCREENING SYSTEM ===");
            System.out.println("1. Enter Candidate Details");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    processResume();
                    break;

                case 2:
                    System.out.println("System closed.");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void processResume() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Skills (comma separated): ");
        String skills = sc.nextLine().toLowerCase();

        Resume resume = new Resume(name, cgpa, skills);

        service.evaluateResume(resume);

        System.out.println("\n--- RESULT ---");
        System.out.println("Name   : " + resume.getName());
        System.out.println("Score  : " + resume.getScore());
        System.out.println("Status : " + resume.getStatus());
    }
}
