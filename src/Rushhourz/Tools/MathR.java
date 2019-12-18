package Rushhourz.Tools;

import java.util.*;

public class MathR{
    /**
     * Sigmoid Function: Used to flatten values to a value between -1 and 1
     * @param x you input value as double
     * @return returns a value between -1 and 1
     */
    public static double Sigmoid(double x){
        return (1/(1+Math.pow(Math.E,(-1*x))));
    }

    /**
     * Sigmoid Function: Used to flatten values to a value between -1 and 1
     * @param x you input value as int
     * @return returns a value between -1 and 1
     */
    public static double Sigmoid(int x){
        return (1/(1+Math.pow(Math.E,(-1*x))));
    }

    /**
     * Generates Fibonacci Numbers. Starts from n1 and n2 and generates up to index numbersToGenerate+1
     * @param n1
     * @param n2
     * @param numbersToGenerate How many numbers will be generated
     * @return Returns int[] with Fib Numbers
     */
    public static int[] FibonacciNumbers(int n1, int n2, int numbersToGenerate){
        int[] fibs = new int[numbersToGenerate];
        fibs[0] = n1;
        fibs[1] = n2;
        for(int i = 2; i<numbersToGenerate; i++){
            fibs[i] = fibs[i-2] + fibs[i-1];
        }
        return fibs;
    }

    /**
     * Generates Fibonacci Numbers starting from 0 and 1 up until index numbersToGenerate +1
     * @param numbersToGenerate How many numbers will be generated
     * @return
     */
    public static int[] FibonacciNumbers( int numbersToGenerate){
        int[] fibs = new int[numbersToGenerate+1];
        fibs[0] = 0;
        fibs[1] = 1;
        for(int i = 2; i<numbersToGenerate; i++){
            fibs[i] = fibs[i-2] + fibs[i-1];
        }
        return fibs;
    }

    /**
     * Gets the fib number at a specific index, taking your 2 start numbers
     * Beware: n1 takes index 0 and n2 takes index 1
     * @param n1
     * @param n2
     * @param getFibonacciAtIndex
     * @return
     */
    public static int FibonacciNumber(int n1, int n2, int getFibonacciAtIndex){
        int[] fibs = new int[getFibonacciAtIndex];
        fibs[0] = n1;
        fibs[1] = n2;
        for(int i = 2; i<getFibonacciAtIndex; i++){
            fibs[i] = fibs[i-2] + fibs[i-1];
        }
        return fibs[getFibonacciAtIndex];
    }

    /**
     * Gets the fib number at a specific index, starting at 0 and 1.
     * Beware: 0 takes index 0 and 1 takes index 1
     * @param getFibonacciAtIndex your index input
     * @return Fib at wished index
     */
    public static int FibonacciNumber( int getFibonacciAtIndex) {
        int[] fibs = new int[getFibonacciAtIndex];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i < getFibonacciAtIndex; i++) {
            fibs[i] = fibs[i - 2] + fibs[i - 1];
        }
        return fibs[getFibonacciAtIndex];
    }
}