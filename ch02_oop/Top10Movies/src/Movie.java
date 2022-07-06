public class Movie{

    int movieRank;
    String Title;
    String Director;
    int rottenTomatoScore;
    public Movie(int movieRank, String title, String director, int rottenTomatoScore) {
        this.movieRank = movieRank;
        Title = title;
        Director = director;
        this.rottenTomatoScore = rottenTomatoScore;
    }
    public int getMovieRank() {
        return movieRank;
    }
    public void setMovieRank(int movieRank) {
        this.movieRank = movieRank;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public int getRottenTomatoScore() {
        return rottenTomatoScore;
    }
    public void setRottenTomatoScore(int rottenTomatoScore) {
        this.rottenTomatoScore = rottenTomatoScore;
    }
    @Override
    public String toString() {
        return "Movie [Director=" + Director + ", Title=" + Title + ", movieRank=" + movieRank + ", rottenTomatoScore="
                + rottenTomatoScore + "]";
    }

    

}