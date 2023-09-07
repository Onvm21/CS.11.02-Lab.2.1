//import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //add
       int result = add(5,2);
       System.out.println(result);

       //add 2
        int result2 = add(5,2,8,9);
        System.out.println(result2);

        //morning greeting
        String Greeting = morningGreeting("Nick");
        System.out.println(Greeting);

        //afternoonGreeting
        String Afternoon = afternoonGreeting("Jesus");
        System.out.println(Afternoon);

        //Triple
        Scanner askTriple = new Scanner(System.in);
        System.out.println("gimme a random word: ");
        String word = askTriple.next();
        String triple = triple(word);
        //System.out.println(triple);

        //half
        double halved = half(5);
        System.out.println(halved);

        //round positive int
        double number = roundPositiveValueToNearestInteger(5.3);
        System.out.println(number);

        // ruond down
        double down = roundNegativeValueToNearestInteger(-8.9);
        System.out.println(down);

    }

    // 1. add
    public static int add(int a, int b){

        return(a+b);
    }

    // 2. add
    public static int add(int a, int b, int c, int d){
        int answer = add(a,b);
        answer = add(answer, c);
        answer = add(answer, d);
        return(answer);
    }


    // 3. morningGreeting
    public static String morningGreeting(String name){

        return("早上好, " + name +"!");
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){

        return("下午好, " + name + "!");
    }

    // 5. triple
    public static String triple(String word){
        System.out.println(word+word+word);
        return(word+word+word);
    }

    // 6. half
    public static double half(double value){
        return(value/2);

    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double value){
        value = value + 0.5;
        int value2 = (int)value;
        return(value2);
    }


    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double value){
        value = value - 0.5;
        int value2 = (int)value;
        return(value2);
    }

}
