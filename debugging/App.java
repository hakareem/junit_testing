public class App {

  // fizzbuzz class
  public static class Fizzbuzz {
    public String play(Integer number) {
      Integer otherNumber = number - 50;

      if (this.isDivisibleBy(15, number)) {
        return "FizzBuzz";
      } else if (this.isDivisibleBy(5, number)) {
        return "Buzz";
      } else if (this.isDivisibleBy(3, number)) {
        return "Fizz";
      } else {
        // convert this number into a string bc return value is STRING
        return number.toString();
      }
    }

    // method => would return a boolean value 
    public Boolean isDivisibleBy(Integer divisor, Integer number) {
      return number % divisor == 0;
    }
  }

  // application interface
  public static void main(String[] args) {
    // create a proper instanstion of fizzbuzz class
    Fizzbuzz fizzbuzz = new Fizzbuzz();

    for (int i = 1 ; i < 100 ; i ++) {
      // pass the current i iteration into the play method 
      System.out.println(fizzbuzz.play(i));
    }
  }
}