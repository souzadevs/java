/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Bruno Araujo
 */
public class ClientModel
{
    private String name;
    private String email;
    private Date birthDate;

    public ClientModel()
    {
        
    }

    public ClientModel(String name, String email, Date birthDate)
    {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }
}
