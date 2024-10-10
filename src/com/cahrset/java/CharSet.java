package com.cahrset.java;

public class CharSet {


    char A;

    public static void main(String[] args) {
        CharSet carst = new CharSet();
        System.out.println(carst.A);


        // unic code starts from upper letters A to Z ( \u0041 to \u005a)
        char a = '\u0041';

        char b = '\u0042';
        char z = '\u005a';
        System.out.println("the char set values for upper case :" + a);
        System.out.println("the char set values for upper case :" + b);
        System.out.println("the char set values for upper case :" + z);

        // unic code starts from upper letters A to Z ( \u0061 to \u007a)

        char val = '\u0061';

        char value = '\u0056';
        char value1 = '\u007a';
        System.out.println("the char set values for lower case :" + val);
        System.out.println("the char set values for lower case :" + value);
        System.out.println("the char set values for lower case :" + value1);
        char val1 = '\u002d';

        char value2 = '\u002b';
        char value4 = '\u002e';
        char underScore ='\u005f';

        System.out.println("the - sign:" + val1);
        System.out.println("the positive sign:" + value2);

        System.out.println("the the . value :" + value4);
        System.out.println("the charset of underscore:"+underScore);
    }
}
