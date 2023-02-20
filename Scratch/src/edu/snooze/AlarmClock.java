package edu.snooze;

/*
 * System or "business class" to model the workings of an alarm clock
 * This class definition has no main() method - most classes don't
 */
class AlarmClock {

    // class-level ("static") fields
    // there is only one copy of these, and they live up in that class-wide common area
    // Not in each instance (edu.snooze.AlarmClock object)
    // static = shared,  final = fixed
    public static final int minInterval = 1;    // "class constants"
    public static final int maxInterval = 20;

    // attributes of properties, in Java these are called "fields" or "instance variables"

    private int snoozeInterval = 5;     //default value when client doesn't specify one
    private int repeat = 10;            //number of times it goes off (before giving up on you)

    //constructor
    public AlarmClock() {
        //sync time
    }
    public AlarmClock(int snoozeInterval) {
        this();
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);                   //"this" tells it to go see the constructor above this one
        setRepeat(repeat);                      //handle repeat myself, by delegating to its setter
    }

    // functions ("methods" in Java) - what can an alarm clock DO"
    public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + "minutes");
    }

    // "accessor" methods - provide "controlled access" to the objects internal (private) data
    public int getSnoozeInterval() {
        return snoozeInterval;

    }

    // data constraint: must be [1-20] (inclusive)
    public void setSnoozeInterval(int snoozeInterval){
        if (snoozeInterval >= minInterval  && snoozeInterval <= maxInterval ) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ", Snooze Interval must be from " + minInterval + " to " + maxInterval);

        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "edu.snooze.AlarmClock: snoozeInterval=" + getSnoozeInterval() + ", repeat=" + getRepeat();
    }

}