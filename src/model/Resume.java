package model;
public class Resume{
    private String name;
    private double cgpa;
    private String skills;
    private int score;
    private String status;
    public Resume(String name,double cgpa,String skills){
        this.name=name;
        this.cgpa=cgpa;
        this.skills=skills;
    }
        public String getName(){
            return name;
        }
        public double getCgpa(){
            return cgpa;
        }
        public String getSkills(){
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


