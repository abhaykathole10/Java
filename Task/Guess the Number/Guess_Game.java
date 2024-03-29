import java.util.Random;
import java.util.Scanner;

class Game{
    int guesses;
    int number;
    int guessedNumber;

    //Generating a random number using Random()
    Game(){
        Random rand = new Random();

        //Getting a random number from 1 to 100
        number = rand.nextInt(100);
    }

    //Taking input number from the user
    public void inputNumber(){

        System.out.print("Enter a number: ");

        try (Scanner sc = new Scanner(System.in)) {
            guessedNumber = sc.nextInt();
        }
    }

    //Checking if the number is correctly guessed or not
    public boolean isCorrect(){

        //incrementing guesses
        guesses++;

        if(guessedNumber == number){
            System.out.format("\nCorrect! It took you %d guesses to guess it was %d", guesses, number);
            return true;
        }

        else if(guessedNumber > number){
            System.out.println("Incorrect, too high");
        }

        else if(guessedNumber < number){
            System.out.println("Incorrect, too low");
        }

        return false;

    }
}

public class Guess_Game {

    public static void main(String[] args) {

        Game g = new Game();

        boolean b = false;

        while(! b){

            g.inputNumber();

            b = g.isCorrect();

        }
    }
}
