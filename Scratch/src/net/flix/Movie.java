package net.flix;

public class Movie {

    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private MovieRating rating;
    private MovieGenre genre;

    //constructors
    public Movie(){                     //no-operation constructor that is there until we make a constructor (ctor)
    }
    public Movie(String title){
        setTitle(title);
    }
    public Movie(String title, MovieGenre genre){
        this(title);
        setMovieGenre(genre);
    }
    public Movie(String title, Integer releaseYear){
        this(title);
        setReleaseYear(releaseYear);
    }
    public Movie(String title, Integer releaseYear, Double revenue) {
                                        //delegate to setters for any validation/conversion they might be doing
        this(title);                    //delegate to neighboring ctor above me for title
        setReleaseYear(releaseYear);    //handle releaseYear myself, by delegating to its setter
        setRevenue(revenue);            //ditto here
    }
    public Movie(String title, Integer releaseYear, Double revenue, MovieRating rating){
        this(title);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setMovieRating(rating);
    }
    public Movie(String title, MovieGenre genre, Integer releaseYear, Double revenue, MovieRating rating){
        this(title, genre);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setMovieRating(rating);
    }

    //accessor methods (get/set methods) / business-oriented methods - deliberately omitted / play(), pause(), stop(), rewind(), fast-forward()
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
    public Double getRevenue() {
        return revenue;
    }
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
    public MovieRating getRating() {
        return rating;
    }
    private void setMovieRating(MovieRating rating) {
    }
    public MovieGenre getGenre() {
        return genre;
    }
    private void setMovieGenre(MovieGenre genre){
    }

    //toString
//    public String toString() {}

//        return "Movie: title=" + getTitle() + ", MovieGenre: genre=" + getGenre().getDisplay() + ", releaseYear=" + getReleaseYear() + ", revenue=" + getRevenue() +"rating=" + getRating();
//    }
}