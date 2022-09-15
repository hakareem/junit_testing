package console_calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String exit = "Q";
        String clear = "C";
        Double answer = 0d;
        String operation = null;

        // try block automatically closes scanner 
        try (Scanner scanner = new Scanner(System.in)) {
            while(true) {
                String line = scanner.nextLine();
                
                if (isNumeric(line)) {
                    Double number = Double.parseDouble(line);
                    if (operation != null) {
                        switch(operation) {
                            case "+":
                                answer += number;
                                break;
                            case "-":
                                answer -= number;
                                break;
                            case "/":
                                answer /= number;
                                break;
                            case "*":
                                answer *= number;
                                break;
                            case "%":
                                answer %= number;
                                break;
                        }

                        System.out.println("Result: " + answer);

                    } else {
                        answer = number;
                    }

                } else {
                    switch(line) {
                        case "+":
                            operation = line;
                            break;
                        case "-":
                            operation = line;
                            break;
                        case "/":
                            operation = line;
                            break;
                        case "*":
                            operation = line;
                            break;
                        case "%":
                            operation = line;
                            break;
                    }
                }


                if(exit.equals(line.toUpperCase())) {
                    System.exit(0);
                } else if (clear.equals(line.toUpperCase())) {
                    answer = 0d;
                    operation = null;
                    System.out.println("Cleared, Result is now: " + answer);
                }
            }
        }
    }

    private static boolean isNumeric(String line) {
        try { 
            Double.parseDouble(line);
            return true;
        } catch (Exception e) {
            return false;     
        }
    }
}
