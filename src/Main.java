import java.util.*;
import model.Job;
import model.Resume;
import service.Matchingservice;
public class Main{
    public static void main(String[] args) {
        Resume r1=new Resume("Shreshta Reddy",2,Set.of("Java","DSA"));
        Resume r2=new Resume("Sahasra",0,Set.of("Java"));
        Resume r3=new Resume("Kavitha",3,Set.of("DSA","Spring","Java"));
        Job job=new Job("Java Developer",Set.of("Java","DSA","Spring"),1);
        Set<Resume> resumes=new HashSet<>(List.of(r1,r2,r3));
        Matchingservice matchingservice=new Matchingservice();
        System.out.println("Skill Gap Analysis:");
        for(Resume resume:resumes){
            Set<String> missingSkills=matchingservice.getMissingSkills(resume,job);
            System.out.println("Candidate: "+resume.getCandidateName()+", Missing Skills: "+missingSkills);
        }
        
        
            
    }
}

        

    

