package com.lecture_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question1 = "1. Kā sauc valmierieti, kurš sāka Valmiermuižā būvēt alus darītavu?";
        String question2 = "2. Kurā gadā pirmoreiz Valmiermuižā darīto alu var nobaudīt ikviens?";
        String question3 = "3. Kādas klasisko alus garšas ir pieejamas Valmiermuižā?";
        String question4 = "4. Cik liela ir Valmiermuižas alus saime?";
        String question5 = "5. Kam pieder Valmiermuižas alus?";

        String answer1 = "Aigars Ruņģis.";
        String answer2 = "2009 gadā, pēc gada ilgas receptes meklēšanas.";
        String answer3 = "Četras garšas: 'Pils alus', 'Gaišais alus', 'Tumšais alus' un 'Ziemas alus'.";
        String answer4 = "Ap 110 darbinieku liela.";
        String answer5 = "60% - Aigaram Ruņģim, 24% - Austrijas ieguldījumu gondam un 16% - Vācijas uzņēmumam.";

        String userInput;
        boolean flag = true;
        boolean flag1 = true;

        while (flag) {
            System.out.printf(question1 + "%n" + question2 + "%n" + question3 + "%n" + question4 + "%n" + question5 + "%n%n");
            System.out.println("Izvēlies sev intresējošo jautājumu, ievadot jautājuma numuru (piemēram 1)");

            userInput = scanner.next();

            if (userInput.equals("1")) {
                System.out.println(answer1);
            } else if (userInput.equals("2")) {
                System.out.println(answer2);
            } else if (userInput.equals("3")) {
                System.out.println(answer3);
            } else if (userInput.equals("4")) {
                System.out.println(answer4);
            } else if (userInput.equals("5")) {
                System.out.println(answer5);
            } else {
                System.out.println("Ievadītais neatbilst prasītajam!");
            }

            flag1 = true;

            while (flag1) {
                System.out.printf("%nVai vēlaties noskaidrot vēl kādu jautājumu? (Jā - ievadiet 'j', Nē - ievadiet 'n')%n");
                userInput = scanner.next();

                if (userInput.equals("j")) {
                    flag = true;
                    flag1 = false;
                } else if (userInput.equals("n")) {
                    flag = false;
                    flag1 = false;
                    System.out.println("Visu labu!");
                } else {
                    System.out.println("Ievadītais neatbilst prasītajam!");
                }
            }

        }
    }
}
