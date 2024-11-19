//package com.perscholas.java_basics;

public class JavaMethods {

    public void addIntegers(){
        int x=6, y=3;
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    public void addDoubles(){
        double x=6.1, y=3.05;
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    public void addIntAnfDouble(){
//        double x=6.88;
//        int y =3;
        Double x=6.88;
        Integer y =3;
        Object res = x+y;
        System.out.println(x + " + " + y + " = " + res);
        System.out.println("The variable type of adding integer and double is " + res.getClass());
    }
    public void divideInteger(){
        int x=6, y=30;
        double doubleY = 30.68;

        Object res = y / x;
        System.out.println(y + " / " + x + " = " + res);
        System.out.println("The variable type of result is " + res.getClass());

        res = doubleY / x;
        System.out.println(doubleY + " / " + x + " = " + res);
        System.out.println("The variable type of result is " + res.getClass());
    }

    public void divideDouble(){
        double y = 30.68, x=6.3;

        Object res = y / x;
        System.out.println(y + " / " + x + " = " + res);
        System.out.println("The variable type of res is " + res.getClass());

        res = (int)(res);
        System.out.println("(int)("+y + " / " + x + ") = " + res);
        System.out.println("The variable type of casting res to integer is " + res.getClass());

    }
    public void divideIntAndDouble(){
        int x=5, y=6;
        Object q = y / x;
        System.out.println(y + " / " + x + " = " + q);
        q = (double) y;
        System.out.println("Double.valueOf(" + y+ ") = " + q);

    }
    public void getCircleArea(){
        final double PI = 3.1415;
        int radius = 5;

        double area = PI * radius * radius;
        System.out.println("area of circle with 5cm radius is "+ area );

    }
    public void cafe(){
        final double saleTax = 10.2;
        double subtotal = 0.0;
        double totalSale = 0.0;

        double coffee = 5.0;
        double espresso = 7.0;
        double greenTea =6.5;

        subtotal = coffee * 3 + espresso * 4 + greenTea * 2;

        totalSale = subtotal + (subtotal * saleTax / 100);
        System.out.println("3 coffee $5 + 4 espresso $7 + 2 green tea $6.5 = " + subtotal );
        System.out.println("subtotal + sale tax = " + totalSale );


    }



}
