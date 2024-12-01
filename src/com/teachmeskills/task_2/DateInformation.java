package com.teachmeskills.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateInformation {
    public static void formatDate() {
        System.out.print("Please enter a date in the dd-MM-yyyy format: ");
        Scanner scanner = new Scanner(System.in);
        String enteredDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(enteredDate, formatter);
            showWeekDay(date);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date format. Please check that entered date has dd-MM-yyyy format.");
        }
    }

    private static void showWeekDay(LocalDate localDate) {

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("The day of week of entered day is: " + dayOfWeek);
    }
}
