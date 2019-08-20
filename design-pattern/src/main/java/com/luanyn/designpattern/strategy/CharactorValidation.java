package com.luanyn.designpattern.strategy;

/**
 * @Classname IntegerValidation
 * @Description TODO
 * @Date 2019/8/20 15:00
 * @Created by luanyinan
 */
public class CharactorValidation implements ValidationStrategy{
    @Override
    public void validate(String input){
        if(input.matches("[a-zA-Z]+")){
            System.out.println(input + "  is charactor");
        }
        else{
            System.out.println(input +" is no charactor");
        }
    }
}