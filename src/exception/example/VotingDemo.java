package exception.example;

import java.io.FileNotFoundException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Voting {
    public void EligibilityCheck(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
}
public class VotingDemo{
    public static void main(String[] args){
        Voting voting = new Voting();
        try {
            voting.EligibilityCheck(80);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}