/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;

/**
 *
 * @author Bruno Araujo
 */
public class HourContractModel 
{
    private Date date;
    private Double valuePerHours;
    private Double hours;
    
    public HourContractModel()
    {
        
    }

    public HourContractModel(Date date, Double valuePerHours, Double hours)
    {
        this.date = date;
        this.valuePerHours = valuePerHours;
        this.hours = hours;
    }
   
    public Double totalValue()
    {
        return this.hours * this.valuePerHours;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Double getValuePerHours()
    {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours)
    {
        this.valuePerHours = valuePerHours;
    }

    public Double getHours()
    {
        return hours;
    }

    public void setHours(Double hours)
    {
        this.hours = hours;
    }   

    @Override
    public String toString()
    {
        return "HourContractModel{" + "date=" + date + ", valuePerHours=" + valuePerHours + ", hours=" + hours + '}';
    }
    
    
}
