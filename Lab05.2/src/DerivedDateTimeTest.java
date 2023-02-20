/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        // testPresidentsFirst100Days();
        // testPopularBirthdays();
        // testEarlyRetirement();
        // testLaborDay();
        // testElectionDay();
        // testAnniversary();
    }

    /**
     * TASK: new American presidents are often measured by their performance during the first 100 days in office.
     * Inauguration Day 2017 is Jan 20.  When is this president's 100-day deadline?
     *
     * RESULT:
     */
    public static void testPresidentsFirst100Days() {

        LocalDate inauguration = LocalDate.of(2017, 1, 20);
        LocalDate deadline = inauguration.plusDays(100);
        System.out.println(deadline);
        System.out.println();

        // TODO
    }

    /**
     * TASK: Certain times of the year seem to have more birthdays than other times.
     * Some believe that this is because more babies are conceived during certain times of year.
     * Below, assume a due date 38 weeks after conception, during a non-leap-year.
     *
     * RESULT:
     */
    public static void testPopularBirthdays() {

        LocalDate vday = LocalDate.of(2023, 2, 14);
        LocalDate birthday = vday.plusWeeks(38);
        System.out.println(birthday);

        LocalDate nyeday = LocalDate.of(1980, 1, 1);
        LocalDate birthday2 = nyeday.plusWeeks(38);
        System.out.println(birthday2);

        LocalDate bday = LocalDate.of(1980, 8,9);
        LocalDate birthday3 = bday.minusWeeks(38);
        LocalDate retirement = bday.plusMonths(59).plusMonths(5);
        System.out.println(birthday3);
        System.out.println(retirement);


        // TODO: what is the average birthday of someone conceived on Valentine's Day?

        // TODO: what is the average birthday of someone conceived on New Year's Eve (after midnight)?
    }

    /**
     * TASK: you've saved diligently your whole life and plan to retire as soon as
     * you can take distributions from your 401(k) penalty-free, which is when you turn 59 1/2.
     * When will / did you retire?
     *
     * RESULT:
     */
    public static void testEarlyRetirement() {
        // TODO
    }

    /**
     * TASK: when was Labor Day during the year you were born?
     * Note: start with a LocalDate equal to your birthday.
     * Note: Labor Day is the first Monday in Sept.
     *
     * RESULT:
     */
    public static void testLaborDay() {

        LocalDate sept1 = LocalDate.of(1980, 9, 1);
        LocalDate laborDay = sept1.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(laborDay);

        // TODO
    }

    /**
     * TASK: Election Day in the United States is defined as the Tuesday immediately after the 1st Monday in November.
     * When is Election Day 2024?
     *
     * RESULT:
     */
    public static void testElectionDay() {

        LocalDate nov1 = LocalDate.of(2024, 11, 1);
        LocalDate election = nov1.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)).plusDays(1);
        System.out.println(election);
        System.out.println(election.getDayOfWeek());


        // TODO
    }

    /**
     * TASK: Akesh and Samanta were married on 6/6/1969.
     * They are planning their 50th wedding anniversary, and would like to throw a big party.
     * If their anniversary does not fall on a Saturday, they'd like to have their party the following Saturday.
     * What is the date of the party?
     *
     * RESULT:
     */
    public static void testAnniversary() {

        LocalDate wedding = LocalDate.of(2006, 9, 2);
        LocalDate anniversary = wedding.plusYears(50);
        LocalDate pday = anniversary.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(pday);
        System.out.println();

        // TODO
    }
}