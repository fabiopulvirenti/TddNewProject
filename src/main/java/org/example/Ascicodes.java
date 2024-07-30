package org.example;

public class Ascicodes {


    public int calculateAsci(String input){


        int sum=0;
        for(int i=0; i<input.length();i++){
            char c =input.charAt(i);
            sum=sum + c;


        }
        return sum;
    }








}
