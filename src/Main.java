import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
public static void main(String[] args) throws Exception {
        RandomMovieName movieName = new RandomMovieName();//getting random name of movie from list of movies
        String randomName=movieName.getRandomMovieName();
        System.out.println("list of movies is:");
        for(String movie:movieName.getListOfMovies()) {
            System.out.println(movie);
        }
        System.out.println("////////////////////////////////////////");
        System.out.println("Game is started");
        System.out.println("\t\tGuess the movie ");

        String hyphenName=randomName;
        hyphenName=hyphenName.replaceAll("[a-zA-Z]","_");//replacing the  character of title with '-'
        GuessingName guessedName=new GuessingName(randomName,hyphenName);//passing random movie name
        // to let the user guess the letters of movie
    }
}
