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
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Cadastro de pedido ----------");
        System.out.println("[Dados do cliente]");
        System.out.println("Nome: ");
        String clientName = sc.nextLine();
        order.getClient().setName(clientName);
        System.out.println("Email: ");
        order.getClient().setEmail(new Scanner(System.in).nextLine());
        System.out.println("Data de nascimento (DD/MM/AAAA): ");
        order.getClient().setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).nextLine()));
        System.out.println("[Dados do pedido]");
        System.out.println("Status do pedido: ");
        order.setStatus(OrderStatusEnum.valueOf(new Scanner(System.in).nextLine()));
        System.out.println("Quantidade de produtos: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        Double price;
        String name;
        int quantity;
        for(int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do item " + n+1);
            System.out.println("Nome do produto: ");
            name = new Scanner(System.in).nextLine();
            System.out.println("Preço do produto: ");
            price = Double.parseDouble(new Scanner(System.in).nextLine());
            System.out.println("Quantidade: ");
            quantity = Integer.parseInt(new Scanner(System.in).nextLine());
            order.addOrderItem(new OrderItemModel(new ProductModel(name, price), quantity));
        }
        
        System.out.println("Instante da ordem: " + order.getMoment());
        System.out.println("Status da orgem: " + order.getStatus());
        System.out.println("Cliente: " 
            + order.getClient().getName() 
            + " (" 
            + order.getClient().getBirthDate()
            + ") "
            + order.getClient().getEmail()
            );
        
        System.out.println("Produtos: ");
        Double subTotal = 0.00;
        for (OrderItemModel oItem : order.getOrderItemList()){
            subTotal += oItem.subTotal();
            System.out.println("Nome: " + oItem.getProduct().getName() + ", " + oItem.getProduct().getPrice() + ", " + oItem.getQuantity() + ", " + oItem.subTotal());
        }   
        
        System.out.println("Subtotal: " + subTotal);
    }
}
