package net.flix;

public enum MovieGenre {   //each of these is called the ctor below, passing a string
    COMEDY("Comedy"),
    ACTION("Action"),
    DRAMA("Drama"),
    HORROR("Horror"),
    WESTERN("Western"),
    SCI_FI("Science Fiction"),
    ROMANCE("Romance"),
    DOCUMENTARY("Documentary");

    //-----------
    //everything under this line is regular class definition stuff
    //namely, fields, constructors, methods
    //-----------
    private String display;

    //constructor - called only from inside (8 times, from those listed above)
    MovieGenre(String display){
        this.display =  display;
        System.out.println("Genre ctor called");
    }
    public String getDisplay() {    //often the "get" prefix is omitted when there is no setter
        return display;
    }
    public String toString(){
        return display;
    }
}