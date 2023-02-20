package edu.snooze;

/*
 * The application "main-class" (class with the main () method).
 * Every Java application has ONE main-class, and usually many "business" classes.
 *
 * Here, we will create a few instances of edu.snooze.AlarmClock and give them a basic test-drive.
 */
class AlarmClockClient {

    // ENTRY point of starting point of every standalone Java application
    //The application "starts here"
    public static void main(String[] args) {
        // create an instance of edu.snooze.AlarmClock
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);
        clock1.setRepeat(7);

        // call methods on it
        clock1.snooze();

        // create a second instance (object) of edu.snooze.AlarmClock and set its properties, also
        AlarmClock clock2 = new AlarmClock(10);

        //create a third edu.snooze.AlarmClock object via the snoozeInterval-repeat ctor
        AlarmClock clock3 = new AlarmClock(21, 3);  //snoozeInterval

        // call methods on it, also
        clock2.snooze();

        // create a fourth edu.snooze.AlarmClock object, but this time DOESN'T set its properties
        AlarmClock clock4 = new AlarmClock();
        clock3.setSnoozeInterval(5);

        clock3.snooze();

        //show their toSting methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3);  //toString is automatically called.


    }
}
