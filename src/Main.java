import java.util.*;
import model.Resume;
import service.Screeningservice;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Screeningservice screeningService = new Screeningservice();

        System.out.println("=== Smart Resume Screening System ===");

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Skills (comma separated): ");
        String skillsInput = sc.nextLine();
        List<String> skills = Arrays.asList(skillsInput.split(","));

        System.out.print("Enter Education (Bachelor / Master): ");
        String education = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        Resume resume = new Resume(name,experience,cgpa,education,skills);


    
        screeningService.evaluateResume(resume);
        System.out.println("\n===== SCREENING RESULT =====");
        System.out.println("Candidate Name : " + resume.getName());
        System.out.println("Experience     : " + resume.getExperience() + " years");
        System.out.println("Skills         : " + resume.getSkills());
        System.out.println("Education      : " + resume.getEducation());
        System.out.println("Screening Score      : " + resume.getScore());
        System.out.println("Final Status   : " + resume.getStatus());

        System.out.println("======================");
        sc.close();
    }
}
