package service;
import java.util.List;
import model.Resume;
public class Screeningservice{
    public void evaluateResume(Resume resume){
        int score=0;
        List<String> skills=resume.getSkills();
        if(resume.getCgpa()>=8.0) score+=20;
        else if(resume.getCgpa()>=7.0 && resume.getCgpa()<8.0) score+=15;
        else score+=5;
        if(skills.contains("Java"))
            score+=20;
        if(skills.contains("SQL"))
            score+=15;
        if(skills.contains("Spring"))
            score+=20;
        if(skills.contains("AWS"))
            score+=10;
        int experience=resume.getExperience();
        if(experience>=3) score+=20;
        else if(experience>=1 && experience<3) score+=15;
        else score+=5;
        String education=resume.getEducation();
        if(education.contains("bachelor")) score+=10;
        else if(education.contains("master")) score+=20;
        resume.setScore(score);
        if(score>=70)
            resume.setStatus("SHORTLISTED");
        else
            resume.setStatus("REJECTED");


    }
}
