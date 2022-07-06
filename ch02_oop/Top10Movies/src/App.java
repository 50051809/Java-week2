import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Movie> top10 = new ArrayList<Movie>();

        top10.add(new Movie(1, "Marcel the shell with the shoes on","Dean Fleischer-Camp",100));
        top10.add(new Movie(2, "Fire of love","Sara Dosa",100));
        top10.add(new Movie(3, "Playground","Laura Wandel",100));
        top10.add(new Movie(4, "Writing with fire","Rintu Thomas & Sushmit Ghosh",100));
        top10.add(new Movie(5, "The Janes","Tia Lessin & Emma Pildes",100));
        top10.add(new Movie(6, "Happening","Audrey Diwen",99));
        top10.add(new Movie(7, "Navalny","Daniel Roher",99));
        top10.add(new Movie(8, "I am a Clicher","Celeste Bell & Paul Sng",98));
        top10.add(new Movie(9, "The Automat","Lis Hurwitz",98));
        top10.add(new Movie(10, "Who we are","Emily Kunstler & Sarah Kunstler",98));
        

        System.out.print("Choose a Film in the top 10 > ");
        Scanner scanner = new Scanner(System.in);

        String response = scanner.nextLine();
        Integer selectedSong = Integer.parseInt(response);

        for(Movie movie:top10){
            if(movie.movieRank == selectedSong){
                System.out.println("You selected >>> " + movie.Title + " by " + movie.Director + " with a rotten tomatos score of " + movie.rottenTomatoScore);

    }
}
