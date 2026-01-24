package service;
import model.Job;
import model.Resume;

public class Scoringservice {
    public static int calculateScore(Resume resume,Job job){
        int score=0;
        for(String skill: resume.getSkills()){
            if(job.getRequiredSkills().contains(skill)){
                score+=10;
            }
        }
        if(resume.getYearOfExperience()>=job.getMinExperience()){
            score+=20;
            }
            return score;
        }

    }
    

