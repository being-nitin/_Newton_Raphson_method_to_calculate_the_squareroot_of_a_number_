package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Newton Raphson Method to calculate the square root of a number:
	 */
        System.out.printf("%.3f",sqrt(40));


    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = (0.5*(x + (n/x)));
            if(Math.abs(root-x)<1){
                break;
            }
            x = root;
        }
        return root;
    }
}
