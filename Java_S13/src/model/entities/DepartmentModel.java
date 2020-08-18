/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author Bruno Araujo
 */
public class DepartmentModel 
{
    private String name;
    
    public DepartmentModel()
    {
        
    }

    public DepartmentModel(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "DepartmentModel{" + "name=" + name + '}';
    }
    
    
}
