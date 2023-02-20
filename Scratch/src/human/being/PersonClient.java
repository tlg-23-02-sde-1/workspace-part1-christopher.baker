package human.being;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args){
        Person p1 = new Person("Chris", LocalDate.of(1980, 8, 9));
        System.out.println(p1);

        System.out.println();
    }
}