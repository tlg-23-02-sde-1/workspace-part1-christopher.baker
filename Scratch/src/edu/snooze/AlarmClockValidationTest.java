package edu.snooze;

/*
 * Test class focused on validation testing.
 * We will do BVT (Boundary Value Testing) for snoozeInterval:
 * range: 1-20 (inclusive)
 * need to check on the boundaries
 * 0, 1 and 20,21
 *
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(0);     ////shouldn't "stick" or edu.snooze.AlarmClock has a value of 0
        System.out.println();

        clock.setSnoozeInterval(1);     //should "stick" or edu.snooze.AlarmClock has a value of 1
        System.out.println("Snooze Interval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);    //should "stick" or edu.snooze.AlarmClock has a value of 20
        System.out.println("Snooze Interval: " + clock.getSnoozeInterval());
        System.out.println();

        clock.setSnoozeInterval(21);    //shouldn't "stick" or edu.snooze.AlarmClock has a value of 21
    }
}