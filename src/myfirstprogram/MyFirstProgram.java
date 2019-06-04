/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstprogram;

/**
 *
 * @author stefa
 */
public class MyFirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte x1 = 127;
        short x2 = 16;
        int x3 =32;
        long x4 = 64l;
        
        
        int f; //declaration
        f = 10; //initialization. In one line: int f = 10;
        //System.out.println("a value f is: " + f);
        int a = 2;
        byte b = (byte)a;//(byte)a --> casting
        int sum = a + b;
        //System.out.println(sum);
        
        float num1 = 7.8f;
        int num2 = (int)num1;
        int sum1 = num2; 
        //System.out.println(sum1);
        float i = num2;
        //System.out.println(i);
        
        
        float y1 = 32.0f;
        double y2 = 64.0d;
        
        int newNumber = 10%3;
        float division = 14/3f;
        //System.out.println("division is: " + division);
        //System.out.println("newNumber is: " + newNumber);
        //System.out.println("Hello");
        
        int c =10;
        int d = 20;
        Math.addExact(c,d);               
        System.out.println(Math.min(c,d));
        double floor = Math.floor(3.8);//stroggulopoiei ari8mo pros ta katw
        System.out.println("floor is: " + floor);
        int number = -10;
        int result = Math.abs(number);
        System.out.println(Math.abs(result));
    }
    
}
