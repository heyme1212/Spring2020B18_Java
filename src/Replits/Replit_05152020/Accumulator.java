package Replits.Replit_05152020;

public class Accumulator {
    /*
Write a class named Accumulator containing:
An instance variable named sum of type integer.

A constructor that accepts an integer parameter,
whose value is used to initialize the sum instance variable.

A method named getSum that returns the value of sum.
A method named add that accepts an integer parameter.

The value of sum is increased by the value of the parameter.
A method named remove that accepts an integer parameter.
The value of sum is decreased by the value of the parameter.

Override a toString method so it returns 'Sum is: X' where X is the sum instance variable.
     */

    Integer sum;

    public Accumulator(Integer a){
        sum=a;
    }

    public int getSum(){
        return sum;
    }

    public void add(int b){
        sum+=b;
    }

    public void remove(int c){
        sum-=c;
    }

    public String toString(){
        return "Sum is: "+sum;
    }


}
