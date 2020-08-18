/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;
import java.util.Scanner;
import model.entities.DepartmentModel;
import model.entities.HourContractModel;
import model.entities.WorkerModel;
import model.enums.WorkerLevel;

/**
 *
 * @author Bruno Araujo
 */
public class Java_S13 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        WorkerModel workerModel = new WorkerModel();
        
        System.out.println("Digite o nome do departamento: ");
        workerModel.setDepartment(new DepartmentModel(new Scanner(System.in).nextLine()));
        
        System.out.println("[Dados do trabalhador]");
        System.out.println("Nome: ");
        workerModel.setName(new Scanner(System.in).nextLine());
        System.out.println("Nível (JUNIOR, MID_LEVEL or SENIOR: ");
        workerModel.setLevel(WorkerLevel.valueOf(new Scanner(System.in).nextLine()));
        System.out.println("Salário base: ");
        workerModel.setBaseSalary(Double.parseDouble(new Scanner(System.in).nextLine()));
        System.out.println("Quantos contratos o trabalhador tem? ");
        int nContracts = Integer.parseInt(new Scanner(System.in).nextLine());
        for(int i = 0; i < nContracts; i++)
        {
            System.out.println("Quantos contratos o trabalhador tem? ");
            
//            workerModel.addHourContract(new HourContractModel(
//                    new Date(),
//                    
//            ));
            
        }
        
        
    }
    
}
