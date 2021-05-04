package com.company;

import java.util.Scanner;

public class Main {

    public static boolean weight(double x) throws ShazzadException{
        boolean f = false;
        if(x>950){
            throw new ShazzadException();
        }
        f = true;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Elevator: ");
        System.out.println("Enter the weights: (press -1 to stop)");
        Scanner s = new Scanner(System.in);
        boolean flag = true,check=true;
        double sum=0;
        while(flag==true){
            double w = s.nextDouble();
             sum = sum + w;
            if(w==-1)
                flag=false;
            if(flag==false)
                break;

            try{
                    check=weight(sum);
                    if(check==false){
                        flag=false;
                    }
                    else
                    System.out.println("Enter the weights: (press -1 to stop)");
                }
            catch(ShazzadException e){
                double extra = sum-950;
                System.out.println(e.toString());
                System.out.println(extra);
                break;
            }
            }
    }
}
