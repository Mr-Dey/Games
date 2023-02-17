package com.practice;
import java.util.Scanner;

public class LeapYear{
    public static void main(String args[]){
        System.out.println("Enter a year & i'll tell you it is a leap year or not!");
        Scanner input=new Scanner(System.in);
        int userInput= input.nextInt();
        String result;
        if(userInput%100!=0) {
            result = userInput % 4 == 0 ? "Yes its a LeapYear!" : "No its not a LeapYear";
        }
        else{
            result = userInput % 400 == 0 ? "Yes its a LeapYear!" : "No its not a LeapYear";
        }
        System.out.println(result);
    }
}