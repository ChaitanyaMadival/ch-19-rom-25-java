package com.xworkz.company.company;

import com.xworkz.company.projects.Project;

public class Company {

    Project[] projects =new Project[20];
    int index;

    public boolean addProject(Project project){
        boolean isAdded=false;
        if (project !=null){
            projects[index++]=project;
            isAdded=true;

        }else {
            System.out.println("invalid project");
        }
        return isAdded;

    }

    public void getProject(){
        for (Project project :projects){
            System.out.println("name is "+project.getProjectName());
            System.out.println("Id :  "+project.getProjectId());
            System.out.println("start date is"+project.getStartDate());
            System.out.println("end date is : "+project.getEndDate());
            System.out.println("---------------------------");
        }
    }
}
