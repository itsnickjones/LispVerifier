package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solver solver = new Solver();
        boolean isValidT = solver.isValidLisp("(( ))");//checking with equal parentheses
        boolean isValidF1 = solver.isValidLisp("(()");// checking with unequal parentheses on right side
        boolean isValidF2 = solver.isValidLisp("())");//checking with unequal parentheses on left side
        System.out.println("Equal parenthes check is: "+ isValidT);
        System.out.println("Unequal right parentheses check is: "+ isValidF1);
        System.out.println("Unequal left parentheses check is: "+ isValidF2);


    }
}
