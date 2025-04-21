import java.util.Arrays;

public class MathQuestions {
    public static void main(String[] args) {
        int no  = 0;
        int a = 5;
        int b = 1;


//        System.out.println(CountValues(no));
//        System.out.println(PalindromNo(no));
//        System.out.println(FactorialBasic(no));
 //      System.out.println(FactorialRecursive(no));
  //      System.out.println(Trailingzeros(no));
 //       System.out.println(TrailingzerosBestApproch(no));
        System.out.println(GCD(a,b));
        System.out.println(primeno(no));
        System.out.println(power(a,b));

    }
    // For the count Digits
    public static int CountValues(int x) {;
        int Counter = 0;

        while(x >0){
            x = x / 10;
            Counter++;
        }
        return Counter;
    }

    // For the palindrom No

    public static Boolean PalindromNo(int x) {
        int reverse_no = 0;
        int temp = x;
        int last_digit;
        while(temp > 0) {

            last_digit = temp % 10;
            reverse_no = (reverse_no * 10) + last_digit;
            temp = temp / 10;
        }
        return reverse_no == x;
    }


    // For the Factorial of the No
    public static int FactorialBasic(int x) {
        int factorial = 1;
        for (int i = 2; i <= x; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }


    public static int FactorialRecursive(int x) {
        if( x == 0){
            return 1;
        }
        return x*FactorialRecursive(x-1);
    }

    public static int Trailingzeros(int x) {
        int Counter = 0;
        int factorial = FactorialBasic(x);


        while(factorial % 10 == 0){
            Counter++;
            factorial = factorial/10;
        }
        return Counter;
    }

    public static int TrailingzerosBestApproch(int x) {
        int Counter = 0;
        for ( int i= 5 ; i <=x; i = i*5){
            Counter = Counter+x/i;
        }
        return Counter;
    }

    public static int GCD(int a, int b) {
        int result = Math.min(a,b);

        while(result > 0){
            if( a%result == 0 && b%result == 0){
                break;
            }
            result --;
        }
        return result ;
    }

    public static boolean primeno(int x) {
        if( x==1){
            return false;
        }
       for( int i = 2;i < x;i++){

           if(x%i == 0){

               return false;


           }
       }
       return true;
    }

// This code is Wrong implemented in the leetcode optimized one
    public static void sieveOfEratosthenes(int x) {
        boolean arrayofvalues[] = new boolean[x];
        Arrays.fill(arrayofvalues, true);
        for( int i = 2 ; i < x ; i++){

            if(i%2 == 0){
                arrayofvalues[i] = false;
            }
            if(i%3 == 0){
                arrayofvalues[i] = false;
            }
            if(i%5 == 0){
                arrayofvalues[i] = false;
            }
        }


    }

    public static int power(int a, int n){

        if(n == 0){return 1;}
        int temp = power(a,n/2);
        temp = temp*temp;
        if(n%2 == 0){
            return temp*temp;
        }else {
            return temp*a;
        }
    }



}


