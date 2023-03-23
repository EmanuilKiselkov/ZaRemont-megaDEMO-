package com.example.zaremont;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ZaRemontApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaRemontApplication.class, args);
        Scanner sc = new Scanner(System.in);
        //find number
        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println("Number is:" + number);

        //take photos
        System.out.println("Please take at least 1 photo");
        System.out.println("Photo taken");

        //ask if rod is ok
        System.out.println("Is rod ok?");
        String answer = sc.next();
        if(answer.equals("ok")){
            System.out.println("Rod is ok");
        } else if (answer.equals("not ok")) {
            System.out.println("Rod is not ok");
        } else if (answer.equals("not sure")) {
            System.out.println("You are not sure, manager must check it");
        }
        //ask if tube is ok
        System.out.println("Is Tube ok?");
        String answerTube = sc.next();
        if(answerTube.equals("ok")){
            System.out.println("Tube is ok");
        } else if (answer.equals("not ok")) {
            System.out.println("Tube is not ok");
        } else if (answer.equals("not sure")) {
            System.out.println("You are not sure, manager must check it");
        }
        //ask if piston is ok
        System.out.println("Is Piston ok?");
        String answerPiston = sc.next();
        if(answer.equals("ok")){
            System.out.println("Piston is ok");
        } else if (answer.equals("not ok")) {
            System.out.println("Piston is not ok");
        } else if (answer.equals("not sure")) {
            System.out.println("You are not sure, manager must check it");
        }
    }
}
