package com.luanyn.designpattern.strategy;

/**
 * @Classname IntegerValidation
 * @Description TODO
 * @Date 2019/8/20 15:00
 * @Created by luanyinan
 */
public class IntegerValidation implements ValidationStrategy{
    @Override
    public void validate(String input){
        if(input.matches("[0-9]+")){
            System.out.println(input + "  is integer");
        }
        else{
            System.out.println(input +" is no integer");
        }
    }
}