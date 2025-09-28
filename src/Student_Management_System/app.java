package Student_Management_System;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Telebelerin sayini daxil edin");
        int studentCount = input.nextInt();
        String[] studentsNames = new String[studentCount];
        int[] ages = new int[studentCount];
        double[] grades = new double[studentCount];
        char[] gradesAsLetter = new char[studentCount];
        boolean[] gradesAsBool = new boolean[studentCount];


        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%d.Telebenin adini daxil edin:", i + 1);
            Scanner inputForName = new Scanner(System.in);
            studentsNames[i] = inputForName.next();

            System.out.printf("%d.Telebenin yasini daxil edin:", i + 1);
            Scanner inputForAge = new Scanner(System.in);
            ages[i] = inputForAge.nextInt();

            System.out.printf("%d.Telebenin balini daxil edin:", i + 1);
            Scanner inputForGrade = new Scanner(System.in);
            grades[i] = inputForGrade.nextDouble();

            if (grades[i] >= 90) {
                gradesAsLetter[i] = 'A';
                gradesAsBool[i] = true;
            } else if (grades[i] >= 80) {
                gradesAsLetter[i] = 'B';
                gradesAsBool[i] = true;
            } else if (grades[i] >= 70) {
                gradesAsLetter[i] = 'C';
                gradesAsBool[i] = true;
            } else if (grades[i] >= 60) {
                gradesAsLetter[i] = 'D';
                gradesAsBool[i] = true;
            } else {
                gradesAsLetter[i] = 'F';
                gradesAsBool[i] = true;
            }
        }

        Scanner inputForMenu = new Scanner(System.in);
        int choice;
        double avarageGrade = 0.0;

        double sum = 0.0;
        do {
            System.out.println("1. Bütün tələbələri göstər");
            System.out.println("2. Statistikaları göstər");
            System.out.println("3. Tələbə Axtarışı");
            System.out.println("4. Yaş Aralığına görə Filtr ");
            System.out.println("5. Keçid Statusuna görə Filtr ");
            System.out.println("6. Qiymətə görə Sıralama ");
            System.out.println("0. Çıxış");

            choice = inputForMenu.nextInt();
            switch (choice) {
                case 1:
                    for (var name : studentsNames) {
                        System.out.println(name);
                    }
                    for (var age : ages) {
                        System.out.println(age);
                    }
                    for (var grade : grades) {
                        System.out.println(grade);
                    }
                    for (var gradeAsLetter : gradesAsLetter) {
                        System.out.println(gradeAsLetter);
                    }
                    for (var result : gradesAsBool) {
                        System.out.println(result);
                    }
                    break;
                case 2:
                    for (var grade : grades) {
                        sum += grade;
                    }
                    avarageGrade = sum / grades.length;

                    double maxgrade = 0, minGrade = 0;
                    for (int i = 0; i < grades.length; i++) {
                        maxgrade = grades[0];
                        minGrade = grades[1];
                        if (grades[i] > maxgrade) {
                            maxgrade = grades[i];
                        }
                        if (grades[i] < minGrade) {
                            minGrade = grades[i];
                        }

                    }

                    int validGrades = 0;
                    int unvalidGrades = 0;
                    for (var result : gradesAsBool) {
                        if (result) {
                            validGrades++;
                        } else {
                            unvalidGrades++;
                        }
                    }

                    System.out.println("Balların orta qiymətləri: " + avarageGrade);
                    System.out.println("Maksimum bal: " + maxgrade);
                    System.out.println("Minimum bal: " + minGrade);
                    System.out.println("Imtahandan kecen telebeler : " + validGrades);
                    System.out.println("Imtahandan kecmeyen telebeler : " + unvalidGrades);
                    break;
                case 3:
                    System.out.println("Telebenin adini daxil edin:");
                    Scanner inputForName = new Scanner(System.in);

                    for (int i = 0; i < studentsNames.length; i++) {
                        if (studentsNames[i].equals(inputForName.next())) {
                            System.out.println(studentsNames[i]);
                            System.out.println(ages[i]);
                            System.out.println(grades[i]);
                            System.out.println(gradesAsLetter[i]);
                            System.out.println(gradesAsBool[i]);
                        }
                    }

                    System.out.println("Çıxılır...");
                    break;
                case 4:
                    System.out.println("Telebelerin yasini daxil edin:");
                    Scanner inputForAgeStart = new Scanner(System.in);
                    int startAge = inputForAgeStart.nextInt();
                    System.out.println("Telebelerin diger yasi daxil edin:");
                    Scanner inputForAgeEnd = new Scanner(System.in);
                    int endAge = inputForAgeEnd.nextInt();

                    for (int i = 0; i < ages.length; i++) {
                        if (ages[i] > startAge || ages[i] <= endAge) {
                            System.out.println(studentsNames[i]);
                        }
                    }

                    System.out.println("Çıxılır...");
                    break;
                case 5:
                    for (int i = 0; i < gradesAsBool.length; i++) {
                        if (gradesAsBool[i]) {
                            System.out.println("Keçən tələbə:" + studentsNames[i]);
                        } else {
                            System.out.println("Keçməyən tələbə:" + studentsNames[i]);
                        }
                    }
                    System.out.println("Çıxılır...");
                    break;
                case 6:
                    Arrays.sort(grades);
//                    Arrays.sort(grades, java.util.Comparator.reverseOrder());
                    System.out.println("Artan sıra ilə");
                    for (int i = 0; i < grades.length; i++) {
                        System.out.println(studentsNames[i]);
                    }

                    System.out.println("Çıxılır...");
                    break;
                default:
                    System.out.println("Yanlış seçim!");
            }
        } while (choice != 0);

    }
}
