package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ackermann(2,3));


    }

    public static int fibonacci (int n){


       if (n==0){
           return 0;
       }
        else if (n==1){
            return 1;
        }
        else{
           return fibonacci(n-1)+fibonacci(n-2);
        }

    }

    public static long tribonacci (int n){


        if (n==0){
            return 0;
        }
        else if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return tribonacci(n-1)+tribonacci(n-2) + tribonacci(n-3);
        }

    }

    public static double compound (int years, double percentage){


        if (years==0){return 1; }

        else {
            return compound(years-1,percentage) * (1+percentage) ;
        }
    }

    public static int mcCarthy(int n){
        if (n>100){
            return n-10;
        }
        else {
            return mcCarthy(mcCarthy(n+11));
        }

    }
    public static int ackermann(int m, int n){

        if (m==0){
            return n+1;
        }
        else if (m>0 && n==0){
            return ackermann(m-1,1);
        }
        else {
            return ackermann(m-1,ackermann(m,n-1));
        }

    }
}
