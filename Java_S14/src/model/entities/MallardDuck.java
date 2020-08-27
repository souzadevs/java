/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.behaviours.Fly.RocketFly;
import model.behaviours.Quack.MallardQuack;
import model.interfaces.FlyBehaviour;
import model.interfaces.QuackBehaviour;


/**
 *
 * @author Bruno Araujo
 */
public class MallardDuck extends Duck
{
    QuackBehaviour performedQuack;
    FlyBehaviour performedFly;
    
    public MallardDuck()
    {
        this.performedQuack = new MallardQuack();
        this.performedFly = new RocketFly();
    }
    
    public MallardDuck(String duckName, QuackBehaviour quack)
    {
        super(duckName);
        this.performedQuack = quack;
    }

    public QuackBehaviour getPerformedQuack()
    {
        return performedQuack;
    }

    public void setPerformedQuack(QuackBehaviour performedQuack)
    {
        this.performedQuack = performedQuack;
    }
    
    public void setPerformedFly(FlyBehaviour performedFly)
    {
        this.performedFly = performedFly;
    }
    
    public FlyBehaviour getPerformedFly()
    {
        return this.performedFly;
    }
}
