package model;
import java.util.List;
public class Resume{
    private String name;
    private int experience;
    private double cgpa;
    private String education;
    private List<String> skills;
    private int score;
    private String status;
    public Resume(String name,int experience,double cgpa,String education,List<String> skills){
        this.name=name;
        this.experience=experience;
        this.cgpa=cgpa;
        this.education=education;
        this.skills=skills;
    }
        public String getName(){
            return name;
        }
        public int getExperience(){
            return experience;
        }
        public double getCgpa(){
            return cgpa;
        }
        public String getEducation(){
            return education;
        }
        public List<String> getSkills(){
            return skills;
        }
        public int getScore(){
            return score;
        }
        public String getStatus(){
            return status;
        }
        public void setScore(int score){
            this.score=score;
        }
        public void setStatus(String status){
            this.status=status;
        }
        
        

    }


