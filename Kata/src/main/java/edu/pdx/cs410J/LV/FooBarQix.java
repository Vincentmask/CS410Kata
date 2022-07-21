package edu.pdx.cs410J.LV;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class FooBarQix {

    public static void main(String[] args) {
    /*  int num = valueOf(String.valueOf(str));
    String ret = "";
    if(num % 3 == 0)
      ret += "Foo";
    if(num % 5 == 0)
      ret += "Bar";
    if(num % 7 == 0)
      ret += "Qix";
    for(int i = 0; i < str.length(); i++){
      if(str[i] == 3)
        ret += "Foo";
      if(str[i] == 5)
        ret += "Bar";
      if(str[i] == 7)
        ret += "Qix";
    }
    System.out.print(ret);
   */

        String arg = args[0];
        char[] arg2 = arg.toCharArray();
        int num = Integer.parseInt(arg);
        boolean flag = false;
        if (num % 3 == 0) {
            System.out.print("Foo");
            flag = true;
        }
        if (num % 5 == 0) {
            System.out.print("Bar");
            flag = true;
        }
        if (num % 7 == 0) {
            System.out.print("Qix");
            flag = true;
        }
        for (int i = 0; i < arg.length(); i++) {
            if (arg2[i] == '3') {
                System.out.print("Foo");
                flag = true;
            }
            else if (arg2[i] == '5') {
                System.out.print("Bar");
                flag = true;
            }
            else if (arg2[i] == '7') {
                System.out.print("Qix");
                flag = true;
            }
            else if (arg2[i] == '0') {
                arg2[i] = '*';
                if(flag == true)
                    System.out.print("*");
            }
        }
        if(flag == false ){
            System.out.print(arg2);
        }
    }
}
