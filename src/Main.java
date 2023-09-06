public class Main {

    public static void main(String[] args) {

        int result = add(5,2);
        System.out.println(result);
    }

    // 1. add
    public static int add(int a, int b){
        return(a+b);
    }

    // 2. add
    public static int add(int a, int b, int c, int d){
        return(a+b+c+d);
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
        value = (int)value;
        return(value);
    }


    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double value){
        value = value - 0.5;
        value = (int)value;
        return(value);
    }

}
