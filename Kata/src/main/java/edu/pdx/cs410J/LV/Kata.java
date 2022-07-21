package edu.pdx.cs410J.LV;

import java.io.*;
import java.util.*;
/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args) {
            if(arg.equals("MAX")){
                int max;
                Stack clone = (Stack) stack.clone();
                Collections.sort(clone);
                String maxV = clone.get(clone.size()-1).toString();
                while(!stack.isEmpty()){
                    stack.pop();
                }
                stack.push(maxV);
            }
            else if(arg.equals("SQRT")){
                String a = stack.pop().toString();
                double b = Double.parseDouble(a);
                stack.push(Math.sqrt(b));
            }
            else if (arg.equals("*") || arg.equals("/") || arg.equals("+") || arg.equals("-")) {
                String a = stack.pop().toString();
                double b = Double.parseDouble(a);

                String c = stack.pop().toString();
                double d = Double.parseDouble(c);
                switch (arg) {
                    case "*":
                        stack.push(d * b);
                        break;
                    case "/":
                        stack.push(d / b);
                        break;
                    case "+":
                        stack.push(d + b);
                        break;
                    case "-":
                        stack.push(d - b);
                        break;
                }
            }
            else {
                stack.push(arg);
            }
        }
        String str = stack.pop().toString();
        double result = Double.parseDouble(str);
        System.out.println("\nThe result is: " + result);
    }
}
