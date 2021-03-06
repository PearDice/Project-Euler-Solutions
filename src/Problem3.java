import java.util.ArrayList;

/**
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem3 {
    public static void main(String[] args) {
        final long VALUE = 600851475143L;
        largestPrimeFactor(VALUE);
    }

    public static void largestPrimeFactor(long iVALUE) {
        ArrayList<Long> factors = new ArrayList<Long>();
        long result = 1L;

        //Finds prime factors, not prime number list
        for(long i=2L; i<Math.sqrt(iVALUE); i++) { //largest prime factor is less than square root of value
           if(iVALUE%i==0) { //searches for factors that has zero remainder
               if(result!=iVALUE) { //while result does not equal the value keep multiplying factors
                   result *= i;
                   factors.add(i);
               }
           }
        }

        int largestFactor = factors.size()-1; //gets index of last/largest value in array
        System.out.println(factors.get(largestFactor));
    }
}