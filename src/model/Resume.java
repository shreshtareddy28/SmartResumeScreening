package model;

import java.util.Set;
public class Resume{
    private String candidateName;
    private int yearOfExperience;
    private Set<String> skills;
    public Resume(String candidateName,int yearOfExperience,Set<String> skills){
        this.candidateName=candidateName;
        this.yearOfExperience=yearOfExperience;
        this.skills=skills;
    }
    public String getCandidateName(){
        return candidateName;
    }
    public int getYearOfExperience(){
        return yearOfExperience;
    }
    public Set<String> getSkills(){
        return skills;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Resume resume=(Resume)o;
        return candidateName.equalsIgnoreCase(resume.candidateName);
    }
    @Override
    public int hashCode(){
        return candidateName.toLowerCase().hashCode();
    }
}