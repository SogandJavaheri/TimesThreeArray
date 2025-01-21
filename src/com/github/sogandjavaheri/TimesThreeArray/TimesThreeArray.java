package com.github.sogandjavaheri.TimesThreeArray;
import java.util.Arrays;

public class TimesThreeArray {

        public static void main(String[] args) {

            int[] a = {8,3,10,4};

            System.out.println("The entered array is:\n");

            System.out.println("\nThe array times 3 is:\n");

            MultiArray(a);

            //int[] b = {1,3,5};
            //MultiArray(b);

        }
        public static void MultiArray(int[] array){

            System.out.println("Multiply of the array:");
            System.out.print("{\t");

            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * 3;
                System.out.print(array[i]+"\t");
            }
            System.out.print("}");
        }
    }