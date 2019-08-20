package com.luanyn.designpattern.strategy;

import com.carrotsearch.hppc.HashOrderMixing;

/**
 * @Classname Context
 * @Description TODO
 * @Date 2019/8/20 15:03
 * @Created by luanyinan
 */
public class Context {
    public ValidationStrategy validationStrategy;

    public Context(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public void doValidate(String input){
        validationStrategy.validate(input);
    }
}