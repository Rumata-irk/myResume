package com.rumata;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Resume {
    static DateFormat df = new SimpleDateFormat("dd MMM yyyy");
    static Scanner scanner = new Scanner(System.in);
    static String line;

    public static void main(String[] args) {

        printPersInfo();
        nextStep(scanner, line);
        printEducationInfo();
        nextStep(scanner, line);
        printTechnologyStack();
        nextStep(scanner, line);
        printPreviousEmployment();
    }

    static void printPersInfo() {
        PersonalInformation pi = new PersonalInformation();
        System.out.println("Персональная информация:");
        System.out.println("\t" + pi.getFirstName() + " " + pi.getLastName());
        System.out.println("\t" + df.format(pi.getBirthday().getTime()));
        System.out.println("\t" + pi.getMobilePhone());
        System.out.println("\t" + pi.getEmail());
        printStars();
    }

    static void printEducationInfo() {
        Education ed = new Education();
        System.out.println("Образование:");
        System.out.println("\t" + ed.getUniversity());
        System.out.println("\t" + ed.getFaculty());
        System.out.println("\t" + ed.getMajor());
        printStars();
    }

    static void printTechnologyStack() {
        TechnologyStack ts = new TechnologyStack();
        System.out.println("Текущий стэк технологий и уровень использования:");
        System.out.println("\t" + ts.getJava() + " - " + TechnologyStack.BEGINNER);
        System.out.println("\t" + ts.getJavaFX() + " - " + TechnologyStack.BEGINNER);
        System.out.println("\t" + ts.getGit() + " - " + TechnologyStack.BEGINNER);
        System.out.println("\t" + ts.getOop() + " - " + TechnologyStack.BEGINNER);
        System.out.println("\t" + ts.getSql() + " - " + TechnologyStack.BEGINNER);
        System.out.println("\t" + ts.getGoogle());
        printStars();
    }

    static void printPreviousEmployment() {
        System.out.println("Предыдущие места работы:");
        PreviousEmployment.previousEmployment();
    }

    static void printStars() {
        for (int i = 0; i < 55; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    static void nextStep(Scanner scanner, String line) {
        System.out.println("For next step press Enter");
        line = scanner.nextLine();
    }
}
