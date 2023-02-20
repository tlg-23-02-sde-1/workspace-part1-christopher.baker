package human.being;/*
 * An immutable class. More accurately, this is a class definition written in such a way that instances of it
 * (Person objects) can not have their properties changed once created.  In short: getters but no setters.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Person {
    //PROPERTIES (fields or instance variables)
    private String name;
    private LocalDate birthDate;

    //CONSTRUCTOR
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    //ACCESSOR METHODS
    /*
     * Returns the Person's age in whole years.
     * needs to be LocalDate (today) minus birthday.
     * This can be derived from the birthDay and today's date.
     * Basically need to get the period of time (in whole years) between the birthDay and today's date.
     * getAge() and int.  See package java.time in the API docs.
     */
    public class getAge{
        LocalDate startDate = LocalDate.of(1980, 8, 9);
        LocalDate endDate = LocalDate.now();
        long getAge = ChronoUnit.YEARS.between(startDate, endDate);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString(){
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}