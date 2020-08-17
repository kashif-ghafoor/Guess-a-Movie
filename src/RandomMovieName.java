import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class RandomMovieName  {
    private String []movieNames;//to store movie name
    private int count;
    public RandomMovieName() {//parameterized constructor
        count=0;
        movieNames = new String[25];
        StoreMoviesName();
    }
    private void StoreMoviesName() {//Storing movies name in array
        try {//handling the extension if the file is not present at correct path
            File file = new File("movieNames.txt");
            Scanner scanner = new Scanner(file);//taking a text file as an input
            while (scanner.hasNextLine()) {
                movieNames[count] = scanner.nextLine();//Storing input into an array
                count++;
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("The file does not exist at the location");
        }
    }
    public String[] getListOfMovies() {
        return movieNames;
    }
    public String getRandomMovieName() {//getting random number of array
        int random = (int)(Math.random()*count);//generating a random number
        return movieNames[random];
    }
}
