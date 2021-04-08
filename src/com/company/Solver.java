package com.company;

import java.util.Stack;

public class Solver {

    public boolean isValidLisp(String lisp) {
        Stack<Character> previousParenth = new Stack<>();
        for (Character currChar : lisp.toCharArray()) {
            if(!currChar.equals('(') && !currChar.equals(')')  )continue;
            if (currChar == '(') {
                previousParenth.push(currChar);
                continue;
            }
            if (previousParenth.isEmpty()) return false;
            previousParenth.pop();
        }
        return previousParenth.isEmpty();
    }

}
