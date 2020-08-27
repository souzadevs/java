/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.behaviours.Quack;

import model.interfaces.QuackBehaviour;

/**
 *
 * @author Bruno Araujo
 */
public class MallardQuack implements QuackBehaviour 
{
    public void quack()
    {
        System.out.println("Mallard quaaack!");
    }
}
