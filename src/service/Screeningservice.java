package service;
import model.Resume;
public class Screeningservice{
    public void evaluateResume(Resume resume){
        int score=0;
        String skills=resume.getSkills();
        if(resume.getCgpa()>=8.0) score+=40;
        else if(resume.getCgpa()>=7.0 && resume.getCgpa()<8.0) score+=25;
        else score+=10;
        if(skills.contains("java"))
            score+=20;
        if(skills.contains("sql"))
            score+=15;
        if(skills.contains("spring"))
            score+=15;
        if(skills.contains("react"))
            score+=10;
        resume.setScore(score);
        if(score>=70)
            resume.setStatus("SHORTLISTED");
        else
            resume.setStatus("REJECTED");


    }
}
