package com.kish.learning.bdd;

public class FizzBizzGame {


    public String fizzbizzDecider(int value){
        if(value < 1)  return "only non negative number greater than 0 is alllowed";
        else if(value%5 == 0 && value%3== 0) return "FizzBizz";
        else if(value%3 == 0) return "Fizz";
        else if(value%5 == 0) return "Bizz";
        else return value+"";
    }

}
