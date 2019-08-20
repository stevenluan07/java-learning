package com.luanyn.designpattern.Template;

/**
 * @Classname Game
 * @Description TODO
 * @Date 2019/8/20 15:30
 * @Created by luanyinan
 */
public class Football  extends Game{
    @Override
    public void startGame(){
        System.out.println("Football game started ");
    }
    @Override
    public void endGame(){
        System.out.println("Football game ended ");
    }

    

}