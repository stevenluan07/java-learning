package com.luanyn.designpattern.strategy;

import javax.security.auth.login.Configuration;

/**
 * @Classname StategyBusinessDemo
 * @Description TODO
 * @Date 2019/8/20 15:08
 * @Created by luanyinan
 */
public class StategyBusinessDemo {
    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "ABcdef";


        Context context = new Context((ValidationStrategy) new CharactorValidation());
        context.doValidate(input1);
        context.doValidate(input2);

        context = new Context((ValidationStrategy) new IntegerValidation());
        context.doValidate(input1);
        context.doValidate(input2);


    }
}