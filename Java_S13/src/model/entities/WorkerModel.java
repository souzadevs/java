/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.enums.WorkerLevel;

/**
 *
 * @author Bruno Araujo
 */
public class WorkerModel 
{
    /* Value Types */
    private String name;
    private Double baseSalary;
    
    /* Enums */
    private WorkerLevel level;
    
    /* Reference Types */
    private DepartmentModel department;
    
    /* List of Reference Types */
    private List<HourContractModel> hourContract = new ArrayList<>();
    
    /* Constructors*/
    public WorkerModel()
    {
        
    } 
    
    public WorkerModel(String name, Double baseSalary, WorkerLevel level, DepartmentModel department)
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }
    
    /* WorkerModel Methods */
    public Double income(int month, int year)
    {   
        Double income = this.getBaseSalary();
        Calendar calendar = Calendar.getInstance();
        for(HourContractModel contract : this.hourContract)
        {
            calendar.setTime(contract.getDate());
            System.out.println("Dbug - Mes: " + month);
            System.out.println("Dbug - Ano: " + year);
            System.out.println("Dbug - Mes Calendario: " + calendar.get(Calendar.MONTH));
            System.out.println("Dbug - Ano Calendario: " + calendar.get(Calendar.YEAR));
            if(calendar.get(Calendar.MONTH) + 1 == month && calendar.get(Calendar.YEAR) == year)
            {
                System.out.println("Aqui");
                income += contract.totalValue();
            }
        }
            
//        this.hourContract.forEach(contract -> {
//            if()
//            {
//                this.income += contract.totalValue();
//            }
//        });
        
        return income;
    }
    
    public void addHourContract(HourContractModel hourContractModel)
    {
        this.hourContract.add(hourContractModel);
    }
    
    public void addAllHourContract(ArrayList<HourContractModel> hourContractModels)
    {
        this.hourContract.addAll(hourContractModels);
    }
    
    public void removeHourContract(HourContractModel hourContractModel)
    {
        this.hourContract.remove(hourContractModel);
    }
    
    public void removeHourContract(int index)
    {
        this.hourContract.remove(index);
    }
    
    public void clearHourContract()
    {
        this.hourContract.clear();
    }
    
    /* Object Methods*/
    @Override
    public String toString()
    {
        return "WorkerModel{" + "name=" + name + ", baseSalary=" + baseSalary + ", level=" + level + ", department=" + department + ", hourContract=" + hourContract + '}';
    }

    /* Getters & Setters*/
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel()
    {
        return level;
    }

    public void setLevel(WorkerLevel level)
    {
        this.level = level;
    }

    public DepartmentModel getDepartment()
    {
        return department;
    }

    public void setDepartment(DepartmentModel department)
    {
        this.department = department;
    }
}
