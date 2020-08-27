/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_s14;

import model.behaviours.Quack.RubberQuack;
import model.entities.MallardDuck;

/**
 *
 * @author Bruno Araujo
 */
public class Java_S14
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MallardDuck duck = new MallardDuck();
        duck.getPerformedQuack().quack();
        duck.getPerformedFly().fly();   
    }   
}
