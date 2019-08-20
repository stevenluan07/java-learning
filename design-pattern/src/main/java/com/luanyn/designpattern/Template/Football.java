package com.luanyn.designpattern.Template;

/**
 * @Classname Game
 * @Description TODO
 * @Date 2019/8/20 15:30
 * @Created by luanyinan
 */
public abstract class Game {
    abstract void startGame();
    abstract void endGame();
    
    public final void play(){
        startGame();
        endGame();
    }
}