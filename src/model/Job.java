package model;
import java.util.Set;

public class Job {
    private String jobTitle ;
    private Set<String> requiredSkills ;
    private int minExperience ;
    public Job(String jobTitle, Set<String> requiredSkills, int minExperience) {
        this.jobTitle = jobTitle;
        this.requiredSkills = requiredSkills;
        this.minExperience = minExperience;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public Set<String> getRequiredSkills() {
        return requiredSkills;
    }
    public int getMinExperience() {
        return minExperience;
    }

    
}
