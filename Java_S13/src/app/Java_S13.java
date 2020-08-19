/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.image.SampleModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public static void main(String[] args) throws ParseException 
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
            System.out.println("Insira os dados do contrato " + (i+1) + ": ");
            System.out.println("Insira a data (DD/MM/YYYY): ");
            String strData = new Scanner(System.in).nextLine();
            Date data = new Date(new SimpleDateFormat("dd/MM/yyyy").parse(strData).getTime());
            System.out.println("Valor por hora: ");
            Double hourValue = Double.parseDouble(new Scanner(System.in).nextLine());
            System.out.println("Duração (horas): ");
            Double hours = Double.parseDouble(new Scanner(System.in).nextLine());
            workerModel.addHourContract(new HourContractModel(
                    data,
                    hourValue,
                    hours
            ));
            System.out.println("======= ~~ =======");
        }
        
        System.out.println("Em qual mês deseja visualizar os contratos (1 à 12)?");
        
        int mes = Integer.parseInt(new Scanner(System.in).nextLine());
        
        System.out.println("Nome: " + workerModel.getName());
        System.out.println("Departamento: " + workerModel.getDepartment().getName());
        System.out.println("Renda: " + workerModel.income(mes));
        
        
    }
}
