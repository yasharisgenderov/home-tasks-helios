package QA_Game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        String[][] questions = {
                {"Azərbaycanın paytaxtı hansıdır?", "Bakı", "A)Gəncə", "B)Bakı", "C)Sumqayıt"},
                {"Suyun kimyəvi formulu nədir?", "H2O", "A)CO2", "B)H2O", "C)O2"},
                {"3 × 4 neçədir?", "12", "A)10", "B)12", "C)14"},
                {"Günəş sistemində ən böyük planet hansıdır?", "Yupiter", "A)Yupiter", "B)Saturn", "C)Yer"},
                {"Nizami Gəncəvinin məşhur toplusu hansıdır?", "Xəmsə", "A)Xəmsə", "B)Əsli və Kərəm", "C)Səyahətnamə"}
        };

        Scanner scanner = new Scanner(System.in);
        String answer = "";
        System.out.println("Quizə xoş gəldiniz!");
        boolean questionAnswer = false;

        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                if (j == 1) continue;
                System.out.println(questions[i][j]);
                questionAnswer = false;
            }
            do {
                System.out.println("Cavabı daxil edin : ");
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(questions[i][1])) {
                    questionAnswer = true;
                    System.out.println("Sualı düzgün cavabladız.");
                } else {
                    System.out.println("Sualı yanlış cavabladız. Növbəti dəfə cəhd edin!");
                }
            } while (!questionAnswer);
        }

        System.out.println("Bütün suallara düzgün cavab verdiz! \uD83C\uDF89");
        scanner.close();
    }
}
