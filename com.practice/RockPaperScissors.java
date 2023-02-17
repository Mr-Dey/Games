package com.practice;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        int c=0,u=0;
        for(int x=0;x<5;x++) {
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            String choice = "None";
            int random_number = random.nextInt(3);
            switch (random_number) {
                case 0 -> choice = "Rock";
                case 1 -> choice = "Paper";
                case 2 -> choice = "Scissors";
            }
            System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissors.");
            int user_input = input.nextInt();
            if (user_input > 2 || user_input < 0) {
                System.out.println(user_input + "? This is not a valid input.");
            }
            String user_choice = "None";
            switch (user_input) {
                case 0 -> user_choice = "Rock";
                case 1 -> user_choice = "Paper";
                case 2 -> user_choice = "Scissors";
            }
            if (random_number == user_input) {
                System.out.println("Draw");
            } else if (random_number == 0 && user_input == 1) {
                System.out.println("User win! c->rock,u->paper");
                u++;
            } else if (random_number == 0 && user_input == 2) {
                System.out.println("Computer win! c->rock,u->scissor");
                c++;
            } else if (random_number == 1 && user_input == 0) {
                System.out.println("Computer win! c->paper,u->rock");
                c++;
            } else if (random_number == 1 && user_input == 2) {
                System.out.println("User win! c->paper,u->scissor");
                u++;
            } else if (random_number == 2 && user_input == 0) {
                System.out.println("User win! c->scissor,u->rock");
                u++;
            } else if (random_number == 2 && user_input == 1) {
                System.out.println("computer win! c->scissor,u->paper");
                c++;
            }
        }
        if(u==c){
            System.out.println("Its a Draw!");
        }
        else {
            String result = u > c ? ("Congratulation User win! user score " + u + " Computer score " + c) : ("Computer win! Computer score " + c + "user score " + u);
            System.out.println(result);
        }
    }
}