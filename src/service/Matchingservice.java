package service;
import model.Resume;
import model.Job;
import java.util.HashSet;
import java.util.Set;
public class Matchingservice{
    public Set<String> getMissingSkills(Resume resume,Job job){
        Set<String> missingSkills=new HashSet<>(job.getRequiredSkills());
        missingSkills.removeAll(resume.getSkills());
        return missingSkills;
    }
}

