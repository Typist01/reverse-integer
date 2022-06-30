package com.sparta.reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseInt(98475));
    }
    public static int reverseInt(int integerInput){
        int comparison = 1;
        int digits = 1;
        while (integerInput/comparison < 1 || integerInput/comparison > 10){
            comparison *= 10;
            digits += 1;
        }
        int newInt = 0;
        for (int i=0; i<digits; i++){
            int partialNum = (int)(integerInput % Math.pow(10, i+1) / Math.pow(10, i));
            newInt += partialNum * Math.pow(10, digits-i-1);
            integerInput -= partialNum;
        }
        return newInt;
    }
}