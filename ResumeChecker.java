/**
 * Author - Debag101
 * Date - 15 05 2023
 * Purpose - Resume analyser
 */

import java.util.Scanner;
public class ResumeChecker {
    //Declaring member variables
    String name;
    int age, projectsDone;
    double projectGrading;

    //Empty Constructor to initialize the member variables
    ResumeChecker() {
        name = "";
        age = projectsDone = 0;
        projectGrading = 0;
    }
    //Parameterized constructor to set values
    ResumeChecker(String n,int a, int project_number) {
        name = n;
        age = a;
        projectsDone = project_number;
    }

    //This method checks wether person is eligible
    void isEligible() {
        Scanner in = new Scanner(System.in);
        //Minimum marks to obtain
        int marksThreshold = projectsDone * 80;
        //getting marks
        double marks;
        //age logger 
        if(age < 18 || age >= 60) {
            System.out.println("You are not eligible for the job !");
            in.close();
            return;
        }
        //project count logger
        if(projectsDone <= 0) {
            System.out.println(projectsDone + " " + age);
            System.out.println("You have too little experience for the job !");
            in.close();
            return;
        }
        //Getting project marks
        System.out.printf("\nSo %s it seems that you have done %d projects ?\nTell me their grading 1 by 1",name,projectsDone);
        for(int project = 1; project <= projectsDone; project++) {
            if(project == 1)
                System.out.printf("\nTell the marks of your 1st project => ");
            else if(project == 2)
                System.out.printf("\nTell the marks of your 2nd project => ");
            else if(project == 3)
                System.out.printf("\nTell the marks of your 3rd project => ");
            else
                System.out.printf("\nTell the marks of your %dth project => ",project);
            marks = in.nextDouble();
            if(marks > 100 || marks < 0)
                System.out.println("Invalid marking! Project will not be considered!");
            else 
                projectGrading += marks;
        }
        if(projectGrading >= marksThreshold){
            //Printing marks percentage
            System.out.printf("Your total score is %f percentage\n",(projectGrading / (projectsDone * 100)) * 100);
            System.out.println("You have been chosen for the job !");
        }
        else 
            System.out.println("Sorry you are not capable enough to join us !");
        in.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResumeChecker check;
        String name = "";
        int age = 0, projectsDone = 0;
        //Getting credentials
        try {
            System.out.println("Enter your name => ");
            name = sc.nextLine();
            System.out.println("Enter your age => ");
            age = sc.nextInt();
            System.out.println("How many projects have you done => ");
            projectsDone = sc.nextInt();
        }catch(Exception NumberFormatException) {
            System.out.println("Illegible person!");
        }
        //Passing values to constructor
        check = new ResumeChecker(name, age, projectsDone);
        //Printing result
        check.isEligible();
        sc.close();
    }

}
