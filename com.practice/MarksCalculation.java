package com.practice;
import java.util.Scanner;
class MarksCalculation{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("This is a Marks calculator,return you are pass or not.\nEnter your marks out of 100.");
        System.out.println("Advanced Java--");
        float java_marks=input.nextFloat();
        System.out.println("Automate--");
        float automete_marks=input.nextFloat();
        System.out.println("Formal_Language--");
        float formal_language_marks=input.nextFloat();
        float total_percentage=(java_marks+automete_marks+formal_language_marks)*1/3f;
        if(java_marks>100.0 || automete_marks>100.0||formal_language_marks>100.0){
            System.out.println("Invalid Number.");
        }
        else if(java_marks<35.0 || automete_marks<35.0||formal_language_marks<35.0){
            System.out.println("You have got less then 35 in a subject & You are fail.");
        }
        else if(total_percentage<35.0){
            System.out.println("You Have got total "+total_percentage+"% & you are Fail.");
        }
        else{
            System.out.println("You Have got total" +total_percentage+"% & you are Passed.");
        }
    }
}