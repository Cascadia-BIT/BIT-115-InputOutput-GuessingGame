import java.util.*;

public class GuessingGame {

  public static void main(String[] args) {
    // pick a random number        
    Random random = new Random();
    int number = random.nextInt(100) + 1;        System.out.println(number);

    // UNcomment several lines at once
    // by selecting / highlighting the lines
    // and pressing Ctrl/Cmd+/
    //
    // // Reading a whole number from the keyboard:
    // Scanner keyboard = new Scanner(System.in);
    // int wholeNum;

    // System.out.println("Please type in a whole number:");
    // wholeNum = keyboard.nextInt();
    // System.out.println("You typed " + wholeNum);

    // int twiceNum = wholeNum * 2;
    // System.out.println("Twice what you typed is " + twiceNum);

    // // Reading a real number from the keyboard:
    // Scanner keyboard = new Scanner(System.in);
    // double realNum;

    // System.out.println("Please type in a real number:");
    // realNum = keyboard.nextDouble();
    // System.out.println("You typed " + realNum);

    // double halfNum = realNum / 2;
    // System.out.println("Half of what you typed is " + halfNum);
  }
}
