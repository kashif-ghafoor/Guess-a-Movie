
import java.util.Scanner;

public class GuessingName {
    private String randomName;
    private char []underScoreArray;//to store underscore to hide the letters of movie
    private StringBuilder wrongLetters;//to show the user how and what wrong letter he entered
    GuessingName(String randomName, String _Name){
        this.randomName=randomName;
        underScoreArray=_Name.toCharArray();
        wrongLetters=new StringBuilder();
        guessingName();
    }
    private void guessingName() {//method to perform all action needed to guess the number
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=10;) {
            if(i==10) {//condition to check that the lives of players have come to end
                System.out.println("you lose");
                System.out.println("The name of movie was "+randomName);
                System.out.println("you have lost your all chances");
                System.out.println("try next time, Best of luck!");

                break;
            }
            if(randomName.equals(new String(underScoreArray))) {//condition to ckeck that the user successfully
                //guessed the name of movie
                System.out.println("you win");
                System.out.println("you have guessed "+randomName+" correctly.");
                break;
            }
            int count=0;//to check whether the entered letter matches with the name of movie or not
            System.out.println("You are guessing: "+new String((underScoreArray)));
            System.out.println("You have guessed ("+i+") wrong letters: "+wrongLetters);
            System.out.print("Guess a letter: ");
            char ch = scanner.next().charAt(0);
            for(int j=0;j<randomName.length();j++) {//loop to check whether the character entered by user
                //is present in the name of movie or not
                if(randomName.charAt(j)==ch) {
                    //if present then assign that character to the corresponding underscore in underscoreArray
                    underScoreArray[j]=ch;
                    count++;
                }
            }
            if(count==0) {//will execute if the letter entered by user is not present in the title of movie
                i++;
                wrongLetters.append(ch);//it will add the wrong letter entered by user so that user
                // will be able to see that how and what letters i entered is incorrect.
            }
        }

    }
}

