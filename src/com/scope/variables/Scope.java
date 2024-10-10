package com.scope.variables;

public class Scope {

    // instance variable

    int age =20;

    // static variable

    static String name ="vasu";

    public  void details(){
        // local variable

        String email ="vasuboddupilli13@gamil.com";
        System.out.println("age:"+age);
        System.out.println("name:"+name);
        System.out.println("mail:"+email);
    }

    public static void main(String[] args) {


        // creating the object

        Scope scope;
        scope = new  Scope();

        scope.details();
    }
}
