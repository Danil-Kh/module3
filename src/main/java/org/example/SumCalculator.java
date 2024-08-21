package org.example;


public class SumCalculator {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println("sumCalculator.sum(2) = " + sumCalculator.sum(2));
    }
    public int sum(int m){
        int result = 0;
        if (m == 0){
            throw new IllegalArgumentException();
        }
        while (m != 0){
            result += m;
            m--;
        }
        return result;
    }
}