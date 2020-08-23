/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_s13e3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import model.ClientModel;
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
        boolean finish = false;
        ArrayList<ProductModel> listProduct = new ArrayList<>();
        
        while(!finish)
        {
            ProductModel product = new ProductModel();
            System.out.println("Nome do produto (Digite -1 para finalizar o carrinho): ");
            String nome = new Scanner(System.in).nextLine();
            if(!nome.equals("-1")){
                product.setName(nome);
                System.out.println("Preço: ");
                product.setPrice(Double.parseDouble(new Scanner(System.in).nextLine()));
            } else {
                finish = true;
            }
        }
    }
    
}
