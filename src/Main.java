public class Main {

    static int fibonacciSeries(int number){
        if (number == 0 || number == 1){
            return 1;
        }
        return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);
        }


    public static void main(String[] args) {

        System.out.print(fibonacciSeries(6));
    }

}