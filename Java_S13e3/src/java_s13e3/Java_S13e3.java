/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_s13e3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import model.ClientModel;
import model.OrderItemModel;
import model.OrderModel;
import model.OrderStatusEnum;
import model.ProductModel;




/**
 *
 * @author Bruno Araujo
 */
public class Java_S13e3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException
    {
        OrderModel order = new OrderModel();
        ClientModel client = new ClientModel();
        
        System.out.println("---------- Cadastro de pedido ----------");
        System.out.println("[Dados do cliente]");
        System.out.println("Nome: ");
        client.setName(new Scanner(System.in).nextLine());
        System.out.println("Email: ");
        client.setEmail(new Scanner(System.in).nextLine());
        System.out.println("Data de nascimento (DD/MM/AAAA): ");
        client.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).nextLine()));
        System.out.println("[Dados do pedido]");
        
        System.out.println("Status do pedido: ");
        order.setStatus(OrderStatusEnum.valueOf(new Scanner(System.in).nextLine()));
        System.out.println("Quantidade de produtos: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        
        for(int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do item " + n+1);
            order.addOrderItem(new OrderItemModel(new ProductModel("TV", 1.400), 2));
        }
    }
    
}
